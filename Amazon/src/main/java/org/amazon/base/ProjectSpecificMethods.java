package org.amazon.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethods {
	public static RemoteWebDriver driver;
	public String excelFileName;
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

	@DataProvider
	public String[][] provideData() throws IOException
	{
		LearnExcel excel = new LearnExcel();
		return excel.getExcelData(excelFileName);	
	}

}
