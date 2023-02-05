package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String parentUrl=driver.getCurrentUrl();
		System.out.println("parentUrl "+parentUrl);
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		System.out.println("parentId "+parent);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		String crUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl "+crUrl);
		
		Set<String> allwindow=driver.getWindowHandles();
		
		for(String id:allwindow)
		{
			 System.out.println("All Id"+id);
			 if(!parent.equalsIgnoreCase(id))
			 {
				 System.out.println("child id "+id);
				 driver.switchTo().window(id);
				 String Url=driver.getCurrentUrl();
				 System.out.println("Child url1 "+Url);
			 }
		}
		
		Thread.sleep(3000);
		String p=driver.getCurrentUrl();
		System.out.println("parent p"+p);

	}

}
