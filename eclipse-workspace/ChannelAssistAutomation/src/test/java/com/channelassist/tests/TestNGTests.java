package com.channelassist.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.HashMap;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.channelassist.datadriven.ExcelDriven;
import com.channelassist.datadriven.ExcelMethods;
import com.channelassist.objectrepository.CheckoutPage;
import com.channelassist.objectrepository.ProductPage;
import com.channelassist.utilities.DriverManager;

public class TestNGTests {
	
	public WebDriver driver;
	
	ProductPage pg = new ProductPage();
	
	DriverManager binvoke = new DriverManager();
	
	List<HashMap<String,String>> datamap;
	
	CheckoutPage cp = new CheckoutPage();
	
	ExcelMethods excelmethods = new ExcelMethods();
	
	@BeforeTest
	public void browserInvoke()
	{
		driver = binvoke.browserInvoke();
		datamap = ExcelDriven.Data(new File("").getAbsolutePath()+File.separator+"ExcelSource"+File.separator+"Billingtestdata.xlsx", "TestData1");
	}
	
	@Test(priority=1)
	public void selectandVerifyProductPage() throws InterruptedException
	{
		pg.productCategory(driver).click();
		String title = pg.productCategory(driver).getText();
		Assert.assertEquals("Product Category", title);
		
	}
	
	@Test(priority=2)
	public void selectandVerifyAccessoriesPage()
	{
		driver.navigate().to("http://store.demoqa.com/products-page/product-category/accessories/");
		String AccessString = driver.getTitle();
		Assert.assertEquals("Accessories | ONLINE STORE", AccessString);
		
	}
	
	@Test(priority=3)
	public void selectMagicMouse()
	{
		pg.magicMouse(driver).click();
		String MagicString = driver.getTitle();
		Assert.assertEquals("Magic Mouse | ONLINE STORE", MagicString);
		
	}
	
	@Test(priority=4)
	public void addtocart()
	{
		pg.addToCart(driver).click();
		
	}
	
	@Test (priority =5)
	public void verifyQuantityandCheckout()
	{
		pg.checkout(driver).click();
		String Quantity = pg.cartQuantity(driver).getAttribute("value");
		Assert.assertEquals("1", Quantity);
		pg.continueCheckout(driver).click();
	}
	
	@Test (priority = 6)
	public void billingDetailsDataDriven()
	{
	
		excelmethods.billingFormPage(3, driver, datamap);
		cp.samebillingCheckbox(driver).click();
	}
	
	@Test(priority = 7)
	public void purchaseandValidate()
	{
		cp.purchase(driver).click();
		String Transactiontxt = pg.transactionResults(driver).getText();
		Assert.assertEquals("Transaction Results", Transactiontxt);
		
	}
	
	@AfterTest
	public void browserClose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
