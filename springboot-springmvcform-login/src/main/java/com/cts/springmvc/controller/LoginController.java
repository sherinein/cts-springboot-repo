package com.cts.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cts.springmvc.model.User;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String showIndexPage() {
		return "index";
	}
	@RequestMapping("/login")
	public String showLoginPage(@ModelAttribute("user")User user) {
		return "login";
	}
	@RequestMapping("/submitlogin")
	public String validateRegisterPage(@ModelAttribute("user")User user,BindingResult result) {
	
		if(result.hasErrors()) {
			return "login";
		}else 
					
		return "success";
	}
}
