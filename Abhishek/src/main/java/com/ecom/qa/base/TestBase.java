package com.ecom.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;

import com.ecom.qa.pages.LandingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public LandingPage landingPage ;
	
	public WebDriver initialzationDriver() throws IOException {
		
		Properties prop=new Properties();
	//	FileInputStream fis=new FileInputStream(System.getProperty("/Abhishek/src/main/java/com/ecom/qa/config/config.properties"));
		FileInputStream fis = new FileInputStream("src/main/java/com/ecom/qa/config/config.properties");

		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);		
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		    FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver=new FirefoxDriver(options);
		}else {
	            throw new RuntimeException("Browser not supported: " + BrowserName);
		}
		
		driver.manage().window().maximize();
		return driver;
		
			}
	 @BeforeMethod
	    public void launchApplication() throws IOException {
	        driver = initialzationDriver();
	        landingPage = new LandingPage(driver);
	        landingPage.goTo();
			
	    }
     public	 String getScreenShot(String testCaseName,WebDriver driver) throws IOException{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File file=new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
			FileUtils.copyFile(source, file);
			return System.getProperty(("user.dir")+"//reports//"+testCaseName+".png");
			
		}

	
	
	

}
