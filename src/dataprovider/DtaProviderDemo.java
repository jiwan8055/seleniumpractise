package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DtaProviderDemo {
	
	@DataProvider(name="TestData1")
	
	public static String[] getValue() throws IOException {
		
		String path="C:\\Users\\hp\\eclipse-workspace\\SeleniumPractice\\Test2.xlsx";
		
		FileInputStream fs=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int lastrow=sheet.getLastRowNum();
		String []dataarray=new String[lastrow];
		for(int i=0;i<lastrow;i++) {
			String data=sheet.getRow(i).getCell(0).getStringCellValue();
			dataarray[i]=data;
		}
		return dataarray;
	}

}

