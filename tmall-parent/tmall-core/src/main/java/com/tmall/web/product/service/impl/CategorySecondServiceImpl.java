package com.tmall.web.product.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmall.core.entity.Pagination;
import com.tmall.core.generic.GenericDao;
import com.tmall.core.generic.GenericServiceImpl;
import com.tmall.web.product.dao.CategorySecondMapper;
import com.tmall.web.product.model.CategorySecond;
import com.tmall.web.product.qo.CategorySecondQo;
import com.tmall.web.product.service.CategorySecondService;

/**
 * 
 * <p>title:商品二级分类</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午3:05:36
 */
@Service
public class CategorySecondServiceImpl extends GenericServiceImpl<CategorySecond,String> implements CategorySecondService{
	private static final Logger logger = Logger.getLogger(CategorySecondServiceImpl.class);
	@Autowired
	private CategorySecondMapper categroySecondMapper;
	
	/**
	 * 商品二级分类分页查询
	 */
	@Override
	public Pagination<CategorySecond> selectCategorySecondPage(
			CategorySecondQo categorySecondQo) {
		try{
			List<CategorySecond> categorySecondPage = categroySecondMapper.selectCategorySecondPage(categorySecondQo);
			int totalCount = categroySecondMapper.getCount(categorySecondQo);
			Pagination<CategorySecond> pagination = new Pagination<CategorySecond>();
			pagination.setResult(categorySecondPage);
			pagination.setTotalCount(totalCount);
			return pagination;
		}catch(Exception e){
			logger.error("商品二级分类分页查询service异常"+e);
			throw new RuntimeException("商品二级分类分页查询service异常");
		}
	}

	@Override
	public GenericDao<CategorySecond, String> getDao() {
		return categroySecondMapper;
	}

}
