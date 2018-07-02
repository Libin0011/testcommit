package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestString {

	@RequestMapping("/testStr")
	public  String testStr(Model  model)
	{
		System.out.println("testStr.....");
		model.addAttribute("name", "guest");//request.setAttribute("name","guest");
		model.addAttribute("age",32);
		return "success";
	}
	
	@RequestMapping("/testRedirect")
	public  String  testRedirect()
	{
		System.out.println("testRedirect....");
		//return "redirect:/redirect.jsp";//重定向到某个jsp或者html页面
	return  "redirect:testMav";//重定向到某个handler
	}
	
	
	@RequestMapping("/testForward")
	public  String  testForward()
	{
		System.out.println("testForward....");
		//return "forward:/WEB-INF/jsps/forward.jsp";//转发到某个jsp或者html页面
	return  "forward:testMav";//转发到某个handler
	}
	
}
