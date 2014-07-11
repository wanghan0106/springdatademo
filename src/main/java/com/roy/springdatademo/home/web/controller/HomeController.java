package com.roy.springdatademo.home.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
}
