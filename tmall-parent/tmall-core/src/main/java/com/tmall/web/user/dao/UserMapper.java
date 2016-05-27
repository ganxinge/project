package com.tmall.web.user.dao;

import org.apache.ibatis.annotations.Param;

import com.tmall.core.generic.GenericDao;
import com.tmall.web.user.model.User;

public interface UserMapper extends GenericDao<User, String>{
    /*int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);*/
	
	/**
	 * 用户认证
	 * @param user
	 * @return
	 */
	public User authentication(@Param("record") User user);
	
	/**
	 * 根据登录用户名获取用户信息
	 * @param loginName
	 * @return
	 */
	public User selectByLoginName(String loginName);
}