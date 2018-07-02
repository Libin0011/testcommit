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
		//return "redirect:/redirect.jsp";//�ض���ĳ��jsp����htmlҳ��
	return  "redirect:testMav";//�ض���ĳ��handler
	}
	
	
	@RequestMapping("/testForward")
	public  String  testForward()
	{
		System.out.println("testForward....");
		//return "forward:/WEB-INF/jsps/forward.jsp";//ת����ĳ��jsp����htmlҳ��
	return  "forward:testMav";//ת����ĳ��handler
	}
	
}
