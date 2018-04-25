package object.repository;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.passion.utilities.Logs;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import properties.properties_methods;

@Listeners(listeners.listeners.class)
public class home_page_methods { 
	
	Logs Log = new Logs();
	
	public WebDriver driver;
	
	home_repository hr = new home_repository(driver);
	Properties prop = new Properties();
	
	properties_methods pm = new properties_methods();
	
	
	
	
	/*public home_page_methods(WebDriver driver)
	{
		this.driver = driver;
		
	}*/
	
	
	public void verify_title(String title, WebDriver driver)
	{
		Log.info("Verifying title");
		
		String s = hr.title(driver).getText();
		try {
			Assert.assertEquals(title, s);
		}
		catch (Exception e)
		{
			Log.error("Title is not matching ");
		}
			//System.out.println(s);
		
	}
	
	public void verifyallfields_present(WebDriver driver)
	{
		
		boolean fs = hr.Fname(driver).isDisplayed();
		
		System.out.println(fs);
		
		boolean fl = hr.Lname(driver).isDisplayed();
		
		System.out.println(fl);
		
		boolean fe = hr.Email(driver).isDisplayed();
		
		System.out.println(fe);
		
		boolean fsub = hr.Submit(driver).isDisplayed();
		
		System.out.println(fsub);
		
	}
	
	public void fn_mandatory(String ferror, WebDriver driver) throws InterruptedException
	{
		hr.Fname(driver).clear();
		hr.Lname(driver).clear();
		hr.Email(driver).clear();
		hr.Submit(driver).click();
		//String txt = driver.switchTo().alert().getText();
		
		//Assert.assertEquals(txt, ferror);
		
		if(alert_present(driver)== true)
		{
			System.out.println("I am driver in alert_present if statement :  "+driver);
			String txt = driver.switchTo().alert().getText();
			
			System.out.println("I am the gettext in if statement ln_mandatory:  "+txt);
			Assert.assertEquals(txt, ferror);
			
			
			driver.switchTo().alert().dismiss();
			
		}
		else
		{
			
			Log.error("No alert present");
		}
		
		
	}
	
	

	public void ln_mandatory(String lerror, WebDriver driver) throws IOException, InterruptedException
	{
		
		hr.Fname(driver).clear();
		hr.Fname(driver).sendKeys(pm.fname());
		hr.Submit(driver).click();
		
		//String txt = driver.switchTo().alert().getText();
		
		//Assert.assertEquals(txt, lerror);
		
		if(alert_present(driver)== true)
		{
			//System.out.println("I am driver in alert_present if statement :  "+driver);
			String txt = driver.switchTo().alert().getText();
			
			//System.out.println("I am the gettext in if statement ln_mandatory:  "+txt);
			
			//Assert.assertEquals(txt, lerror);
			
			
			
			Assert.assertTrue(txt.contentEquals(lerror));
					
		
			
			
			driver.switchTo().alert().accept();
			
		}
		else
		{
			
			Log.error("No alert present");
		}
		
		
	}
	
	public void email_mandatory(String emailerror, WebDriver driver) throws IOException, InterruptedException
	{
		

		hr.Fname(driver).clear();
		hr.Fname(driver).sendKeys(pm.fname());
		hr.Lname(driver).clear();
		hr.Lname(driver).sendKeys(pm.lname());
		hr.Submit(driver).click();
		
		//String txt = driver.switchTo().alert().getText();
		
		//Assert.assertEquals(txt, emailerror);
		
		if(alert_present(driver)== true)
		{
			//System.out.println("I am driver in alert_present if statement :  "+driver);
			String txt = driver.switchTo().alert().getText();
			
			//System.out.println("I am the gettext in if statement validemail:  "+txt);
			Assert.assertEquals(txt, emailerror);
			
			
			driver.switchTo().alert().dismiss();
			
		}
		else
		{
			
			Log.error("No alert present");
		}
		
		
	}
	
	public void verify_valid_email(String email, WebDriver driver) throws IOException, InterruptedException
	{
		
		
		//System.out.println("I am driver in verify_valid_email:  "+driver);
		hr.Fname(driver).clear();
		hr.Fname(driver).sendKeys(pm.fname());
		hr.Lname(driver).clear();
		hr.Lname(driver).sendKeys(pm.lname());
		hr.Email(driver).clear();
		hr.Email(driver).sendKeys(email);
		
		hr.Submit(driver).click();
		
		
		if(alert_present(driver)== true)
		{
			//System.out.println("I am driver in alert_present if statement :  "+driver);
			String txt = driver.switchTo().alert().getText();
			
			//System.out.println("I am the gettext in if statement validemail:  "+txt);
			Assert.assertEquals(txt, pm.successfulmess());
			
			
			driver.switchTo().alert().dismiss();
			
		}
		else
		{
			
			Log.error("No alert present");
		}
		
		
		
		
		
	
				
	}
	
	public String fname_input() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");
		prop.load(fis);
		String Fn_input= prop.getProperty("Firstname");
		//System.out.println(Fn_input);
		return Fn_input;
	}
	
	public String lname_input() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");
		prop.load(fis);
		String Ln_input= prop.getProperty("Lastname");
		//System.out.println(Ln_input);
		return Ln_input;
	}
	
	public String email_input() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");
		prop.load(fis);
		String e_input= prop.getProperty("email");
		//System.out.println(e_input);
		return e_input;
	}
	
	public boolean alert_present(WebDriver driver) throws InterruptedException
	{
		try
		{
			//System.out.println("I am driver in alert_present :  "+driver);
			Thread.sleep(1000);
			Alert s = driver.switchTo().alert();
			System.out.println("I am alert text in alert present() :  "+s.getText());
			//driver.switchTo().alert().accept();
			
			return true;
			
		}
		catch (NoAlertPresentException e)
		{
			Log.error("No alert present");
			return false;
		}
		
	}
	
	public void screenshot_method(String result, WebDriver driver) throws IOException
	{
		
		System.out.println("##########I am screenshot method  ############");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("/Users/anilkumar/eclipse-workspace/passion_e2e/"+result+"failedScreenShot.png"));


		
	}

}
