package org.amazon.Amazon;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BuyProduct 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
		driver.findElementByXPath("//input[@type='submit']").click();
		String price = driver.findElementByXPath("//span[@class='a-price-whole']").getText();
		System.out.println(price);
		driver.findElementByXPath("//a[@class='a-link-normal']").click();
		Thread.sleep(3000);
		Set<String> windowHandle = driver.getWindowHandles();
		for(String newwindow:windowHandle)
		{
		driver.switchTo().window(newwindow);
		}
		String deliveryby= driver.findElementById("ddmDeliveryMessage").getText();
		System.out.println(deliveryby);
		driver.findElementById("add-to-cart-button").click();
		String addtocart = driver.findElementByXPath("//div[@id='huc-v2-order-row-confirm-text']/h1").getText();
		Assert.assertEquals(addtocart, "Added to Cart");
		driver.findElementById("hlb-ptc-btn-native").click();
		driver.findElementById("ap_email").sendKeys(" ");
		driver.findElementById("continue").click();
		String error= driver.findElementByXPath("//div[@id='auth-email-missing-alert']//div").getText();
		System.out.println(error);
		Assert.assertEquals(error,"Enter your email or mobile phone number");
    }
}
