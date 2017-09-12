package com.mypack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		int sum = number1 + number2;
		int subtraction = number1 - number2;

		ModelAndView m = new ModelAndView();
		m.setViewName("showSum");
		m.addObject("sum", sum);
		m.addObject("subtraction", subtraction);

		return m;
	}

}
