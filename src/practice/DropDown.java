package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement drop=driver.findElement(By.xpath("//select[@id='first']"));
		drop.click();
		Thread.sleep(3000);
		// Handline dropdown by using select class
		Select sel = new Select(drop); 
		//sel.selectByVisibleText("Iphone");
		sel.selectByIndex(3);
		
		//handling dropdown by using Action class
		
		WebElement drop2=driver.findElement(By.xpath("//select[@id='animals']"));
		drop2.click();
		Thread.sleep(3000);
		Select sel1=new Select(drop2);
		sel1.selectByIndex(1);
		/*Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();*/
		

	}

}
