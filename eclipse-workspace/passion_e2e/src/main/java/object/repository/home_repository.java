package object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class home_repository {
	
	public WebDriver driver;
	
	By firstname = By.xpath("//input[@id='firstName']");
	By lastname = By.xpath("//input[@id='lastName']");
	By email = By.xpath("//input[@id='emailAddress']");
	By submit = By.xpath("//input[@id='bySubmit']");
	By home_title = By.xpath("//h1[@id='title']");
	
	
	//      ************ http://toolsqa.com/selenium-webdriver/page-object-model/ **********
	//      ******** Verify this link to learn about Page object model *****
	// ************create a Static Method for each Element (Object) in the Home Page. 
	//*************Each method will have an Argument (driver) and a Return value (element).
	
	public home_repository(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement Fname(WebDriver driver)
	{

	return 	driver.findElement(firstname);
	
	}
	
	public WebElement Lname(WebDriver driver)
	{
		
		return driver.findElement(lastname);
		
		
	}
	
	public WebElement Email(WebDriver driver)
	{
		
		return driver.findElement(email);
	}
	
	public WebElement Submit(WebDriver driver)
	{
		
		return driver.findElement(submit);
	}
	
	public WebElement title(WebDriver driver)
	{
		return driver.findElement(home_title);
	}
}
