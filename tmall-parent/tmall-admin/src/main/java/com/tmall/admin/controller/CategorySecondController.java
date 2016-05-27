package com.tmall.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmall.admin.common.TryCatchMessage;
import com.tmall.core.entity.Pagination;
import com.tmall.web.product.model.CategorySecond;
import com.tmall.web.product.qo.CategorySecondQo;
import com.tmall.web.product.service.CategorySecondService;

/**
 * 
 * <p>title:商品二级分类</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午3:44:20
 */
@Controller
@RequestMapping("/categorySecond")
public class CategorySecondController {
	private final static Logger logger = Logger.getLogger(CategorySecondController.class);
	
	@Autowired
	private CategorySecondService categorySecondService;
	
	/**
	 * 分页查询商品二级分类
	 * @param response
	 * @param categorySecondQo
	 */
	@RequestMapping("/select")
	@ResponseBody
	public void selectCategorySecond(HttpServletResponse response,CategorySecondQo categorySecondQo){
		try{
			Pagination<CategorySecond> categorySecondPage = categorySecondService.selectCategorySecondPage(categorySecondQo);
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> objectMap = new HashMap<String, Object>();
			map.put("rows", categorySecondPage);
		    objectMap.put("data", map);
		    TryCatchMessage.tryCatchSearch(response,objectMap);
		}catch(Exception e){
			logger.error("查询商品二级分类异常"+e);
			throw new RuntimeException("查询商品二级分类异常");
		}
	}
	
}
