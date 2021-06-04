package com.cts.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class MyPathController {
	@GetMapping(path = "/mypath/{id}/{message}")
    public String myPathVariable(@PathVariable long id, 
        @PathVariable(name = "message") String message, ModelMap model) {
		model.addAttribute("message", message);
        return "success";
    }
}
