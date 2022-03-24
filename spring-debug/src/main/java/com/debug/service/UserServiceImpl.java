package com.debug.service;

import org.springframework.stereotype.Service;

@Service("UserServiceImpl")
public class UserServiceImpl implements  Userservice{
	@Override
	public void add() {
		System.out.println("================");
	}

	public String get(String name) {
		return name;
	}
}
