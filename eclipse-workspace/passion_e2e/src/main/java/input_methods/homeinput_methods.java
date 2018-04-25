package input_methods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;


import object.repository.home_repository;

public class homeinput_methods {
	
	public WebDriver driver;
	
	Scanner scanInput= new Scanner(System.in);
	
	home_repository hr = new home_repository(driver);
	
	
	
	
	public String fname_scanner()
	{
		String fname = scanInput.next();
		
		System.out.println("I am fname scanner   ---------------------------->  :"  +  fname);
		return fname;
	}
	
	
	
	public void getfname(String fname,WebDriver driver)
	{
		hr.Fname(driver).clear();
		hr.Fname(driver).sendKeys(fname);
		
		System.out.println("I am getfname  method  fname is :  " + fname);
		
		
		
		
	}
	
	public void getlname(String lname,WebDriver driver)
	{
		hr.Lname(driver).clear();
		hr.Lname(driver).sendKeys(lname);
		
		
	}
	
	public void getemail(String email,WebDriver driver)
	{
		hr.Email(driver).clear();
		hr.Email(driver).sendKeys(email);
		
		
	}
	

}
