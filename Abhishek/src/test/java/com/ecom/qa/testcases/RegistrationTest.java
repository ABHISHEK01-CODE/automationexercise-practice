package com.ecom.qa.testcases;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.LogIn_SignUpPage;
import com.ecom.qa.pages.RegisterUserPage;

public class RegistrationTest extends TestBase{
//WebDriver driver;
//LogIn_SignUpPage login;

//@Test(dataProvider = "getUserData")
/*public void Userregistration(String firstName, String lastName, String email, String password, 
        String day, String month, String year, String company, String address, 
        String state, String city, String zip, String mobile) throws IOException {
	
	RegisterUserPage registeruser=new RegisterUserPage(driver);

	LogIn_SignUpPage login=new LogIn_SignUpPage(driver);
	landingPage.Signuplogin();
	
	login.SignupName("kk");
	login.SignupEmail("www@nfjgf.com");
	login.SignupButton();
	//registeruser.Gender();
	registeruser.EnterPassword(password);
	registeruser.SelectDays();
	registeruser.SelectMonths();
	registeruser.SelectYears();
	registeruser.NewsLetter();
	registeruser.optin();
	registeruser.first_name(firstName);
	registeruser.last_name(lastName);
	registeruser.company(company);
	registeruser.address1(address);
	registeruser.country();
	registeruser.state(state);
	registeruser.Entercity(city);
	registeruser.zipcode(zip);
	registeruser.mobile_number(mobile);
	registeruser.CreateAccountButton();
	
}*/
@Test	(dataProvider = "getUserData")
public void Userregistration(HashMap<String,String> input) throws IOException {
	
	RegisterUserPage registeruser=new RegisterUserPage(driver);

	LogIn_SignUpPage login=new LogIn_SignUpPage(driver);
	landingPage.Signuplogin();
	
	login.SignupName("kk");
	login.SignupEmail("www@nfjgf.com");
	login.SignupButton();
	//registeruser.Gender();
	registeruser.EnterPassword(input.get("Password"));
	registeruser.SelectDays();
	registeruser.SelectMonths();
	registeruser.SelectYears();
	registeruser.NewsLetter();
	registeruser.optin();
	registeruser.first_name(input.get("FirstName"));
	registeruser.last_name(input.get("LastName"));
	registeruser.company(input.get("CompanyName"));
	registeruser.address1(input.get("Address"));
	registeruser.country();
	registeruser.state(input.get("State"));
	registeruser.Entercity(input.get("City"));
	registeruser.zipcode(input.get("ZipCode"));
	registeruser.mobile_number(input.get("MobileNo"));
	registeruser.CreateAccountButton();
}


/*@DataProvider(name = "getUserData")
public Object[][] getUserData() {
    return new Object[][] {
        {"John", "Doe", "john.doe@example.com", "Password123", "12", "June", "2000", "Company1", "Address1", "State1", "City1", "12345", "9876543210"}
    };
}*/
@DataProvider
public Object[][] getUserData()
{
	
    HashMap<String,String> map=new HashMap<String,String>(); 
    map.put("FirstName", "John");
    map.put("LastName", "Doe");
    map.put("Email", "john.doe@example.com");
    map.put("Password", "Password123");
    map.put("Date", "12");
    map.put("Month", "June");
    map.put("Year", "2000");
    map.put("CompanyName", "Company1");
    map.put("Address", "Address1");
    map.put("State", "State1");
    map.put("City", "City1");
    map.put("ZipCode", "12345");
    map.put("MobileNo", "9876543210");
   return new Object[][] {{map}};

}}
	
    //    {"John", "Doe", "john.doe@example.com", "Password123", "12", "June", "2000", "Company1", "Address1", "State1", "City1", "12345", "9876543210"}
    

