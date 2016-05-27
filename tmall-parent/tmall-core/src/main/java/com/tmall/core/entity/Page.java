package com.tmall.core.entity;

import java.io.Serializable;
import java.util.Map;


/**
 * 
 * <p>title:分页查询的参数</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月22日 下午3:31:21
 */
public class Page implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5678136673948688749L;

	private int pageNo = 1;//页码
    
    private int pageSize = 10;//每页的条数
    
    private Map<String,Object> params;//查询条件参数
    

	public int getPageNo() {
		return pageNo;
	}

	/**
	 * 防止用户传入的负值页码
	 * @param pageNo
	 */
	public void setPageNo(int pageNo) {
		if(pageNo<=0){
			this.pageNo = 1;
		}
		this.pageNo = (pageNo-1)*pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}
	
	/**
	 * 如果pageSize大于20则pageSize都为20，
	 * 防止出现sql注入，导致内存溢出
	 * @param pageSize
	 */
	public void setPageSize(int pageSize) {
		if(pageSize>20){
			this.pageSize = 20;
		}
		this.pageSize = pageSize;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	
}
