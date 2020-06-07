package com.chinasoft.controller._03_urlParttern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/urlpattern")
public class Controller04 {

	@RequestMapping("/method01.do")
	public ModelAndView method01() {
		System.out.println("½øÀ´µÄurlpattren");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "urlpattern");
		mav.setViewName("/WEB-INF/jsps/urlpattern.jsp");
		//mav.setViewName("/WEB-INF/jsps/urlpattern.jsp");
		mav.setViewName("/urlpattern.jsp");
		return mav;
	}
}
