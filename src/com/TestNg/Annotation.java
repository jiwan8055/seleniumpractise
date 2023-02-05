package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeTest
	public void BT() {
		System.out.println("before test is running");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("before class is running");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("before method is running");
	}
	
	@Test
	public void testcase1() {
		System.out.println("first test case is running");
	}
	
	@Test
	public void testcase2() {
		System.out.println("second test case is running");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("after method is running");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("after class is running");
	}
}
