package com.Automation.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends BasePage {
//	@FindBy (xpath="//b[text()='Admin']")
//	private WebElement mouseAdmin;
//	
//
//	@FindBy (xpath="//a[text()='User Management']")
//	private WebElement mouseUserManagement;
//	
//	@FindBy (xpath="//a[text()='Users']")
//	private WebElement clickUser;
//	
//	@FindBy(xpath="//input[@id='btnAdd']")
//	private WebElement clickAdd;
//	
//	@FindBy(xpath="//select[@id='systemUser_userType']")
//	private WebElement userRole;
//	
//	@FindBy (xpath="//input[@id='systemUser_employeeName_empName']")
//	private WebElement empName;
//	
//	@FindBy (xpath="//input[@id='systemUser_userName']")
//	private WebElement Username;
//	
//	@FindBy (xpath="//select[@id='systemUser_status']")
//	private WebElement status;
//	
//	@FindBy (xpath="//input[@id='systemUser_password']")
//	private WebElement password;
//	
//	@FindBy (xpath="//input[@id='systemUser_confirmPassword']")
//	private WebElement confirmpasswrd;
//	
//	@FindBy (xpath="//input[@class=\"addbutton\"]")
//	private WebElement save;
//	
	
	
//	@FindBy (xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
//	private WebElement add;
	
//	@FindBy (xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
//	private WebElement clickadmin;
	
	
//	@FindBy (xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
//	private WebElement adduserbutton;
	
	
	
//	@FindBy(xpath="//label[contains(text(),'User Role')]/../..//div[@class='oxd-select-text-input']")
//	private WebElement selectuserrole;
//	
//	@FindBy(xpath="//label[contains(text(),'Employee Name')]/../..//input")
//	private WebElement enterempname;
//	
//	@FindBy(xpath="//label[contains(text(),'Username')]/../..//input")
//	private WebElement enterusernamE;
//	
//	@FindBy(xpath="//label[contains(text(),'Status')]/../..//div[@class='oxd-select-text-input']")
//	private WebElement selectstatus;
//	
//	@FindBy(xpath="//label[text()='Password']/../..//input")
//	private WebElement password;
//	
//	@FindBy(xpath="//label[text()='Confirm Password']/../..//input")
//	private WebElement confirmpassword;
//	
//	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
//	private WebElement savebutton;
//	
//	
////	public void Action() 
////	{
////		Actions act=new Actions(driver);
////		act.moveToElement(mouseAdmin).perform();
////		act.moveToElement(mouseUserManagement).perform();
////		clickUser.click();
////		clickAdd.click();
////		
////		selectuserrole.sendKeys("Admin");
////		enterempname.sendKeys("Joe");
////		enterusernamE.sendKeys("ujjwal9");
////		selectstatus.sendKeys("Enabled");
////		password.sendKeys("123Ujjw@l");
////		confirmpassword.sendKeys("123Ujjw@l");
////		savebutton.click();
////		
////	}
//	
//	public void selectuserrole(String str) throws InterruptedException {
//		selectuserrole.click();
//		Actions act = new Actions(driver);
//	    act.sendKeys(Keys.DOWN).perform();	    
//	    act.sendKeys(Keys.ENTER).perform();
//	}
//	
//	
	@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement admin;
	@FindBy(xpath = "//*[@class='orangehrm-header-container']/button")  
	WebElement Add;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]") 
	WebElement userrole;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]")
	WebElement role_admin;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") 
	WebElement empname;
	@FindBy(xpath  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]")
	WebElement empclick;
	@FindBy(xpath = "//div[text()='-- Select --']")
	WebElement select;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]")
	WebElement enabled;
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement uname;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement pass;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement cpass;
	@FindBy(xpath = "(//button[@type='submit'])[1]") 
	WebElement submit;
	
	
	public void admin_click() {
		admin.click();
		
	}
	public void add_click() {
		Add.click();
	}
	public void select(String str) throws InterruptedException {
		userrole.click();
		role_admin.click();
		empname.sendKeys(str);
		Thread.sleep(4000);
		empclick.click();
		select.click();
		enabled.click();
		
	}
	public void enter_name(String nam) {
		empname.sendKeys(nam);
	}
	public void Uname(String str) {
		uname.sendKeys(str);
		
	}
	public void Password1(String p) {
		pass.sendKeys(p);
		
	}
	public void ConfirmPass(String cp) {
		cpass.sendKeys(cp);
	}
	public void Save() {
		submit.click();
	}

}	
	
