package com.cts.springmvc.validate;

import java.util.Set;


import javax.validation.metadata.BeanDescriptor;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cts.springmvc.model.Student;
@Component
public class CustomValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Student student=(Student)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName","error.userName","User Name cannot be blank");
		
		Long phoneNo=student.getPhoneNumber();
		
		String phoneNoStr=String.valueOf(phoneNo);
		
		if(!(phoneNoStr.length()==10)) {
			errors.rejectValue("phoneNumber", "error.phoneNumber", "Contact number should be 10 digit");
		}
			
	}

	
}
