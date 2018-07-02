package com.neusoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestVoid {

	@RequestMapping("/testVoid")
	public  void testVoid(HttpServletRequest request,HttpServletResponse  response,HttpSession session) throws ServletException, IOException
	{
		request.setAttribute("name", "zhangSan");
		session.setAttribute("age", 33);
		
		//request.getRequestDispatcher("WEB-INF/jsps/voidpage.jsp").forward(request, response);
		
		//response.sendRedirect("redirect.jsp");
		response.getWriter().println("Hello SpringMVC!");
	}
}
