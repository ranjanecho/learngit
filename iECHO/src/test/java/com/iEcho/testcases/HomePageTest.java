package com.iEcho.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.iEcho.base.Base;
import com.iEcho.pageobject.HomePage;
import com.iEcho.pageobject.WelcomePage;
public class HomePageTest extends Base {
	
	HomePage homePage;
	WelcomePageTest welcomeTest;
	WelcomePage welcomePage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void HomePageTest() throws InterruptedException {
		
		
		welcomePage = new WelcomePage();
		welcomePage.clickOnContinue();
		 homePage = new HomePage();
		
		Thread.sleep(3000);
		homePage.clickOnEmail();
		Thread.sleep(3000);
	}
}






