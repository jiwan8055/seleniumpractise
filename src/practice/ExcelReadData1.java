package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadData1 {
	
	public static String readData(int row,int col) throws IOException {
		
		
		
		String path="C:\\Users\\hp\\eclipse-workspace\\SeleniumPractice\\Test.xlsx";
		
		File file = new File(path);
		FileInputStream fs=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		String value=sheet.getRow(row).getCell(col).getStringCellValue();
		return value;
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println(readData(0,0));
		System.out.println(readData(0,1));
		System.out.println(readData(1,0));
		System.out.println(readData(1,1)); 
		
		System.setProperty("webdriver.chrome.driver","C:/Users/hp/eclipse-workspace/libs/chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(readData(0,1));
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(readData(1,1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(7000);
		driver.close();

	}

}
