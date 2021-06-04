package com.cts.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.springmvc.model.Ticket;
import com.cts.springmvc.service.TicketService;

@Controller
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@RequestMapping(value="/showpage", method=RequestMethod.GET)
	public String showPage(@ModelAttribute("ticket")Ticket ticket) {
		System.out.println("showpage");
		return "showpage";
		
	}
	@RequestMapping(value="/showpage/calculateCost",method=RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("ticket")Ticket ticket,ModelMap model,BindingResult result) {
		double r1=0.0d;
		if(result.hasErrors()) {
			return "showpage";
		}else {
			r1=ticketService.calculateTotalCost(ticket);
			model.addAttribute("cost", r1);
			return "result";
		}
		
	}
	
	@ModelAttribute("circleList")
	public Map<String,String> buildState(){
		Map<String,String> circleList=new HashMap<String,String>();
		circleList.put("250","Queen");
		circleList.put("150","King");
		return circleList;
	}
	
	
}
