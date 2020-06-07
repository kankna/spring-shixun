package com.chinasoft.controller._02_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller03 {

	@RequestMapping("/controller03.do")
	public  ModelAndView  method03() {
		System.out.println("这个是controller的第三种实现方式。。。");
		ModelAndView modelAndView = new ModelAndView();
		ModelAndView mav = new ModelAndView();
		//绑定数据准备转发
		mav.addObject("user", "张三");
		//转发页面
		mav.setViewName("hello.jsp");
		
		return mav;
		
	}
}
