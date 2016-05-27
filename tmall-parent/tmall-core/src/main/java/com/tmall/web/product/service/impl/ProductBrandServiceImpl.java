package com.tmall.web.product.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericDao;
import com.tmall.core.generic.GenericServiceImpl;
import com.tmall.web.product.dao.ProductBrandMapper;
import com.tmall.web.product.model.ProductBrand;
import com.tmall.web.product.qo.ProductBrandQo;
import com.tmall.web.product.service.ProductBrandService;

/**
 * 
 * <p>title:产品品牌业务实现</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月22日 下午10:41:19
 */
@Service
public class ProductBrandServiceImpl extends GenericServiceImpl<ProductBrand,String> implements ProductBrandService{
	private static final Logger logger = Logger.getLogger(ProductBrandServiceImpl.class);
	@Autowired
	private ProductBrandMapper productBrandMapper;
	@Override
	public GenericDao<ProductBrand, String> getDao() {
		return productBrandMapper;
	}
	/**
	 * 分页查询产品品牌
	 */
	public Pagination<ProductBrand> selectProductBrandPage(
			ProductBrandQo productBrandQo) {
		try{
			List<ProductBrand> productBrandPage = productBrandMapper.selectProductBrandPage(productBrandQo);
			int totalCount = productBrandMapper.getCount(productBrandQo);
			Pagination<ProductBrand> pagination = new Pagination<ProductBrand>();
			pagination.setResult(productBrandPage);
			pagination.setTotalCount(totalCount);
			return pagination;
		}catch(Exception e){
			logger.error("分页查询产品品牌异常"+e);
			throw new RuntimeException("分页查询产品品牌异常");
		}
		
	}

	
	
}
