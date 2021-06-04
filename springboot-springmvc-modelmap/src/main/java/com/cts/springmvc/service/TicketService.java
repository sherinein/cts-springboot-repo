package com.cts.springmvc.service;

import org.springframework.stereotype.Service;

import com.cts.springmvc.model.Ticket;

@Service
public class TicketService {
	public double calculateTotalCost(Ticket ticket) {
		double result = 0.0d;

		//int tickets = ticket.getNoOfTickets();
		result = 3 * 300.0;
		return result;
	}
}
