package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.TestNg.TestNgListener.class)
public class ListenerClass {

	@Test(priority=0)
	public void Navigate() {
		System.out.println("navigate to URL");
	}
	
	@Test(priority=1)
	public void SignIn() {
		System.out.println("signin is running");
		Assert.fail();
	}
	
	@Test(priority=2,dependsOnMethods="SignIn")
	public void SingOut() {
		System.out.println("signout is runnig");
	}
}
