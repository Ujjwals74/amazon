package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	
	public void VerifysuccessfulLogin()
	{
			DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
			LoginPage lp=new LoginPage();
			lp.enterUsername("Admin");
			lp.enterPassword("admin123");
			lp.clickbtnLogin();
			
			
	}
}