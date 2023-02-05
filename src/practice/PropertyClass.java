package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class PropertyClass {
	
	public static void readproperty() throws IOException {
		String path="C:\\Users\\hp\\eclipse-workspace\\SeleniumPractice\\config.properties";
		
		Properties prop=new Properties();
		
		FileInputStream fs = new FileInputStream(path);
		
		prop.load(fs);
		
		String username=prop.getProperty("email");
		String cred = prop.getProperty("passward");
		
		System.out.println("Username is==> "+username);
		System.out.println("Password is==> "+cred);
	}

	public static void main(String[] args) throws IOException {
		readproperty();

	}

}
