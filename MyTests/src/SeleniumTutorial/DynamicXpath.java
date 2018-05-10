package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WorkingFolder\\Setups\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "D:\\WorkingFolder\\Setups\\Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://legalmetrology-qa.rainconcert.biz");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//Dyamic Xpath start with "//", then "html tag[]", 
		//then take any attribute like "@class @name, @id etc = ", value of the attribute in single quote and keep it inside [] 
		//or instead of attibute we can use the function "contains" or "starts-with" or "ends-with".syntax will be as below
		// we can use these function for handling dynamic ids.
		//driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		//driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-primary')]")).click();
		//driver.findElement(By.xpath("//button[ends-with(@class,'btn btn-primary')]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();
	}

}
