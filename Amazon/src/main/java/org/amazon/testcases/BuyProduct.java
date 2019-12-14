package org.amazon.testcases;

import org.amazon.base.ProjectSpecificMethods;
import org.amazon.pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BuyProduct extends ProjectSpecificMethods
{

	@BeforeTest
	public void setData()
	{
		excelFileName="BuyProduct";
	}
	
	//@Test(dataProvider="provideData", dataProviderClass=DataProviderClass.class)
	
	@Test(dataProvider="provideData")
	public void verifyProduct(String product) {
		new HomePage()
		.verifyTitle()
		.enterProductName(product)
		.clickOnSearch()
		.verifyTitle(product)
		.getDeliveryDateText()
		.clickOnProduct()
		.switchToNewWindow()
		.getProductDeliveryDate()
		.clickOnAddToCart()
		.verifyAddedToCart()
		.clickProceed();
		
	}
}
