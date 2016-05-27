package com.tmall.web.product.service.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericDao;
import com.tmall.core.generic.GenericServiceImpl;
import com.tmall.web.product.dao.ProductMapper;
import com.tmall.web.product.model.Product;
import com.tmall.web.product.qo.ProductQo;
import com.tmall.web.product.service.ProductService;

/**
 * 
 * <p>title:产品的业务实现</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月22日 下午4:09:05
 */
@Service
public class ProductServiceImpl extends GenericServiceImpl<Product,String> implements ProductService{

	private static final Logger logger = Logger.getLogger(ProductServiceImpl.class);
	@Autowired
	private ProductMapper productMapper;
	@Override
	public GenericDao<Product, String> getDao() {
		return productMapper;
	}
	/**
	 * 分页查询产品
	 */
	public Pagination<Product> selectProductPage(ProductQo productQo) {
		try{
			List<Product> productPage = productMapper.selectProductPage(productQo);//分页查询出的数据
			int totalCount = productMapper.getCount(productQo);//分页查询的总条数 
			Pagination<Product> pagination = new Pagination<Product>();
			pagination.setResult(productPage);
			pagination.setTotalCount(totalCount);
			return pagination;
		}catch(Exception e){
			logger.error("分页查询service层出现异常"+e);
			throw new RuntimeException();
		}
	}
	

}
