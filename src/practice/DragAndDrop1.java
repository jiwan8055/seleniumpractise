package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		
		//Handling the scroll bar
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		  //Entering into the frame
		  WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		  driver.switchTo().frame(frame);
		
		//Element which need to drag
		WebElement from=driver.findElement(By.id("draggable"));
		
		//Element on which to drop
		WebElement to=driver.findElement(By.id("droppable"));
		
		//Action for drag and drop
		Actions act = new Actions(driver);
		
		//Dragged and Dropped
		act.dragAndDrop(from, to).build().perform();
		
		//Take Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:/Users/hp/eclipse-workspace/SeleniumPractice/snapshot/dd.png");
		FileHandler.copy(source, dest);
		System.out.println("screenshot taken");
		
		Thread.sleep(3000);
		driver.close();

	}

}
