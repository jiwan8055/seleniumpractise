package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/hp/eclipse-workspace/libs/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='alert']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='confirmation']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
       WebElement prompt= driver.findElement(By.xpath("//input[@name='prompt']"));
       Thread.sleep(5000);
       prompt.sendKeys("abcd");
       Thread.sleep(3000);
       prompt.click();
       driver.switchTo().alert().accept();
        
      
        
	}

}
