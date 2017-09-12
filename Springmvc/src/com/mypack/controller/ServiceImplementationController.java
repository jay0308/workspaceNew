package com.mypack.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.services.AddService;

@Controller
public class ServiceImplementationController {
	
	@RequestMapping("/addThroughService")
	public void add(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		AddService addService=new AddService();
		int sum = addService.add(2,4);
		
		PrintWriter out=response.getWriter();
		out.println(sum);
	}
}
