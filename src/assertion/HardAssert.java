package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssert {
	
	public WebDriver driver;
	
	@BeforeClass
	public void Navigate() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 driver.manage().window().maximize();
		 
	}
	
	@Test
	public void hardassert() {
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Google");
		
		System.out.println("After assert statement");
		
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
