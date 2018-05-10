package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\WorkingFolder\\Setups\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://legalmetrology-qa.rainconcert.biz/login");
		
		driver.findElement(By.xpath("//*[@id='establishment']")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("syam@rainconcert.in");
		
		driver.quit();
	}

}
