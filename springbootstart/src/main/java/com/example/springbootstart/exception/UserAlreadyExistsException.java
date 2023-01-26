package com.example.springbootstart.exception;

public class UserAlreadyExistsException extends Exception{
	String str;
	public UserAlreadyExistsException(String str) {
		super();
		this.str=str;
	}

	public UserAlreadyExistsException() {
		super();
	}
}
