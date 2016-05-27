package com.tmall.admin.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tmall.core.utils.DateUtils;
import com.tmall.web.user.model.User;
import com.tmall.web.user.service.UserService;

/**
 * <p>title:公共的功能，用的的登录，首页，退出</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月22日 下午10:01:13
 */
@Controller
public class CommonController {
	private final static Logger logger = Logger.getLogger(CommonController.class);
	
	@Autowired
	private UserService userService;
	/**
     * 首页
     * 
     * @param request
     * @return
     */
    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        return "index";
    }
    /**
     * 首页右侧初始页面
     * @param request
     * @return
     */
    @RequestMapping("/dashboard")
    public String dashboard(HttpServletRequest request) {
        return "dashboard";
    }
    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/login")
    public String loginUI(){
    	return "login";
    }
    /**
     * 用户登录
     * @return
     */
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(String username,String password,HttpServletRequest request){
    	try{
    		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
    		//记录该令牌  
            token.setRememberMe(false);
            //subject权限对象  
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            //验证是否成功登录的方法  
            if (subject.isAuthenticated()) {
            	logger.info(username+"：登录成功"+DateUtils.formatDateTime(new Date()));
            	return "redirect:/index";
            }
            final User userInfo = userService.selectByLoginName(username);
            request.getSession().setAttribute("userInfo", userInfo);
    		return "login";
    	}catch(Exception e){
    		logger.error("登录出现异常"+e);
    		throw new RuntimeException("登录出现异常");
    	}
    }
    /**
     * 用户登出
     * @return
     */
    @RequestMapping(value="/logout")
    public String logout(){
    	try{
    		return "redirect:/index";
    	}catch(Exception e){
    		logger.error("用户退出异常"+e);
    		throw new RuntimeException("用户退出异常");
    	}
    }
    /**
     * 错误页面401
     * @return
     */
    @RequestMapping("/error/401")
    public String error401(){
    	return "error/401";
    }
    /**
     * 错误页面404
     * @return
     */
    @RequestMapping("/error/404")
    public String error404(){
    	return "error/404";
    }
    /**
     * 错误页面500
     * @return
     */
    @RequestMapping("/error/500")
    public String error500(){
    	return "error/500";
    }
}
