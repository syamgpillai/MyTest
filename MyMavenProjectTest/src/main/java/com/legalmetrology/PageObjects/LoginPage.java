package com.legalmetrology.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.legalmetrology.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	//Pagefactory or PageObject or OR
	
	@FindBy(id="webmaster")
	WebElement usertype;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'SIGN IN')]")
	WebElement signinBtn;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/img")
	WebElement logo;
	
	
	//Initialization
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
		
		//Actions
	
	public String validateloginpage(){
		return driver.getTitle();
	}
	
	public boolean validatelogoimage(){
		return logo.isDisplayed();
	}

	public DashboardPage login(String un, String pwd){
		usertype.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		signinBtn.click();
		
		return new DashboardPage();
	}

}

