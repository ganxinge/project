package com.tmall.web.product.dao;


import java.util.List;

import com.tmall.core.generic.GenericDao;
import com.tmall.web.product.model.Product;
import com.tmall.web.product.qo.ProductQo;

/**
 * 
 * <p>title:商品信息dao</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:19:49
 */
public interface ProductMapper extends GenericDao<Product,String>{
    /*int deleteByPrimaryKey(String productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKeyWithBLOBs(Product record);

    int updateByPrimaryKey(Product record);*/
    
    /**
     * 分页条件查询
     * @param productQo
     * @return
     */
    public List<Product> selectProductPage(ProductQo productQo);
    
    /**
     * 条件查询记录数
     * @param productQo
     * @return
     */
    public int getCount(ProductQo productQo);
    
}