package org.amazon.pages;

import java.sql.Driver;

import org.amazon.base.ProjectSpecificMethods;
import org.testng.Assert;

public class HomePage extends ProjectSpecificMethods{

	public HomePage verifyTitle()
	{
		String title= driver.getTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		return this;
	}
	
	public HomePage enterProductName(String product)
	{
		driver.findElementById("twotabsearchtextbox").sendKeys(product);	
		return this;
	}
	
	public SearchPage clickOnSearch()
	{
		driver.findElementByXPath("//input[@type='submit']").click();
		return new SearchPage();
	}
}
