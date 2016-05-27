package com.tmall.web.product.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericDao;
import com.tmall.core.generic.GenericServiceImpl;
import com.tmall.web.product.dao.CategoryThirdMapper;
import com.tmall.web.product.model.CategoryThird;
import com.tmall.web.product.qo.CategoryThirdQo;
import com.tmall.web.product.service.CategoryThirdService;

/**
 * 
 * <p>title:商品三级分类</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午3:18:54
 */
@Service
public class CategoryThirdServiceImpl extends GenericServiceImpl<CategoryThird,String> implements CategoryThirdService{
	private static final Logger logger = Logger.getLogger(CategoryThirdServiceImpl.class);
	@Autowired
	private CategoryThirdMapper categoryThirdMapper; 
	/**
	 * 商品三级分类分页查询
	 */
	@Override
	public Pagination<CategoryThird> selectCategorySecondPage(
			CategoryThirdQo categoryThirdQo) {
		try{
			List<CategoryThird> categoryThirdPage = categoryThirdMapper.selectCategoryThirdPage(categoryThirdQo);
			int totalCount = categoryThirdMapper.getCount(categoryThirdQo);
			Pagination<CategoryThird> pagination = new Pagination<CategoryThird>();
			pagination.setResult(categoryThirdPage);
			pagination.setTotalCount(totalCount);
			return pagination;
		}catch(Exception e){
			logger.error("商品三级分类分页查询service异常"+e);
			throw new RuntimeException("商品三级分类分页查询service异常");
		}
	}

	@Override
	public GenericDao<CategoryThird, String> getDao() {
		return categoryThirdMapper;
	}

}
