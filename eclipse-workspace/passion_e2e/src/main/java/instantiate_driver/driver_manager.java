package instantiate_driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import properties.properties_methods;

public class driver_manager {
	
	public WebDriver driver;
	
	properties_methods pm  = new properties_methods();
	
	/*public driver_manager(WebDriver driver)
	{
		this.driver = driver;
    }*/
	
	
	
	
	public WebDriver browser_invoke() throws IOException
	{
		
	
		if(pm.browser().equals("chrome"))
		{
			 
			
			System.setProperty("webdriver.chrome.driver", "/Users/anilkumar/Downloads/chromedriver-4");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().fullscreen();
			
			driver.get("https://jsfiddle.net/rlourenco/cp6bc9ka/4/embedded/result/");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			return driver;
		}
			
		else if (pm.browser().equals("firefox") )
		{
		
				System.setProperty("webdriver.gecko.driver", "/Users/anilkumar/Downloads/geckodriver 2");
				
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().fullscreen();
				
				driver.get("https://jsfiddle.net/rlourenco/cp6bc9ka/4/embedded/result/");
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				return driver;
		}
		
		else 
		{
			
			
			System.setProperty("webdriver.safari.noinstall", "true");
			
			WebDriver driver = new SafariDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://jsfiddle.net/rlourenco/cp6bc9ka/4/embedded/result/");
		
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			return driver;
			
		}
		
		
	}
		
		

		
	
	
	
	

	/*public WebDriver browser_invoke()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/anilkumar/Downloads/chromedriver-4");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jsfiddle.net/rlourenco/cp6bc9ka/4/embedded/result/");
		
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		return driver;
	}*/
		
}
