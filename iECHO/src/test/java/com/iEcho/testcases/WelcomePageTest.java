package com.iEcho.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.iEcho.base.Base;
import com.iEcho.pageobject.WelcomePage;

public class WelcomePageTest extends Base {
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
	@Test
	public void WelComePageTest() throws InterruptedException {
		WelcomePage abc = new WelcomePage();
		//Thread.sleep(3000);
		
		abc.clickOnContinue();
		System.out.println("Test case is completed");
	
		Thread.sleep(3000);
		
		
		
		
	}
}
