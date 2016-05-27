package com.tmall.web.product.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericDao;
import com.tmall.core.generic.GenericServiceImpl;
import com.tmall.web.product.dao.CategoryOneMapper;
import com.tmall.web.product.model.CategoryOne;
import com.tmall.web.product.qo.CategoryOneQo;
import com.tmall.web.product.service.CategoryOneService;

/**
 * 
 * <p>title:商品一级分类service</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:36:19
 */
@Service
public class CategoryOneServiceImpl extends GenericServiceImpl<CategoryOne,String> implements CategoryOneService{
	private static final Logger logger = Logger.getLogger(CategoryOneServiceImpl.class);
	@Autowired
	private CategoryOneMapper categoryOneMapper;
	@Override
	public Pagination<CategoryOne> selectCategoryOnePage(
			CategoryOneQo categoryOneQo) {
		try{
			List<CategoryOne> categoryOnePage = categoryOneMapper.selectCategoryOnePage(categoryOneQo);
			int totalCount = categoryOneMapper.getCount(categoryOneQo);
			Pagination<CategoryOne> pagination = new Pagination<CategoryOne>();
			pagination.setResult(categoryOnePage);
			pagination.setTotalCount(totalCount);
			return pagination;
		}catch(Exception e){
			logger.error("商品一级分类分页查询service异常"+e);
			throw new RuntimeException("商品一级分类分页查询service异常");
		}
	}

	@Override
	public GenericDao<CategoryOne, String> getDao() {
		return categoryOneMapper;
	}

}
