package com.cts.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cts.springmvc.model.Student;
import com.cts.springmvc.validate.CustomValidator;

@Controller
public class RegisterController {
	@Autowired
	private CustomValidator customvalidate;
	@RequestMapping("/")
	public String showIndexPage() {
		return "index";
	}
	@RequestMapping("/register")
	public String showRegisterPage(@ModelAttribute("student")Student student) {
		return "register";
	}
	@RequestMapping("/submitregister")
	public String validateRegisterPage(@ModelAttribute("student")Student student,BindingResult result) {
		customvalidate.validate(student, result);
		if(result.hasErrors()) {
			return "register";
		}else 
					
		return "success";
	}
	
}
