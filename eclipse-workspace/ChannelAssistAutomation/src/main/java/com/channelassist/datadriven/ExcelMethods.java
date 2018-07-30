package com.channelassist.datadriven;

import java.util.HashMap;
import java.util.List;


import org.openqa.selenium.WebDriver;

import com.channelassist.objectrepository.CheckoutPage;

public class ExcelMethods {
	
public WebDriver driver;
	
	ExcelDriven hashMap = new ExcelDriven();
	
	CheckoutPage checkout = new CheckoutPage();
	
	List<HashMap<String,String>> datamap;
	
	public WebDriver billingFormPage(int d, WebDriver driver,List<HashMap<String,String>> datamap)
	{
		
		checkout.fname(driver).sendKeys(datamap.get(d).get("First Name"));
		checkout.lname(driver).sendKeys(datamap.get(d).get("Last Name"));
		checkout.emailAddress(driver).sendKeys(datamap.get(d).get("Email Address"));
		checkout.address(driver).sendKeys(datamap.get(d).get("Address"));
		checkout.city(driver).sendKeys(datamap.get(d).get("City"));
		checkout.province(driver).sendKeys(datamap.get(d).get("Province"));
		checkout.postalcode(driver).sendKeys(datamap.get(d).get("Postal Code"));
		checkout.phone(driver).sendKeys(datamap.get(d).get("Phone"));
		checkout.country(driver).sendKeys(datamap.get(d).get("Country"));
		
		return driver;
	}

}
