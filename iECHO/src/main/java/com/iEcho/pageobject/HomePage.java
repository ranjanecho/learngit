package com.iEcho.pageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.iEcho.action.Action;
import com.iEcho.base.Base;
public class HomePage extends Base {
	
	Action action = new Action();
	
	@FindBy (xpath="//span[contains(text(),'Continue with Email')]")
	WebElement Email;
	
	@FindBy (xpath="//span[contains(text(),'Continue with Mobile')]")
	WebElement Mobile;
	
	@FindBy (xpath="//span[contains(text(),'Continue with Google')]")
	WebElement Google;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public LoginPage clickOnEmail() {
		action.click(driver, Email);
		return new LoginPage();
	}
	
	
}







