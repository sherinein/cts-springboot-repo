package com.cts.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.cts.springmvc.config.WebConfig;
import com.cts.springmvc.model.Emp;

@SpringBootApplication
//@ImportResource("spring-context.xml")
@Import(WebConfig.class)
public class SpringbootSpringmvcSample1Application {
	
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootSpringmvcSample1Application.class, args);
		Emp emp=context.getBean(Emp.class);
		System.out.println("Employee Name "+emp.getEmpName() +"Location "+emp.getLocation());
	}

}
