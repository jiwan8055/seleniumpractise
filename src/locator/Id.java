package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		/*driver.findElement(By.id("email")).sendKeys("jiwanpethkar@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("3654289");
		driver.findElement(By.name("login")).click();*/
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Forgotten password")).click();
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		
		//driver.close();

	}

}
