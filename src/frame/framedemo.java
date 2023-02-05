package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		

	}

}
