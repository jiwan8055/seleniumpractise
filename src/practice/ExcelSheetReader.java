package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReader {
	
	
	
	
	public static String readData(int row,int col) throws IOException {
		
		//1) File Locate
		String path="C:\\Users\\hp\\eclipse-workspace\\SeleniumPractice\\Test.xlsx";
		
		//2) Object creatoion of file class
		File file = new File(path);
		
		//3) Create Object FileinputStream
		FileInputStream fs= new FileInputStream(file);
		
		//4) XSSFWorkbook
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		
		//5) XSSFSheet
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		//6) Reading the value from sheet
		String value=sheet.getRow(row).getCell(col).getStringCellValue();
		
		return value;
	}

	public static void main(String[] args) throws IOException {
		
		System.out.println(readData(0,0));
		System.out.println(readData(0,1));
		System.out.println(readData(1,0));
		System.out.println(readData(1,1));
		

	}

}
