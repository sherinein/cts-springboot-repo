package com.cts.springmvc.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Emp {
	@NotNull(message="name is required")
	private String empName;
	@NotNull(message="joining Date is required")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date doj;
	@NotNull(message="phoneNo is required")
	//@Min(10,message="")
	private Long phoneNo;
	@NotNull(message="email is required")
	private String email;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
