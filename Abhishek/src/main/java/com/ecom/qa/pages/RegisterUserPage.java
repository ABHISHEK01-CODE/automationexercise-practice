package com.ecom.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ecom.qa.base.TestBase;

public class RegisterUserPage{
	private WebDriver driver;
	
	public RegisterUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//b[text()='Enter Account Information']")
	WebElement VerifyText;

	@FindBy(id="id_gender1")
	WebElement MrGender;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="days")
	WebElement days;
	
	@FindBy(id="months")
	WebElement Months;
	
	@FindBy(id="years")
	WebElement Years;
	
	@FindBy(id="newsletter")
	WebElement Newsletter;
	
	@FindBy(id="optin")
	WebElement Optin;
	
	@FindBy(id="first_name")
	WebElement FirstName;
	
	@FindBy(id="last_name")
	WebElement LastName;
	
	@FindBy(id="company")
	WebElement Company;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="country")
	WebElement Country;
	

	@FindBy(id="state")
	WebElement State;

	@FindBy(id="city")
	WebElement City;

	@FindBy(id="zipcode")
	WebElement Zipcode;

	@FindBy(id="mobile_number")
	WebElement MobileNumber;

	@FindBy(xpath="//button[@data-qa='create-account']")
	WebElement CreateAccount;
	
	@FindBy(tagName="b")
	WebElement UserName;

	@FindBy(xpath="//a[text()=' Delete Account']")
	WebElement DeleteButton;
	
	@FindBy(xpath="//a[@data-qa='continue-button']")
	WebElement ContinueButton;
	
	
	
	public String AccountCreatedMessage() {
	String AccountcreatedMessage=driver.findElement(By.xpath("//h2[@data-qa='data-qa']")).getText();
	return AccountcreatedMessage;
	}
	
	public String UsernameVisible() {
		String Username=driver.findElement(By.tagName("b")).getText();
		return Username;
		}
	
	public void Gender() {
		MrGender.click();
		}
	
	public void EnterPassword(String password) {
		Password.sendKeys(password);
		}
	
	public void SelectDays() {
		Select Days=new Select(days);
		Days.selectByVisibleText("12");
		}
	public void SelectMonths() {
		Select months=new Select(Months);
		months.selectByIndex(5);
		}
	public void SelectYears() {
		Select Year=new Select(Years);
		Year.selectByVisibleText("2005");
		}
	public void NewsLetter() {
		Newsletter.click();
		}
	public void optin() {
		Optin.click();
		}
	public void first_name(String Firstname) {
		FirstName.sendKeys(Firstname);
		}
	public void last_name(String Lastname) {
		LastName.sendKeys(Lastname);
		}
	public void company(String CompanyName) {
		Company.sendKeys(CompanyName);
		}
	public void address1(String Address1) {
		address1.sendKeys(Address1);
		}
	public void country () {
		Select CountryName=new Select(Country);
		CountryName.selectByIndex(4);;
		}
	public void state (String StateName) {
		State.sendKeys(StateName);
		}
	public void Entercity(String CityName) {
	City.sendKeys(CityName);
	}
	public void zipcode(String ZipCode) {
		Zipcode.sendKeys(ZipCode);
		}
	public void mobile_number(String mobileNumber) {
		MobileNumber.sendKeys(mobileNumber);
		}
	public void CreateAccountButton() {
		CreateAccount.click();
		}
	public void DeleteAccount() {
		DeleteButton.click();
		}
	

	
	
	
	
	
	
	
}
