package com.ecom.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogIn_SignUpPage{
	private WebDriver driver;


	public LogIn_SignUpPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[data-qa='signup-name']")
	WebElement SignupName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement SignupEmail;
	
	@FindBy(css="button[data-qa='signup-button']")
	WebElement SignupButton;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement LoginEmail;
	
	@FindBy(css="input[data-qa='login-password']")
	WebElement LoginPassword;
	
	@FindBy(xpath="//button[@data-qa='login-button']")
	WebElement LoginButton;
	
	
	public void SignupName(String name) {
		SignupName.sendKeys(name);
	}
	
	public void SignupEmail(String Email) {
		SignupEmail.sendKeys(Email);
	}
	
	public void SignupButton() {
		SignupButton.click();
	}

	public void LoginEmail(String Loginemail) {
		LoginEmail.sendKeys(Loginemail);
	}
	public void LoginPassword(String Password) {
		LoginPassword.sendKeys(Password);
	}
	public void LoginButton() {
		LoginButton.click();
	}
	
}
