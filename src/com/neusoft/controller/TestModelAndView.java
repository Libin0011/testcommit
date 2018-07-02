package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestModelAndView {

	@RequestMapping("/testMav")
	public  ModelAndView  testMav()
	{
		System.out.println("testMav....");
		ModelAndView  mav=new ModelAndView();
		mav.addObject("name", "admin");//request.setAttribute("name","admin");
		mav.addObject("age", 21);
		//mav.addAllObjects(modelMap)
		mav.setViewName("success");//…Ë÷√¬ﬂº≠ ”Õº√˚
		return mav;
		
	}
}
