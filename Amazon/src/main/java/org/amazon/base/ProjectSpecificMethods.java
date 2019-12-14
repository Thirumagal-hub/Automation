package org.amazon.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public static RemoteWebDriver driver;
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
