package org.amazon.pages;

import org.amazon.base.ProjectSpecificMethods;
import org.testng.Assert;

public class SearchPage extends ProjectSpecificMethods{

	public SearchPage verifyTitle(String product)
	{
		String title= driver.getTitle();
		title.contains(product);
		return this;
	}
	
	public SearchPage getDeliveryDateText()
	{
		String price = driver.findElementByXPath("//span[@class='a-price-whole']").getText();
		System.out.println(price);
		return this;
	}
	
	public ProductDetailsPage clickOnProduct()
	{
		driver.findElementByXPath("//a[@class='a-link-normal']").click();
		return new ProductDetailsPage();
	}

	
	
}
