package com.debug.service;

public class UserServiceImpl implements  Userservice{
	@Override
	public void add() {
		System.out.println("================");
	}

	@Override
	public String get(String name) {
		return name;
	}
}
