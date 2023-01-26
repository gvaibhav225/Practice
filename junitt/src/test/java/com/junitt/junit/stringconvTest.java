package com.junitt.junit;

import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.*;



class stringconvTest {
	stringconv sc;
	@BeforeEach
	public void setUp() {
		sc=new stringconv();
	}
	@BeforeAll
	public static void setUpOnce() {
		System.out.println("it will come before all test cases similarly there are function as aftereach/all");
	}
	
	@Test
	public void testconcat() {
	
		String result=sc.concat("hello", "world");
		assertEquals("helloworld",result);
	}
	
	@Test
	public void testconcatnotnull() {
		String result=sc.concat("hello", "world");
		assertNotNull(result);
	}
	@ParameterizedTest
	@ValueSource(doubles = {2,4,6})
	public void testifeven(double number) {
		boolean result=sc.ifeven(number);
		assertTrue(result);
	}
	
	
	@Test
	public void testm() {
		assumeFalse(10>0);
		fail("not");
		
	}

}
