package com.Automation.StepDef;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.AddUserPage;
import com.Automation.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addSteps {
	LoginPage lp=new LoginPage();
      AddUserPage ad = new AddUserPage();
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	   
	}

	@Then("User enters username as {string}")
	public void user_enters_username_as1(String string) {
		lp.enterUserName(string);
	}

	@Then("User enters password as {string}")
	public void user_enters_password_as1(String string) {
		lp.enterPassword(string);  
	}

	@Then("User Clicks on Login button")
	public void user_clicks_on_login_button() {
		lp.clickButton();
	}

	@Then("user clicks on admin")
	public void user_clicks_on_admin() {
		  ad.admin_click();
	}

	@Then("user clicks on add")
	public void user_clicks_on_add() {
		 ad.add_click();
	}

	@Then("user select user role And enter employee name as {string} And select Status")
	public void user_select_user_role_and_enter_employee_name_as_and_select_status(String string) throws InterruptedException  {
		ad.select(string);
	}

	@Then("user enters username as {string}")
	public void user_enters_username_as(String username) {
		ad.Uname(username);
	}

	@Then("user enters password as {string}")
	public void user_enters_password_as(String string) {
		ad.Password1(string);
	}

	@Then("user enters confirm_password as {string}")
	public void user_enters_confirm_password_as(String string) {
		ad.ConfirmPass(string);
	}

	@Then("user click on Save button")
	public void user_click_on_save_button() throws InterruptedException {
		Thread.sleep(5000);
		ad.Save();
	}
}
