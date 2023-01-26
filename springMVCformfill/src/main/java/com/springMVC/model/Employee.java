package com.springMVC.model;


import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;



public class Employee {

	
	//for validating form first add hibernate validator dependency then write annotations with message to field you want to vaidate , in controller add a if condition, in form html file add error tag

	@Size(min=2, max=10, message="name should be of more than  1 character")
	private String myname;
	
	@NotNull(message="cant be empty")
	@Pattern(regexp="[a-zA-Z]{4}", message="enter male or female")
	String mygender;
	
	
	@Email(message="enter correct email")
	String myemail;
	
	@Size(min=10)
	private String mycontact;
	
	// more annotations :  @CreditCardNumber , @NotEmpty   @URL 
	
	@Min(value=7)
	@Max(value=99)
	int myage;

	@DateTimeFormat(pattern="MM/dd/yyyy")
	private String dob;

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getMyage() {
		return myage;
	}

	public void setMyage(int myage) {
		this.myage = myage;
	}

	public String getMycontact() {
		return mycontact;
	}

	public void setMycontact(String mycontact) {
		this.mycontact = mycontact;
	}

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public String getMygender() {
		return mygender;
	}

	public void setMygender(String mygender) {
		this.mygender = mygender;
	}
		

	public String getMyemail() {
		return myemail;
	}

	public void setMyemail(String myemail) {
		this.myemail = myemail;
	}

	

	

}
