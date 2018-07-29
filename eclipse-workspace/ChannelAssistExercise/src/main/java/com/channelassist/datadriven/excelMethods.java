package com.channelassist.datadriven;

import java.util.HashMap;
import java.util.List;


import org.openqa.selenium.WebDriver;

import com.channelassist.objectrepository.checkoutPage;

public class excelMethods {
	
public WebDriver driver;
	
	excelDriven hashMap = new excelDriven();
	
	checkoutPage checkout = new checkoutPage();
	
	List<HashMap<String,String>> datamap;
	
	public WebDriver billingFormPage(int d, WebDriver driver,List<HashMap<String,String>> datamap)
	{
		
		
		//datamap = hashMap.Data("/Users/anilkumar/Desktop/DataDrivenFormData.xlsx", "TestData1");
		System.out.println("Printing datamap in the elementsformpage  :  "+datamap);
		
		checkout.Fname(driver).sendKeys(datamap.get(d).get("First Name"));
		checkout.Lname(driver).sendKeys(datamap.get(d).get("Last Name"));
		checkout.Emailaddress(driver).sendKeys(datamap.get(d).get("Email Address"));
		checkout.Address(driver).sendKeys(datamap.get(d).get("Address"));
		checkout.City(driver).sendKeys(datamap.get(d).get("City"));
		checkout.Province(driver).sendKeys(datamap.get(d).get("Province"));
		checkout.Postalcode(driver).sendKeys(datamap.get(d).get("Postal Code"));
		checkout.Phone(driver).sendKeys(datamap.get(d).get("Phone"));
		checkout.Country(driver).sendKeys(datamap.get(d).get("Country"));
		
		
		
		return driver;
	}

	
	

}
