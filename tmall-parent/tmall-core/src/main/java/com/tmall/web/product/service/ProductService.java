package com.tmall.web.product.service;


import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericService;
import com.tmall.web.product.model.Product;
import com.tmall.web.product.qo.ProductQo;

/**
 * 
 * <p>title:产品业务层的接口</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月22日 下午3:22:10
 */
public interface ProductService extends GenericService<Product,String>{
	
	/**
	 * 分页条件查询
	 * @param productQo
	 * @return
	 */
	public Pagination<Product> selectProductPage(ProductQo productQo);
	
}
