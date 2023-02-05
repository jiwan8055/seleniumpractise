package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		
		
		driver.close();
		
	}

}
