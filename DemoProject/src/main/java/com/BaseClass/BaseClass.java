package com.BaseClass;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass 
{
	public WebDriver driver;
	@BeforeSuite
	public void BeforeSuit() 
	{
		DOMConfigurator.configure("log4j.xml");
		Log.info("This is BeforeSuiteMethod");
		
	}
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	@AfterSuite
	public void afterSuite() 
	{
		Log.info("This is AfterSuiteMethod");
	}

}
