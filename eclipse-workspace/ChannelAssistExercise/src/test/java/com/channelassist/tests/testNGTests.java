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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.channelassist.datadriven.excelDriven;
import com.channelassist.datadriven.excelMethods;
import com.channelassist.objectrepository.checkoutPage;
import com.channelassist.objectrepository.productPage;
import com.channelassist.utilities.DriverManager;

public class testNGTests {
	
	public WebDriver driver;
	
	productPage pg = new productPage();
	
	DriverManager binvoke = new DriverManager();
	
	List<HashMap<String,String>> datamap;
	
	checkoutPage cp = new checkoutPage();
	
	excelMethods excelmethods = new excelMethods();
	
	@BeforeTest
	public void browserInvoke()
	{
		driver = binvoke.browserInvoke();
		datamap = excelDriven.Data(new File("").getAbsolutePath()+File.separator+"ExcelSource"+File.separator+"Billingtestdata.xlsx", "TestData1");
	}
	
	@Test(priority=1)
	public void SelectandVerifyProductPage() throws InterruptedException
	{
		pg.ProductCategory(driver).click();
		String title = pg.ProductCategory(driver).getText();
		System.out.println("Page Title: "+ title);
		
		Assert.assertEquals("Product Category", title);
		
		
	}
	
	
	
	
	
	@Test(priority=2)
	public void SelectandVerifyAccessoriesPage()
	{
		driver.navigate().to("http://store.demoqa.com/products-page/product-category/accessories/");
		String AccessString = driver.getTitle();
		System.out.println("Page Accessories Title: "+ AccessString);
		Assert.assertEquals("Accessories | ONLINE STORE", AccessString);
		
	}
	
	@Test(priority=3)
	public void SelectMagicMouse()
	{
		pg.MagicMouse(driver).click();
		String MagicString = driver.getTitle();
		System.out.println("Magic Mouse page title: "+ MagicString);
		Assert.assertEquals("Magic Mouse | ONLINE STORE", MagicString);
		
	}
	
	@Test(priority=4)
	public void Addtocart()
	{
		pg.AddToCart(driver).click();
		
		
	}
	
	@Test (priority =5)
	public void VerifyQuantityandCheckout()
	{
		pg.Checkout(driver).click();
		String Quantity = pg.CartQuantity(driver).getAttribute("value");
		System.out.println("Cart Quantity is :" + Quantity);
		
		Assert.assertEquals("1", Quantity);
		pg.Continue(driver).click();
	}
	
	@Test (enabled=false)
	public void Billingdetails()
	{
		cp.Emailaddress(driver).sendKeys("Anilkumar9985@gmail.com");
		cp.Fname(driver).sendKeys();
		cp.Lname(driver).sendKeys("Srivalli");
		cp.Address(driver).sendKeys("18harrissongardenblvd");
		cp.City(driver).sendKeys("Burlington");
		cp.Province(driver).sendKeys("Ontario");
		
		Select sel = new Select(cp.Country(driver));
		
		sel.selectByValue("CA");
		
		cp.Postalcode(driver).sendKeys("L7L0H6");
		cp.Phone(driver).sendKeys("6474579999");
		cp.SamebillingCheckbox(driver).click();
		
	}
	
	
	
	@Test (priority = 6)
	public void billingdetailsDataDriven()
	{
	
		excelmethods.billingFormPage(2, driver, datamap);
		cp.SamebillingCheckbox(driver).click();
	}
	
	@Test(priority = 7)
	public void PurchaseandValidate()
	{
		cp.Purchase(driver).click();
		String Transactiontxt = pg.TransactionResults(driver).getText();
		System.out.println("Confirmation page : "+ Transactiontxt);
		Assert.assertEquals("Transaction Results", Transactiontxt);
		
	}
	
	
	
	
	
	
	
	

}
