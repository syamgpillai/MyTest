package com.legalmetrology.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.legalmetrology.TestBase.TestBase;

public class DashboardPage extends TestBase {
	
		
	@FindBy(xpath="/html/body/div[1]")
	WebElement userNameLabel;
	
	@FindBy(xpath="/html/body/header/nav/div/a[2]/span[2]")
	WebElement usertypename;

	@FindBy(linkText="establishment/users")
	WebElement userMgm;
	//xpath: /html/body/div[1]/aside/nav/ul/li[4]/a
	
	@FindBy(xpath="/html/body/div[1]/aside/nav/ul/li[6]/a")
	WebElement vehicleMgm;
	
	//Initialization of page objects
	
	public DashboardPage(){
		
		PageFactory.initElements(driver, this);
	}
	

	//Actions
	
	public String verifyDashboardTitle(){
		return driver.getTitle();
	}

	public UserManagementPage clickOnUserMgm(){
		userMgm.click();
		return new UserManagementPage();
	}

	public VehicleManagementPage clickOnVehicleMgm(){
		vehicleMgm.click();
		return new VehicleManagementPage();
	}
}
