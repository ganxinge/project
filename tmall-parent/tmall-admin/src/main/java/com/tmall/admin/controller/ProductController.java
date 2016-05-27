package com.tmall.admin.controller;



import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmall.admin.common.TryCatchMessage;
import com.tmall.core.entity.Pagination;
import com.tmall.web.product.model.Product;
import com.tmall.web.product.qo.ProductQo;
import com.tmall.web.product.service.ProductService;

/**
 * 
 * <p>title:产品管理</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月22日 下午5:12:38
 */
@Controller
@RequestMapping("/product")
public class ProductController {
	
	private final static Logger logger = Logger.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	@RequestMapping("/query")
	public String selectProduct(){
		return "product/p_l";
	}
	/**
	 * 分页查询产品
	 * @param model
	 * @param qo
	 * @return
	 */
	@RequestMapping("/select")
	@ResponseBody
	public void selectProduct(@Valid ProductQo qo,BindingResult result,Model model,HttpServletResponse response){
		try{
			Pagination<Product> selectProductPage = productService.selectProductPage(qo);
		    TryCatchMessage.tryCatchSearch(response,selectProductPage);
			//model.addAttribute("ProductPage", selectProductPage);
			//return "product/product_list";
		}catch(Exception e){
			logger.error("分页查询出出现异常"+e);
			throw new RuntimeException("分页查询出出现异常");
		}
	}
	
	/**
	 * 查询产品详情
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/selectById")
	public void selectById(String id,Model model,HttpServletResponse response){
		try{
			Product product = productService.selectById(id);
			TryCatchMessage.tryCatchSearch(response,product);
			//model.addAttribute("product", product);
			//return "product/product_view";
		}catch(Exception e){
			logger.error("查询产品详情出现异常"+e);
			throw new RuntimeException("查询产品详情出现异常");
		}
	}
	
	/**
	 * 修改产品信息
	 * @param product
	 * @return
	 */
	@RequestMapping("update")
	public String updateProduct(BindingResult result,@Valid Product product){
		try{
			productService.update(product);
			logger.info("修改商品成功");
			return "redirect:/product/select";
		}catch(Exception e){
			logger.error("修改产品出现异常"+e);
			throw new RuntimeException("修改产品出现异常");
		}
	}
	
	/**
	 * 删除产品
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteById")
	public String deleteById(String id){
		try{
			productService.delete(id);
			logger.info("商品删除成功");
			return "redirect:/product/select";
		}catch(Exception e){
			logger.error("删除产品出现异常"+e);
			throw new RuntimeException("删除产品出现异常");
		}
	}
	/**
	 * 新增页面
	 * @return
	 */
	@RequestMapping("addUI")
	public String addUI(){
		return "product/product_add";
	}
	/**
	 * 新增产品
	 * @param product
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addProduct(BindingResult result,@Valid Product product){
		try{
			//TODO 错误参数的处理result.hasErrors();
			productService.insert(product);
			logger.info("新增商品成功");
			return "redirect:/product/select";
		}catch(Exception e){
			logger.error("新增产品出现异常"+e);
			throw new RuntimeException("新增产品出现异常");
		}
	}
}
