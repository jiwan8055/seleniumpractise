package com.TestNg;

import org.testng.annotations.Test;

public class FirstTestNGPgm {
	
	@Test(groups="Smoke Testing")
	public void a(){
		System.out.println("a is running");
	}
	
	@Test
	public void b() {
		System.out.println("b is running");
	}
	
	@Test(groups="Regression Testing")
	public void c() {
		//System.out.println(10/0);
		System.out.println("c is running");
	}
		
    @Test(groups="Smoke Testing")
	public void d() {
			
			System.out.println("d is running");
	}

}
