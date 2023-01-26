package com.example.springbootpractice.Exception;

public class userexistsexception extends Exception {
String str;

public userexistsexception(String str) {
	super();
	this.str = str;
}

public userexistsexception() {
	super();
}

}
