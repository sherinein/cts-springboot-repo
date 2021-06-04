package com.cts.springmvc.service;

import org.springframework.stereotype.Service;

import com.cts.springmvc.model.Emp;

@Service
public class RegisterService {

	public Emp register(Emp emp){
	String name=emp.getEmpName();
	return emp;
	}
}
