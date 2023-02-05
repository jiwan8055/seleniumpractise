package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WaitsSelenium {
	
	public WebDriver driver;
	
	@BeforeClass
	public void Navigate() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	}
	
	@Test
	public void method1() {
		WebElement button=driver.findElement(By.id("alert"));
		button.click();
		WebDriverWait wa=new WebDriverWait(driver,11);
		wa.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("populate-text")).click();
		driver.findElement(By.id("enable-button")).click();
		driver.findElement(By.id("display-other-button")).click();
		driver.findElement(By.id("checkbox")).click();
		driver.findElement(By.id("ch")).click();
	}

}
