package com.mypack.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowMessageWithoutViewController {

	@RequestMapping("/showMessage")
	public void showMessage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String message = request.getParameter("message");

		PrintWriter out = response.getWriter();
		out.println(message);
	}
}
