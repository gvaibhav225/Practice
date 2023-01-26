package com.example.springbootstart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value=UserAlreadyExistsException.class)
	public ResponseEntity<String> UserAlreadyExistsException(UserAlreadyExistsException UserAlreadyExistsException){
		return new ResponseEntity<String>("user already exists", HttpStatus.CONFLICT);
	}
	
}
