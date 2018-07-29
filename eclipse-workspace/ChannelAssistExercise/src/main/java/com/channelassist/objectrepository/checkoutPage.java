package com.channelassist.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {
	
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
	
	
	
	public WebElement Emailaddress(WebDriver driver)
	{
		return driver.findElement(Emailaddress);
		
	}
	
	public WebElement Fname(WebDriver driver)
	{
		return driver.findElement(Fname);
		
	}
	
	public WebElement Lname(WebDriver driver)
	{
		return driver.findElement(Lname);
	}
	
	public WebElement Address(WebDriver driver)
	{
		return driver.findElement(Address);
	}
	
	public WebElement City(WebDriver driver)
	{
		return driver.findElement(City);
		
	}
	
	public WebElement Province(WebDriver driver)
	{
		return driver.findElement(Province);
		
	}
	
	public WebElement Country(WebDriver driver)
	{
		return driver.findElement(Country);
		
	}
	
	public WebElement Postalcode(WebDriver driver)
	{
		return driver.findElement(Postalcode);
	}
	
	public WebElement Phone(WebDriver driver)
	{
		return driver.findElement(Phone);
	}
	
	public WebElement SamebillingCheckbox(WebDriver driver)
	{
		return driver.findElement(SamebillingCheckbox);
		
	}
	
	public WebElement Purchase(WebDriver driver)
	{
		return driver.findElement(Purchase);
	}
	

}
