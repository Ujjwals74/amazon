package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
//	@FindBy(name="username")
//	private WebElement userInput;
//	
//	@FindBy(name="password")
//	private WebElement passwordInput;
//	
//	@FindBy(xpath="//button[@type='submit']")
//	private WebElement loginButton;
//	
//	
//	public void enterUsername(String username2)
//	{
//		userInput.sendKeys(username2);
//		
//	}
//	
//	public void enterPassword(String password)
//	{
//		passwordInput.sendKeys(password);
//		
//		
//	}
//
//	public void clickbtnLogin()
//	{
//		loginButton.click();
//	}
//	
	@FindBy(xpath="//input[@name='username']")
	private WebElement inputTextname;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement inputTextPassword;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement btnLogin;
	
	

	public void enterUserName(String str)
	{
		inputTextname.sendKeys(str);
	}
	
    public void enterPassword(String str)
    {
    	inputTextPassword.sendKeys(str);
    	
    } 
    public void clickButton()
    {
    	btnLogin.click();
    }

	
}
