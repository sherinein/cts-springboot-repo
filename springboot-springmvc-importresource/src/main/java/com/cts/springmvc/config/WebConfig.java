package com.cts.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.springmvc.model.Emp;
@Configuration
public class WebConfig {
	@Bean
	public Emp getEmp() {
		Emp emp=new Emp();
		emp.setEmpName("Sherine");
		emp.setLocation("Chennai");
		return emp;
	}
}
