package com.mypack.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.mypack.controller"})
public class AppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver ir = new InternalResourceViewResolver();
		
		ir.setPrefix("/WEB-INF/");
		ir.setSuffix(".jsp");
		return  ir;
		
	}
}
