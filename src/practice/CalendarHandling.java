package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//webpage open
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//scroll handling
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		
		//switch to frame
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		//calender handle
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
			String  month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println("current month "+month);
			if(!month.equalsIgnoreCase("June 2020"))
			{
				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
			}
			else
				break;
			
			
			}
		Thread.sleep(3000);
		int date=20;
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+date+"']")).click();
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
