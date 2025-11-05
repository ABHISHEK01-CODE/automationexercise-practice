package com.ecom.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage  {
	private WebDriver driver;
	
	public LandingPage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
@FindBy(xpath="//a[@href='/products']")
WebElement product;

@FindBy(xpath="//a[@href='/view_cart']/i")
WebElement cart;

@FindBy(xpath="//a[normalize-space()='Signup / Login']")
WebElement SingupLogin;

@FindBy(xpath="//a[contains(text(),'Test Cases')]")
WebElement Test_Cases;

@FindBy(xpath="//a[normalize-space()='API Testing']")
WebElement API_Testing;

@FindBy(xpath="//a[normalize-space()='Video Tutorials']")
WebElement Youtube;

@FindBy(xpath="//a[normalize-space()='Contact us']")
WebElement Contact_us;

public void goTo() {
	driver.get("https://automationexercise.com/");
}
public String Title() {
	String WebTitle= driver.getTitle();
	return WebTitle;
}

public void Signuplogin() {
	SingupLogin.click();
	
}




}
