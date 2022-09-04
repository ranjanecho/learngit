package com.iEcho.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iEcho.base.Base;
import com.iEcho.pageobject.HomePage;
import com.iEcho.pageobject.LoginPage;
import com.iEcho.pageobject.WelcomePage;

public class LoginPageTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	WelcomePage welcomePage;

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

	@Test
	public void verifySignIn() throws InterruptedException {
		welcomePage = new WelcomePage();
		Thread.sleep(3000);
		welcomePage.clickOnContinue();
		Thread.sleep(3000);
		homePage = new HomePage();
		homePage.clickOnEmail();
		Thread.sleep(3000);
		loginPage= new LoginPage();
		loginPage.enterEmail();
		loginPage.clickSubmit();
		Thread.sleep(3000);
		loginPage.enterPassword();
		Thread.sleep(3000);
		loginPage.clickSubmit();

	}
	@Test
	public void failSignIn() throws InterruptedException {
		welcomePage = new WelcomePage();
		Thread.sleep(3000);
		welcomePage.clickOnContinue();
		Thread.sleep(3000);
		homePage = new HomePage();
		homePage.clickOnEmail();
		Thread.sleep(3000);
		loginPage= new LoginPage();
		loginPage.enterIncorrectEmail();
		loginPage.clickSubmit();
		Thread.sleep(3000);
		loginPage.enterPassword();
		Thread.sleep(3000);
		loginPage.clickSubmit();
	}
	
	

}
