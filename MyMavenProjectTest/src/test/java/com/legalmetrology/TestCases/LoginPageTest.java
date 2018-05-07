package com.legalmetrology.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.legalmetrology.PageObjects.DashboardPage;
import com.legalmetrology.PageObjects.LoginPage;
import com.legalmetrology.TestBase.TestBase;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	DashboardPage dashboardPage; 	
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage();
	}
		
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginpage.validateloginpage();
		Assert.assertEquals(title, "Safe fleet - Fleet Admin Login");
	}
	
	@Test(priority=2)
	public void logoImageTest(){
		boolean flag = loginpage.validatelogoimage();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3)
	public void loginSuccessTest(){
		dashboardPage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void teaddown(){
		driver.quit();
	}
	
	
}
