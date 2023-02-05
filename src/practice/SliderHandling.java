package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		//Handling frame
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		//select Element
		WebElement slider=driver.findElement(By.xpath("//span[@tabindex='0']"));
		
		//Action class
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 250, 0).build().perform();
		Thread.sleep(3000);
		act.dragAndDropBy(slider, -200, 0).build().perform();
		
		Thread.sleep(5000);
		driver.close();

	}

}
