package com.legalmetrology.TestCases;

import org.testng.annotations.BeforeMethod;

import com.legalmetrology.PageObjects.LoginPage;
import com.legalmetrology.TestBase.TestBase;

public class DashboardPageTest extends TestBase{
	LoginPage loginpage;
	
	
	public DashboardPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	
	
}
