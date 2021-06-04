package com.cts.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.springmvc.model.User;
import com.cts.springmvc.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String showRegister(@ModelAttribute("user")User user) {
		System.out.println("show register called");
		return "register";
	}
	
	
	
}
