package com.ecom.qa.testcases;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.LogIn_SignUpPage;


public class LoginPageTest extends TestBase {

@Test(dataProvider="getData")
public void login(String email,String password) {

	LogIn_SignUpPage loginpage=new LogIn_SignUpPage(driver);
	landingPage.Signuplogin();
	loginpage.LoginEmail(email);
	loginpage.LoginPassword(password);
	loginpage.LoginButton();
	
}

@DataProvider 
public Object[][] getData() {
	 return new Object[][] {
		 {"TestUser@gmail1.com","Password123"} };
	
}
}
