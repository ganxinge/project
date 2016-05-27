package com.tmall.web.product.dao;

import java.util.List;

import com.tmall.core.generic.GenericDao;
import com.tmall.web.product.model.CategoryOne;
import com.tmall.web.product.qo.CategoryOneQo;

/**
 * 
 * <p>title:商品一级分类dao</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:22:20
 */
public interface CategoryOneMapper extends GenericDao<CategoryOne,String>{
    /*int deleteByPrimaryKey(String categoryId);

    int insert(CategoryOne record);

    int insertSelective(CategoryOne record);

    CategoryOne selectByPrimaryKey(String categoryId);

    int updateByPrimaryKeySelective(CategoryOne record);

    int updateByPrimaryKey(CategoryOne record);*/
	
	/**
	 * 商品一级分类分页查询
	 * @param categoryOneQo
	 * @return
	 */
	public List<CategoryOne> selectCategoryOnePage(CategoryOneQo categoryOneQo);
	
	/**
	 * 获取商品一级分类的条数
	 * @param categoryOneQo
	 * @return
	 */
	public int getCount(CategoryOneQo categoryOneQo);
}