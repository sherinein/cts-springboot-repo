package com.cts.springmvc.service;

import org.springframework.stereotype.Service;

import com.cts.springmvc.model.User;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public void add(User user) {
		System.out.println("User added successfully");
		
	}

}
