package com.tmall.web.product.service;

import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericService;
import com.tmall.web.product.model.CategoryThird;
import com.tmall.web.product.qo.CategoryThirdQo;

/**
 * 
 * <p>title:商品三级分类</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午3:16:37
 */
public interface CategoryThirdService extends GenericService<CategoryThird,String>{
	
	/**
	 * 商品二级分类分页查询
	 * @param categoryThirdQo
	 * @return
	 */
	public Pagination<CategoryThird> selectCategorySecondPage(CategoryThirdQo categoryThirdQo);
}
