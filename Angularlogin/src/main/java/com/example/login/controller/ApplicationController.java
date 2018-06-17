package com.example.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
	
	@ResponseBody
	@RequestMapping("/home")
	public String home()
	{
		return "This is Home page";
	}
	
	@RequestMapping("/welcome")
	public String Welcome()
	{
		return "welcomepage";
	}
}
