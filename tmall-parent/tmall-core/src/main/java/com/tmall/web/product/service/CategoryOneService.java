package com.tmall.web.product.service;

import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericService;
import com.tmall.web.product.model.CategoryOne;
import com.tmall.web.product.qo.CategoryOneQo;

/**
 * 
 * <p>title:商品一级分类</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:26:16
 */
public interface CategoryOneService extends GenericService<CategoryOne,String>{
	/**
	 * 商品一级分类分页查询
	 * @param categoryOneQo
	 * @return
	 */
	public Pagination<CategoryOne> selectCategoryOnePage(CategoryOneQo categoryOneQo);
}
