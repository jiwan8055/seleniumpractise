package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Handling Frame
		WebElement frame=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-100)");
		
		//Handling inner frame
		WebElement inner=driver.findElement(By.id("frame3"));
		driver.switchTo().frame(inner);
		driver.findElement(By.id("a")).click();
		
		//Handling Outter frame
		driver.navigate().refresh();
		WebElement outter=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(outter);
		driver.findElement(By.id("animals")).click();
		
		//action class
		Actions act =new Actions(driver);
		
		//Handling Drop-Down by Action class
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
