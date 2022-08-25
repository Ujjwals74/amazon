package com.Automation.StepDef;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;

import com.Automation.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage lp= new LoginPage();
//	@Given("Open the browser")
//	public void open_the_browser() {
//	    DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
//	@When("Enter valid Username {string} and Password {string}")
//	public void enter_valid_username_and_password(String string, String string2) {
//	  lp.enterUsername(PropertyReader.getProperty("username"));
//	  lp.enterPassword(PropertyReader.getProperty("password"));  
//		lp.clickbtnLogin();
//	}
//
//	@Then("execute successfully")
//	public void execute_successfully() {
//	   System.out.println("login successful");
//	}

	
	@Given("open the browser")
	public void open_the_browser() {
		 DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("enter Username  {string} and Password  {string}")
	public void enter_username_and_password(String string, String string2) {
//		lp.enterUserName(PropertyReader.getProperty("username"));
//	    lp.enterPassword(PropertyReader.getProperty("password"));
		lp.enterUserName(PropertyReader.getProperty(string));
	    lp.enterPassword(PropertyReader.getProperty(string2));
	    lp.clickButton();
	}

	@Then("execute successfull")
	public void execute_successfull() {
		  System.out.println("Login Successful");
	}

}
