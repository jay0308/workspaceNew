package com.mypack.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamImplementaionController {

	@RequestMapping("/showmessage")
	public void showMessage(@RequestParam("message")String message,HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		PrintWriter out=response.getWriter();
		out.println(message);
	}
}
