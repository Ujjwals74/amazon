package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.AddUserPage;
import com.Automation.Pages.LoginPage;

public class AddUserTest extends BaseTest {
	@Test 
	 public void VerifysuccessfulAddUser() {
		
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage lp=new LoginPage();
		AddUserPage act= new AddUserPage();
		
		
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickbtnLogin();
		//act.Action();
	}
	}