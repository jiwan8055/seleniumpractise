package frame;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		
		System.out.println("parent window id "+parent);
		
		Set<String>allwindowid=driver.getWindowHandles();
		
		int count=allwindowid.size();
		
		System.out.println("Total windows "+count);
		
		for(String child:allwindowid) {
			
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				
				System.out.println("child window title is "+driver.getTitle());
				
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		
		System.out.println("parent window title is "+driver.getTitle());

	}

}
