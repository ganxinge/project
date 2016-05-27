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
import com.tmall.web.product.model.CategoryThird;
import com.tmall.web.product.qo.CategoryThirdQo;
import com.tmall.web.product.service.CategoryThirdService;

/**
 * 
 * <p>title:商品三级分类</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午3:44:07
 */
@Controller
@RequestMapping("/categoryThird")
public class CategoryThirdController {
	private final static Logger logger = Logger.getLogger(CategoryThirdController.class);
	
	@Autowired
	private CategoryThirdService categoryThirdService;
	
	/**
	 * 分页查询商品三级分类
	 * @param response
	 * @param categoryThirdQo
	 */
	@RequestMapping("/select")
	@ResponseBody
	public void selectCategoryThird(HttpServletResponse response,CategoryThirdQo categoryThirdQo){
		try{
			Pagination<CategoryThird> categorySecondPage = categoryThirdService.selectCategorySecondPage(categoryThirdQo);
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> objectMap = new HashMap<String, Object>();
			map.put("rows", categorySecondPage);
		    objectMap.put("data", map);
		    TryCatchMessage.tryCatchSearch(response,objectMap);
		}catch(Exception e){
			logger.error("查询商品三级分类异常"+e);
			throw new RuntimeException("查询商品三级分类异常");
		}
		
	}
}
