package com.example.springbootpractice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value= userexistsexception.class)
	public ResponseEntity<String> userexistsexception(userexistsexception userexistsexception){
		return new  ResponseEntity<String>("user already exists", HttpStatus.CONFLICT);
	}
	
	
	@ExceptionHandler(value= userdoesnotexistsexception.class)
	public ResponseEntity<String> userdoesnotexistsexception(userdoesnotexistsexception userdoesnotexistsexception){
		return new  ResponseEntity<String>("user does not exists", HttpStatus.CONFLICT);
	}
}
