package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleHavor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement havor=driver.findElement(By.id("sub-menu"));
		
		Actions act=new Actions(driver);
		act.moveToElement(havor).build().perform();
		
		driver.findElement(By.id("link2")).click();
		
		driver.findElement(By.name("q")).sendKeys("facebook.com");
		act.sendKeys(Keys.ENTER).build().perform();
		driver.navigate().back();
		
		
		
		Thread.sleep(4000);
		driver.close();

	}

}
