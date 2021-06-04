package com.cts.springmvc.exception;

public class InValidJoiningDateException extends RuntimeException{

		
	private static final long serialVersionUID = 1L;
	
	public InValidJoiningDateException(String des){
		super(des);
	}
}
