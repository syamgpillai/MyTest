package com.legalmetrology.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.legalmetrology.Utl.TestUtil;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\WorkingFolder\\workspace\\MyTest\\MyMavenProjectTest"
					+ "\\src\\main\\java\\com\\legalmetrology\\Config\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
	
		if (browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\WorkingFolder\\Setups\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\WorkingFolder\\Setups\\Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	
	
	}
	
	
}
