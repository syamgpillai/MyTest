package History;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {
public static void main (String [] args){
	System.setProperty("webdriver.gecko.driver","D:\\WorkingFolder\\Setups\\Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
String pageTitle = driver.getTitle();
if (pageTitle.equals("Gmail")){
	System.out.println("Test Passed");
}
else {
	System.out.println("Test Failed");
}
}
}
