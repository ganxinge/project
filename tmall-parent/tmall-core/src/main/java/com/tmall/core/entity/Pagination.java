package com.tmall.core.entity;

import java.util.List;

/**
 * 
 * <p>title:</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月20日 下午10:09:08
 */
public class Pagination<T> {

	private int totalCount;//总条数
	
	private List<T> result;//查询的结果数据
	
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}
	
}
