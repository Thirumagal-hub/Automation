package org.amazon.pages;

import java.util.Set;

import org.amazon.base.ProjectSpecificMethods;

public class ProductDetailsPage extends ProjectSpecificMethods{

	
	public ProductDetailsPage switchToNewWindow()
	{
		Set<String> windowHandle = driver.getWindowHandles();
		for(String newwindow:windowHandle)
		{
		driver.switchTo().window(newwindow);
		}
		
		return this;
	}
	
	public ProductDetailsPage getProductDeliveryDate()
	{
		String deliveryby= driver.findElementById("ddmDeliveryMessage").getText();
		System.out.println(deliveryby);	
		return this;
	}
	
	public ShoppingCartPage clickOnAddToCart()
	{
		driver.findElementById("add-to-cart-button").click();
		return new ShoppingCartPage();
	}
}
