package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		
		//Inner frame
		WebElement frame1 = driver.findElement(By.id("frame3"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("a")).click();
		
		//Handling Outer frame
		driver.navigate().refresh();
		WebElement outer = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(outer);
		driver.findElement(By.id("animals")).click();
		
		//Handling drop down
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}
