package com.mypack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mypack.services.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int x, @RequestParam("t2") int y , HttpServletRequest request, HttpServletResponse response) {
//		int x= Integer.parseInt(request.getParameter("t1"));
//		int y = Integer.parseInt(request.getParameter("t2"));
		
		AddService as = new AddService();
		int z = as.doAddition(x, y);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", z);
		return mv;
		
//		PrintWriter out = response.getWriter();
//		out.println(z);			//something like api
	}
}
