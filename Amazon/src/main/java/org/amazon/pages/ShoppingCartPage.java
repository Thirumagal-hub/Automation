package org.amazon.pages;

import org.amazon.base.ProjectSpecificMethods;
import org.testng.Assert;

public class ShoppingCartPage extends ProjectSpecificMethods{

	public ShoppingCartPage verifyAddedToCart()
	{
	String addtocart = driver.findElementByXPath("//div[@id='huc-v2-order-row-confirm-text']/h1").getText();
	Assert.assertEquals(addtocart, "Added to Cart");
	return this;
	}

	
	public SignInPage clickProceed()
	{
		driver.findElementById("hlb-ptc-btn-native").click();	
		return new SignInPage();
	}
	
	
}
