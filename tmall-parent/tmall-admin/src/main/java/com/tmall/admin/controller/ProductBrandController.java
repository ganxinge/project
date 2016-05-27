package com.tmall.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmall.admin.common.TryCatchMessage;
import com.tmall.core.entity.Pagination;
import com.tmall.web.product.model.ProductBrand;
import com.tmall.web.product.qo.ProductBrandQo;
import com.tmall.web.product.service.ProductBrandService;

/**
 * 
 * <p>title:商品品牌管理</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月22日 下午10:59:16
 */
@Controller
@RequestMapping("/productBrand")
public class ProductBrandController {
	private final static Logger logger = Logger.getLogger(ProductBrandController.class);
	@Autowired
	private ProductBrandService productBrandService;
	
	/**
	 * 分页查询商品品牌
	 * @param model
	 * @param productBrandQo
	 * @return
	 */
	@RequestMapping("/select")
	@ResponseBody
	public void selectProductBrand(Model model,ProductBrandQo productBrandQo,HttpServletResponse response){
		try{
			Pagination<ProductBrand> productBrandPage = productBrandService.selectProductBrandPage(productBrandQo);
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> objectMap = new HashMap<String, Object>();
			map.put("rows", productBrandPage);
		    objectMap.put("data", map);
		    TryCatchMessage.tryCatchSearch(response,objectMap);
//			model.addAttribute("productBrandList", productBrandPage);
//			return "product/product_brand_list";
		}catch(Exception e){
			logger.error("商品品牌查询异常"+e);
			throw new RuntimeException("商品品牌查询异常");
		}
	}
}
