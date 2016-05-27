package com.tmall.web.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmall.core.generic.GenericDao;
import com.tmall.core.generic.GenericServiceImpl;
import com.tmall.web.user.dao.UserMapper;
import com.tmall.web.user.model.User;
import com.tmall.web.user.service.UserService;

/**
 * 
 * <p>title:用户管理service</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月26日 下午9:36:41
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, String> implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public GenericDao<User, String> getDao() {
		return userMapper;
	}
	/**
	 * 用户认证
	 */
	@Override
	public User authentication(User user) {
		return userMapper.authentication(user);
	}
	/**
	 * 根据登录用户名获取用户信息
	 */
	@Override
	public User selectByLoginName(String loginName) {
		return userMapper.selectByLoginName(loginName);
	}

}
