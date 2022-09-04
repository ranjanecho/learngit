package com.iEcho.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iEcho.action.Action;
import com.iEcho.base.Base;

public class LoginPage extends Base {
	
	Action action = new Action();
	
	@FindBy (name="verifyEmail")
	WebElement LoginEmail;
	
	@FindBy (id="submit")
	WebElement LoginSubmit;
	
	@FindBy (id="password")
	WebElement EnterPassword;

	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterEmail() {
		action.click(driver, LoginEmail);
		LoginEmail.sendKeys("ranjan.sharma@echoindia.in");
	}
	
	public void enterIncorrectEmail() {
		action.click(driver, LoginEmail);
		LoginEmail.sendKeys("ranjan.shara@echoindia.in");
	}
	
	public void clickSubmit() {
		action.click(driver, LoginSubmit);
		
	}
	
	public void enterPassword() {
		action.click(driver, EnterPassword);
		EnterPassword.sendKeys("ranjan2133");
		
	}
	
}
