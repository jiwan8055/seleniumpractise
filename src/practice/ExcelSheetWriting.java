package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetWriting {
	
	
	
	public static String writeData(int row,int col,String value) throws IOException {
		
		//1) Path
		String path="C:\\Users\\hp\\eclipse-workspace\\SeleniumPractice\\Test1.xlsx";
		
		//2) File class create 
		File file=new File(path);
		
		 //3) InputStream class object
		FileInputStream fs=new FileInputStream(file);
		
		//4) Workbook habndle-excel
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		 //5) Sheet identify
		XSSFSheet sheet=wb.getSheetAt(1);
		
		sheet.getRow(row).createCell(col).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		return value;
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		writeData(0,0,"velocity");
		
		writeData(0,1,"katraj");
		writeData(1,0,"pune");
		writeData(1,1,"mumbai");
		writeData(0,2,"nanded");

	}

}
