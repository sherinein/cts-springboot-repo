package com.cts.springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;
import com.cts.springmvc.exception.InValidJoiningDateException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InValidJoiningDateException.class)
	public ModelAndView handleInvalidJoiningException(Exception exception) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("global exception handler");
		modelAndView.setViewName("error");
		modelAndView.addObject("exception", exception);
		return modelAndView;

	}
	
	
	
	
}
