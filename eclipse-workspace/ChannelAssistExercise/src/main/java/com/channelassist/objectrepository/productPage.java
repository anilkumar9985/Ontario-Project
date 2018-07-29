package com.channelassist.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
	
	public WebDriver driver;
	
	By ProductCategory = By.xpath("//a[@href='http://store.demoqa.com/products-page/product-category/']");
	By Accessories = By.xpath("//li[@id='menu-item-34']");
	By MagicMouse = By.xpath("//a[@href='http://store.demoqa.com/products-page/product-category/accessories/magic-mouse/']");
	
	By AddToCart = By.name("Buy");
	
	By CartQuantity = By.xpath("//td[@class='wpsc_product_quantity wpsc_product_quantity_0']/form/input[1]");

	//By AddToCart = By.xpath("//form[@action='http://store.demoqa.com/products-page/product-category/accessories/magic-mouse/']//div[3]");
	By Checkout = By.xpath("//a[@href='http://store.demoqa.com/products-page/checkout/']");
	By Continue = By.xpath("//a[@href='#']");
	By TransactionResults = By.xpath("//h1[@class='entry-title']");
	
	public WebElement ProductCategory(WebDriver driver)
	{
		return driver.findElement(ProductCategory);
	}
	
	public WebElement Accessories(WebDriver driver)
	{
		return driver.findElement(Accessories);
	}
	
	public WebElement MagicMouse(WebDriver driver)
	{
		return driver.findElement(MagicMouse);
		
	}
	
	
	public WebElement AddToCart(WebDriver driver)
	{
		return driver.findElement(AddToCart);
	}
	
	public WebElement Checkout(WebDriver driver)
	{
		return driver.findElement(Checkout);
	}
	
	public WebElement Continue(WebDriver driver)
	{
		return driver.findElement(Continue);
	}
	
	public WebElement CartQuantity(WebDriver driver)
	{
		return driver.findElement(CartQuantity);
	}
	
	public WebElement TransactionResults(WebDriver driver)
	{
		return driver.findElement(TransactionResults);
	}

}
