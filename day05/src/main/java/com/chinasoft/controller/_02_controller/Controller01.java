package com.chinasoft.controller._02_controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Controller01 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("controller 的第一种实现方式。。。。");
		
		ModelAndView mav = new ModelAndView();
		//绑定数据准备转发
		mav.addObject("user", "张三");
		//转发页面
		mav.setViewName("hello.jsp");
		return mav;
	}

}
