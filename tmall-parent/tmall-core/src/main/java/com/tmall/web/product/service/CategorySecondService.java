package com.tmall.web.product.service;

import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericService;
import com.tmall.web.product.model.CategorySecond;
import com.tmall.web.product.qo.CategorySecondQo;

/**
 * 
 * <p>title:商品二级分类</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午3:03:07
 */
public interface CategorySecondService extends GenericService<CategorySecond,String>{
	
	/**
	 * 商品二级分类分页查询
	 * @param categorySecondQo
	 * @return
	 */
	public Pagination<CategorySecond> selectCategorySecondPage(CategorySecondQo categorySecondQo);
}
