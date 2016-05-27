package com.tmall.web.product.service;

import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericService;
import com.tmall.web.product.model.ProductBrand;
import com.tmall.web.product.qo.ProductBrandQo;

/**
 * 
 * <p>title:商品品牌</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月22日 下午10:37:06
 */
public interface ProductBrandService extends GenericService<ProductBrand,String>{
	/**
	 * 分页查询商品品牌
	 * @param productBrandQo
	 * @return
	 */
	public Pagination<ProductBrand> selectProductBrandPage(ProductBrandQo productBrandQo); 
}
