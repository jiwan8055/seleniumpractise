package links;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		List<WebElement>link=driver.findElements(By.tagName("a"));
		System.out.println("Links Count is ==>"+link.size());
		for(int i=0;i<link.size();i++) {
			WebElement ele=link.get(i);
			String url=ele.getAttribute("href");
			VerifyActiveLinks(url);
		}
	}

	public static void VerifyActiveLinks(String Linkurl) throws IOException {
		
		URL url=new URL(Linkurl);
		HttpURLConnection connect= (HttpURLConnection)url.openConnection();
		connect.setConnectTimeout(3000);
		connect.connect();
		if(connect.getResponseCode()==200) {
			System.out.println(Linkurl+" "+connect.getResponseMessage());
		}
		
		if(connect.getResponseCode()==connect.HTTP_NOT_FOUND) {
			System.out.println(Linkurl+" "+connect.getResponseMessage()+" "+connect.HTTP_NOT_FOUND);
		}
		
	}

}
