package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void initialisation() {
		Reporter.log("setup start");
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("setup end");
	}
	
	@Test(priority=1)
	public void navigate() {
		Reporter.log("navigation start");
		LoginPage lp=new LoginPage(driver);
		lp.NagiateToPage();
		Reporter.log("navigation end");
	}
	
	@Test(priority=2)
	public void login() {
		
		LoginPage lp1=new LoginPage(driver);
		lp1.enterCred("Admin", "admin123");
		Reporter.log("submit");
		lp1.submit();
	}
	
	@Test(priority=3)
	public void close() {
		driver.quit();
		Reporter.log("close browser");
	}
	

}
