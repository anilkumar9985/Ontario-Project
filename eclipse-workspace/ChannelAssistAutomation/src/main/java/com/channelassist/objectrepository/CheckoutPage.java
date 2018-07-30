package com.channelassist.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	
	public WebDriver driver;
	
	By Emailaddress = By.xpath("//input[contains(@id,'wpsc_checkout_form_9')]");
	By Fname = By.xpath("//input[contains(@id,'wpsc_checkout_form_2')]");
	By Lname = By.xpath("//input[contains(@id,'wpsc_checkout_form_3')]");
	By Address = By.xpath("//textarea[contains(@id,'wpsc_checkout_form_4')]");
	By City = By.xpath("//input[contains(@id,'wpsc_checkout_form_5')]");
	By Province = By.xpath("//input[contains(@id,'wpsc_checkout_form_6')]");
	By Country = By.xpath("//select[@id='wpsc_checkout_form_7']");
	By Postalcode = By.xpath("//input[contains(@id,'wpsc_checkout_form_8')]");
	By Phone = By.xpath("//input[contains(@id,'wpsc_checkout_form_18')]");
	By SamebillingCheckbox = By.xpath("//input[contains(@id,'shippingSameBilling')]");
	By Purchase = By.xpath("//input[@class='make_purchase wpsc_buy_button']");
	
	
	
	public WebElement emailAddress(WebDriver driver)
	{
		return driver.findElement(Emailaddress);
		
	}
	
	public WebElement fname(WebDriver driver)
	{
		return driver.findElement(Fname);
		
	}
	
	public WebElement lname(WebDriver driver)
	{
		return driver.findElement(Lname);
	}
	
	public WebElement address(WebDriver driver)
	{
		return driver.findElement(Address);
	}
	
	public WebElement city(WebDriver driver)
	{
		return driver.findElement(City);
		
	}
	
	public WebElement province(WebDriver driver)
	{
		return driver.findElement(Province);
		
	}
	
	public WebElement country(WebDriver driver)
	{
		return driver.findElement(Country);
		
	}
	
	public WebElement postalcode(WebDriver driver)
	{
		return driver.findElement(Postalcode);
	}
	
	public WebElement phone(WebDriver driver)
	{
		return driver.findElement(Phone);
	}
	
	public WebElement samebillingCheckbox(WebDriver driver)
	{
		return driver.findElement(SamebillingCheckbox);
		
	}
	
	public WebElement purchase(WebDriver driver)
	{
		return driver.findElement(Purchase);
	}
	

}
