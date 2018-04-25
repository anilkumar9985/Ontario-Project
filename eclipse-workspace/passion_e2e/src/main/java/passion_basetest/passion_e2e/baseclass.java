package passion_basetest.passion_e2e;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	
	public WebDriver driver;
	
	public baseclass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebDriver browser_invoke()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/anilkumar/Downloads/chromedriver-4");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jsfiddle.net/rlourenco/cp6bc9ka/4/embedded/result/");
		
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		return driver;
	}

}
