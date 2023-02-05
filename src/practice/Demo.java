package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		//script for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.close();
		
		//script for firefox browser
		System.setProperty("webdriver.gecko.driver", "C:/Users/hp/eclipse-workspace/libs/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.gmail.com");
		Thread.sleep(3000);
		dr.manage().window().maximize();
		dr.close();
		
		//script for internet explorer
		System.setProperty("webdriver.ie.driver","C:/Users/hp/eclipse-workspace/libs/IEDriverServer.exe" );
		WebDriver Ie = new InternetExplorerDriver();
		Ie.get("http://www.yahoo.com");
		Thread.sleep(3000);
		Ie.manage().window().maximize();
		Ie.close();

	}

}
