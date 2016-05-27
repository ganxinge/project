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
import com.tmall.web.product.model.CategoryOne;
import com.tmall.web.product.qo.CategoryOneQo;
import com.tmall.web.product.service.CategoryOneService;

/**
 * 
 * <p>title:商品一级分类管理</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午3:24:45
 */
@Controller
@RequestMapping("/categoryOne")
public class CategoryOneController {
	private final static Logger logger = Logger.getLogger(CategoryOneController.class);
	@Autowired
	private CategoryOneService categoryOneService;
	
	/**
	 * 分页查询商品一级分类
	 * @param response
	 * @param categoryOneQo
	 */
	@RequestMapping("/select")
	@ResponseBody
	public void selectCategoryOne(HttpServletResponse response,CategoryOneQo categoryOneQo){
		try{
			Pagination<CategoryOne> categoryOnePage = categoryOneService.selectCategoryOnePage(categoryOneQo);
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> objectMap = new HashMap<String, Object>();
			map.put("rows", categoryOnePage);
		    objectMap.put("data", map);
		    TryCatchMessage.tryCatchSearch(response,objectMap);
		}catch(Exception e){
			logger.error("查询商品一级分类异常"+e);
			throw new RuntimeException("查询商品一级分类异常");
		}
	}
}
