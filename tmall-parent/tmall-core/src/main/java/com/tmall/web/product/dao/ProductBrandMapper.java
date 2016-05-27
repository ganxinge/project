package com.tmall.web.product.dao;

import java.util.List;

import com.tmall.core.generic.GenericDao;
import com.tmall.web.product.model.ProductBrand;
import com.tmall.web.product.qo.ProductBrandQo;

/**
 * 
 * <p>title:商品品牌dao</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:20:18
 */
public interface ProductBrandMapper extends GenericDao<ProductBrand,String>{
    /*int deleteByPrimaryKey(String brandId);

    int insert(ProductBrand record);

    int insertSelective(ProductBrand record);

    ProductBrand selectByPrimaryKey(String brandId);

    int updateByPrimaryKeySelective(ProductBrand record);

    int updateByPrimaryKey(ProductBrand record);*/
	/**
	 * 产品品牌分页条件查询
	 * @param productBrandQo
	 * @return
	 */
	public List<ProductBrand> selectProductBrandPage(ProductBrandQo productBrandQo);
	/**
	 * 产品品牌条件查询记录
	 * @param productBrandQo
	 * @return
	 */
	public int getCount(ProductBrandQo productBrandQo);
}