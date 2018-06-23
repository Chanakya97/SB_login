package com.example.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.login.model.User;
import com.example.login.services.UserService;

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
	
	@Autowired
	private UserService userService;
	
	@PostMapping("insert")
	public String insertUser(@ModelAttribute User user,BindingResult bindingResult,HttpServletRequest request) {
		userService.saveMyUser(user);
		return "welcomepage";
	}
}
