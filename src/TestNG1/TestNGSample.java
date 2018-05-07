package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSample {
@Test
public void verifytitle(){
System.setProperty("webdriver.gecko.driver","D:\\WorkingFolder\\Setups\\Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
String pageTitle = driver.getTitle();
Assert.assertEquals("Gmail", pageTitle);
}
}
