package TestNG1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LegalTest {
  
    @Test
  public void Login(){
	  System.setProperty("webdriver.gecko.driver","D:\\WorkingFolder\\Setups\\Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");
	  	WebDriver driver = new FirefoxDriver();
	  	driver.get("http://legalmetrology-qa.rainconcert.biz/login");
	  	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.id("webmaster")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("boban.gm@rainconcert.in");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Rain12345");
    driver.findElement(By.xpath("//html/body/div/div/div/form/button")).click();
  }
}





   