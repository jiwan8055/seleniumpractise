package com.TestNg;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups="Regression Testing")
	public void m() {
		System.out.println("m method");
	}
	@Test(groups="Smoke Testing")
	public void m1() {
		System.out.println("m1 method");
	}
	@Test(groups="Regression Testing")
	public void m2() {
		System.out.println("m2 method");
	}
	@Test(groups="Smoke Testing")
	public void m3() {
		System.out.println("m3 method");
	}




}
