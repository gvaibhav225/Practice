package com.example.springbootpractice.Exception;

public class userdoesnotexistsexception extends Exception{
String str;

public userdoesnotexistsexception(String str) {
	super();
	this.str = str;
}

public userdoesnotexistsexception() {
	super();
}

}
