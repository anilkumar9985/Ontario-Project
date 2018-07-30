package com.channelassist.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
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
	
	public WebElement productCategory(WebDriver driver)
	{
		return driver.findElement(ProductCategory);
	}
	
	public WebElement accessories(WebDriver driver)
	{
		return driver.findElement(Accessories);
	}
	
	public WebElement magicMouse(WebDriver driver)
	{
		return driver.findElement(MagicMouse);
		
	}
	
	
	public WebElement addToCart(WebDriver driver)
	{
		return driver.findElement(AddToCart);
	}
	
	public WebElement checkout(WebDriver driver)
	{
		return driver.findElement(Checkout);
	}
	
	public WebElement continueCheckout(WebDriver driver)
	{
		return driver.findElement(Continue);
	}
	
	public WebElement cartQuantity(WebDriver driver)
	{
		return driver.findElement(CartQuantity);
	}
	
	public WebElement transactionResults(WebDriver driver)
	{
		return driver.findElement(TransactionResults);
	}

}
