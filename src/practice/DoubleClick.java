package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement button=driver.findElement(By.id("double-click"));
		Actions act=new Actions(driver);
		act.doubleClick(button).build().perform();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();

	}

}
