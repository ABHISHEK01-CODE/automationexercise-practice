package com.ecom.qa.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportNG {
	 public static ExtentReports getReportObject() {
	  String path = System.getProperty("user.dir") + "\\reports\\index.html";
	  ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	    reporter.config().setTheme(Theme.STANDARD);
	  reporter.config().setDocumentTitle("Automation Report");
      reporter.config().setReportName("Web Testing");
  

	ExtentReports extent= new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester","Rahul Shetty");
	extent.createTest(path);
	return extent;

}}
