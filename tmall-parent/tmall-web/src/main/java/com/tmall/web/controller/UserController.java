package com.tmall.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class UserController {
	
	/*@RequestMapping(value="index")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView("/index");
		return mav;
	}*/
}
