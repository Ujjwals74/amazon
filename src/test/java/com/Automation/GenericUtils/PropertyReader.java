package com.Automation.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	static Properties prop=new Properties();
	public static void initProperty() throws FileNotFoundException, IOException {
		
			prop.load(new FileInputStream("C:\\Users\\ujjwal.singh2\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\config\\config.properties"));
		
		
		}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}

