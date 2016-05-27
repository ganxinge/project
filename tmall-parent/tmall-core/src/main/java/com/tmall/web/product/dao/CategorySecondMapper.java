package com.tmall.web.product.dao;

import java.util.List;

import com.tmall.core.generic.GenericDao;
import com.tmall.web.product.model.CategorySecond;
import com.tmall.web.product.qo.CategorySecondQo;

/**
 * 
 * <p>title:商品二级分类dao</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:22:06
 */
public interface CategorySecondMapper extends GenericDao<CategorySecond,String>{
    /*int deleteByPrimaryKey(String categorySecondId);

    int insert(CategorySecond record);

    int insertSelective(CategorySecond record);

    CategorySecond selectByPrimaryKey(String categorySecondId);

    int updateByPrimaryKeySelective(CategorySecond record);

    int updateByPrimaryKey(CategorySecond record);*/
	
	/**
	 * 商品二级分类分页查询
	 * @param categorySecondQo
	 * @return
	 */
	public List<CategorySecond> selectCategorySecondPage(CategorySecondQo categorySecondQo);
	
	/**
	 * 获取商品二级分类的条数
	 * @param categorySecondQo
	 * @return
	 */
	public int getCount(CategorySecondQo categorySecondQo);
}