package com.TestNg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Teststarted****");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Succesfully run%%%%%");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumPractice\\snapshot\\fail1.png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			
			//e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Skipped");
		
	}

}
