package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("anscfhd");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:/Users/hp/eclipse-workspace/SeleniumPractice/snapshot/s1.png");
		FileHandler.copy(source, dest);
		Thread.sleep(3000);
		System.out.println("Screen Shot Taken");

	}

}
