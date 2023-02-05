package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Prompt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(3000);
		
		//Enter the value by using alert
		driver.switchTo().alert().sendKeys("hi welcome here");
		Thread.sleep(3000);
		
		//Accept the values by using alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();

	}

}
