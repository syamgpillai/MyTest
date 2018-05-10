package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\WorkingFolder\\Setups\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "D:\\WorkingFolder\\Setups\\Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.kwadhi.com/");
		driver.findElement(By.id("submit")).click();
		driver.switchTo().frame("idIframe");
		//For switching frames. provide frame name/id as the string value
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("TestName");
		
		
		
		//driver.quit();
	}

}
