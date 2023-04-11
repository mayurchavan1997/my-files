package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public static	WebDriver driver;
	public static   ConfigDataProvider config;
	
	@BeforeSuite
	public void BS() throws Exception {
		config =new ConfigDataProvider();
	}
	
@BeforeMethod
public void BM() {

	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get(config.pro.getProperty("website"));
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
	
WebDriver getDriver()
{
	return driver;
}

@AfterMethod
void  teardown()
{
	
driver.quit();
}

}
