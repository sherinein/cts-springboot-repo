package com.cts.springmvc.model;

public class MyBean {
	private long id;
	private String message;
	public MyBean(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
