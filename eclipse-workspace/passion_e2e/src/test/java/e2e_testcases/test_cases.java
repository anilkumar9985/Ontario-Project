 package e2e_testcases;

import java.io.IOException;



import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.passion.utilities.Logs;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import input_methods.homeinput_methods;
import instantiate_driver.driver_manager;
//import listeners.listeners;
import object.repository.home_page_methods;
import object.repository.home_repository;
import properties.properties_methods;
//import org.apache.log4j.xml.DOMConfigurator;


@Listeners(listeners.listeners.class)

public class test_cases{
	
	public WebDriver driver = null;
	

	
	Logs Log = new Logs();
	
	home_page_methods hpm = new home_page_methods();
	
	home_repository hr = new home_repository(driver);
	
	homeinput_methods him = new homeinput_methods();
	
	driver_manager dm = new driver_manager();
	
	properties_methods pm = new properties_methods();
	
	//@BeforeClass
	public void LogSetup()
	{
		DOMConfigurator.configure("log4j2.xml");
		
		System.out.println("*********************Configuring log4j.xml file **************************");
	}
	
	public WebDriver getdriver()
	{
		System.out.println("**********Printing driver from get driver method:  **************" +driver);
		return driver;
	}
	
	
	//@Parameters({"url"})
	@BeforeTest
	public void binvoke() throws IOException
	{
		DOMConfigurator.configure("log4j2.xml");
		
		System.out.println("*********************Configuring log4j.xml file **************************");
		
		driver = dm.browser_invoke();
		
		Log.info("Instantiating the Driver");
		
		System.out.println("I am the driver from browser invoke  :  "+driver);
	}
	
	
	@Test(enabled = false)
	public void tc_001()
	{
		Log.startTestCase("Test case 001 Initiation");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));
		hr.Fname(driver).sendKeys("Anil!!");
		
		Log.info("Test case 001 sending data to the fname field");
		driver.switchTo().defaultContent();
		
		Log.endTestCase("End of test case 001");
	}
	
	@Test(enabled = false)
	public void tc_002()
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));

		hr.Lname(driver).sendKeys("@@");
		System.out.println("Driver tc_002:    "+driver);
		driver.switchTo().defaultContent();
	}
	
	//@Test(enabled = false)
	public void tc_003()
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));

		hr.Email(driver).sendKeys("anilkumar9985");
		driver.switchTo().defaultContent();
	}
	
	@Test(enabled = false)
	public void tc_004()
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));

		hr.Submit(driver).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		
	}
	
	@Test(enabled = true)
	public void home_page_title() throws IOException
	{
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));

		Log.info("Verifying home page title");
		hpm.verify_title(pm.title(), driver);
		driver.switchTo().defaultContent();
		
		
	}
	
	@Test(enabled = true)
	public void verifyall_fields()
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));
		hpm.verifyallfields_present(driver);
		Log.info("Verifying all fields are present");
		driver.switchTo().defaultContent();
	}
	
	@Test(enabled = true)
	public void firstname_mandatory() throws IOException, InterruptedException
	{
		
		Log.info("Verifying fname field mandatory");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));
		hpm.fn_mandatory(pm.ferror(), driver);
		//driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
	
	@Test(enabled = true)
	public void lastname_mandatory() throws IOException, InterruptedException
	{
		Log.info("Verifying lname field mandatory");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));
		hpm.ln_mandatory(pm.lerror(), driver);
		//driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
	
	@Test(enabled = true)
	public void email_mandatory() throws IOException, InterruptedException
	{
		Log.info("Verifying email field mandatory");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));
		hpm.email_mandatory(pm.emailerror(), driver);
		//driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
	
	@Test(enabled = true)
	public void valid_email() throws IOException, InterruptedException
	{
		Log.info("Verifying valid email ");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));
		hpm.verify_valid_email(pm.email(), driver);
		//driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
	
	@Test(enabled = false)
	public void fn_input() throws IOException
	{
		System.out.println("Please enter your first name  ---------------------------->  :");
		
		String fname = him.fname_scanner();
		System.out.println("I am the First name input from console  " + fname);
	}
	
	@Test(enabled = false)
	public void ln_input() throws IOException
	{
		String lname = hpm.lname_input();
		System.out.println("I am the Last name input from prop file  " + lname);
	}
	
	
	@Test(enabled = false)
	public void email_input() throws IOException
	{
		String email = hpm.email_input();
		System.out.println("I am the email input from prop file  " + email);
	}
	
	@Test(enabled = false)
	public void gettext_fname() throws IOException
	{
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));
		him.getfname(pm.fname(), driver);
		
		
		driver.switchTo().defaultContent();
	}
	
	@Test(enabled = false)
	public void gettext_lname() throws IOException
	{
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));
		him.getlname(pm.lname(), driver);
		
		
		driver.switchTo().defaultContent();
	}
	
	@Test(enabled = false)
	public void gettext_email() throws IOException
	{
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//fiddle.jshell.net/rlourenco/cp6bc9ka/4/show/light/']")));
		him.getlname(pm.email(), driver);
		
		
		driver.switchTo().defaultContent();
	}
	
	
	
	@AfterTest
	public void quit()
	{
		driver.close();
	}
}
