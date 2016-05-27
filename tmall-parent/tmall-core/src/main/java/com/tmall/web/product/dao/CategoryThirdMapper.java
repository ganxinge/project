package com.tmall.web.product.dao;

import java.util.List;

import com.tmall.core.generic.GenericDao;
import com.tmall.web.product.model.CategoryThird;
import com.tmall.web.product.qo.CategoryThirdQo;

/**
 * 
 * <p>title:商品三级分类dao</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:21:48
 */
public interface CategoryThirdMapper extends GenericDao<CategoryThird,String>{
    /*int deleteByPrimaryKey(String categoryThirdId);

    int insert(CategoryThird record);

    int insertSelective(CategoryThird record);

    CategoryThird selectByPrimaryKey(String categoryThirdId);

    int updateByPrimaryKeySelective(CategoryThird record);

    int updateByPrimaryKey(CategoryThird record);*/
	
	/**
	 * 商品三级分类分页查询
	 * @param categoryThirdQo
	 * @return
	 */
	public List<CategoryThird> selectCategoryThirdPage(CategoryThirdQo categoryThirdQo);
	
	/**
	 * 获取商品三级分类的条数
	 * @param categoryThirdQo
	 * @return
	 */
	public int getCount(CategoryThirdQo categoryThirdQo);
}