package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties_methods {

	
Properties prop = new Properties();


	public String browser() throws IOException
	{
	FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");

	prop.load(fis);
	return prop.getProperty("browser");
	
	}
	
	public String fname() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");

		prop.load(fis);
		return prop.getProperty("Firstname");
	}
	
	public String lname() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");

		prop.load(fis);
		return prop.getProperty("Lastname");
	}
	
	public String email() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");

		prop.load(fis);
		return prop.getProperty("email");
	}
	
	public String title() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");

		prop.load(fis);
		return prop.getProperty("title");
	}
	
	public String ferror() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");

		prop.load(fis);
		return prop.getProperty("ferror");
	}
	
	public String lerror() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");

		prop.load(fis);
		return prop.getProperty("lerror");
	}
	
	public String emailerror() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");

		prop.load(fis);
		return prop.getProperty("emailerror");
	}
	
	public String successfulmess() throws IOException
	{
		FileInputStream fis = new FileInputStream("/Users/anilkumar/eclipse-workspace/passion_e2e/src/main/java/properties/input.properties");

		prop.load(fis);
		return prop.getProperty("successfulmess");
	}
	
}
