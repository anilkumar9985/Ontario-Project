package com.channelassist.utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	public WebDriver driver;
	
	public WebDriver browserInvoke()
	{
		System.setProperty("webdriver.chrome.driver", new File("").getAbsolutePath()+File.separator+"DriverSource"+File.separator+"chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://store.demoqa.com/");
		
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

}
