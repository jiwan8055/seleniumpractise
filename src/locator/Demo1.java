package locator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Alternative way to open browser without using get()&nevigate()
		//we use javascriptexcecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String url = "https://www.google.com";
		String script = "window.location = \'"+url+"\'";
		js.executeScript(script);
		js.executeScript("document.getElementById('input').value='abc'");
		driver.manage().window().maximize();

	}

}
