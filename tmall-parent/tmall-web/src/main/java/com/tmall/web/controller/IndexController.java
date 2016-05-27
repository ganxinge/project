package com.tmall.web.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 首页，用户的登录，登出，用户的注册
 * @author 甘新革
 *
 */
@Controller
@RequestMapping(value="/")
public class IndexController {
	
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping(value="/index")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView("/index");
		return mav;
	}
	/**
	 * 登录
	 * @return
	 */
	@RequestMapping(value="/login")
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView("/login");
		return mav;
	}
	/**
	 * 用户登出
	 * @return
	 */
	@RequestMapping(value="/logout")
	public ModelAndView logout(){
		ModelAndView mav = new ModelAndView("/index");
		return mav;
	}
	/**
	 * 跳转到注册页面
	 * @return
	 */
	@RequestMapping(value="/register")
	public ModelAndView resgister(){
		ModelAndView mav = new ModelAndView("/register");
		return mav;
	}
	
}
