package org.amazon.testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.amazon.pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BuyProduct 
{

	@Test
	public void verifyProduct() {
		new HomePage()
		.verifyTitle()
		.enterProductName("Samsung Galaxy M30")
		.clickOnSearch()
		.verifyTitle("Samsung Galaxy M30")
		.getDeliveryDateText()
		.clickOnProduct()
		.switchToNewWindow()
		.getProductDeliveryDate()
		.clickOnAddToCart()
		.verifyAddedToCart()
		.clickProceed();
		
	}
}
