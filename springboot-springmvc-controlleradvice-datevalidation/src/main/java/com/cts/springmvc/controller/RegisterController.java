package com.cts.springmvc.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.springmvc.exception.InValidJoiningDateException;
import com.cts.springmvc.model.Emp;
import com.cts.springmvc.service.RegisterService;

@Controller
public class RegisterController {
	@Autowired
	private RegisterService registerService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		CustomDateEditor joiningDateEditor = new CustomDateEditor(dateFormat, true);
		dataBinder.registerCustomEditor(Date.class, joiningDateEditor);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	
	@GetMapping("/")
	public ModelAndView show() {
		Emp emp = new Emp();
		ModelAndView modelAndView = new ModelAndView("register");
		modelAndView.addObject("emp", emp);
		return modelAndView;
	}
	
	@PostMapping("/submitregister")
	public String checkStatus(@Valid @ModelAttribute("emp") Emp emp,BindingResult result, Model model) {

		String view = null;
		///System.out.println("Joining date"+emp.getDoj());
		Date joiningdate=emp.getDoj();
		
		if (result.hasErrors()) {
			view = "register";

		} else {
			if (joiningdate.compareTo(new Date()) > 0) {
				System.out.println("hello");
				view = "error";
				throw new InValidJoiningDateException("Invalid date");

			} else {
				emp=registerService.register(emp);
				model.addAttribute("emp", emp);
				view = "success";

			}
			
		}return view;
	}
}
	

	
	
	

