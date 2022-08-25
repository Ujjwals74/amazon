package com.Automation.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Automation.GenericUtils.ExcelData;
public class orange {
	//private static final String ExcelData = null;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String Username=ExcelData.getdata("C:\\Users\\ujjwal.singh2\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\data\\abcd.xlsx","Sheet1", 0, 0);
			String Password=ExcelData.getdata("C:\\Users\\ujjwal.singh2\\eclipse-workspace\\automation\\src\\selenium\\excel\\Data\\abcd2.xlxs","Sheet1", 0, 1);
			String TestFile = "C:\\\\Users\\\\ujjwal.singh2\\\\Desktop";
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ujjwal.singh2\\eclipse-workspace\\automation\\src\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			WebElement element=driver.findElement(By.name("username"));
			element.sendKeys(Username);
			

		}

	}

