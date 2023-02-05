package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.TestNg.TestNgListener.class)
public class ListenerClassDemo {
	
	public static WebDriver driver;
	@Test(priority=0)
	public void NavUrl() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=1)
	public void SignIn() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertFalse(true);
		
	}
	@Test(priority=2,dependsOnMethods="SignIn")
	public void SingOut() {
		System.out.println("signout running");
		
	}

}
