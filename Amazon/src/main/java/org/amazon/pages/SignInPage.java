package org.amazon.pages;

import org.amazon.base.ProjectSpecificMethods;
import org.testng.Assert;

public class SignInPage extends ProjectSpecificMethods {

	public SignInPage verifyErrorMessage()
	{	
	driver.findElementById("ap_email").sendKeys(" ");
	driver.findElementById("continue").click();
	String error= driver.findElementByXPath("//div[@id='auth-email-missing-alert']//div").getText();
	System.out.println(error);
	Assert.assertEquals(error,"Enter your email or mobile phone number");
	return this;
	}
}
