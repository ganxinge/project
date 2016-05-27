package com.tmall.web.user.service;

import com.tmall.core.generic.GenericService;
import com.tmall.web.user.model.User;

public interface UserService extends GenericService<User, String>{
	
	/**
	 * 用户认证
	 * @param user
	 * @return
	 */
	public User authentication(User user);
	
	/**
	 * 根据用户获取用户信息
	 * @param loginName
	 * @return
	 */
	public User selectByLoginName(String loginName);
}
