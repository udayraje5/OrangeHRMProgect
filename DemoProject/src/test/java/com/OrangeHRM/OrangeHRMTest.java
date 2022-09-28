package com.OrangeHRM;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.BaseClass.Log;

public class OrangeHRMTest extends  BaseClass
{
	@Test
	public void orangeHRMTest() throws InterruptedException
	{
	Log.startTestCase("OrangeHRMTest");
	
	Log.info("Entering user name");
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Log.info("Entering password");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Log.info("Entering");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	Log.info("Entering on Home Page");
	Log.info("Entering Home URL");
	String actURL=driver.getCurrentUrl();
	String expURL="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
	Assert.assertEquals(actURL, expURL);
	Log.info("URL Matches");
	Log.endTestCase(" OrangeHRMTest");
	
		
	}

}
