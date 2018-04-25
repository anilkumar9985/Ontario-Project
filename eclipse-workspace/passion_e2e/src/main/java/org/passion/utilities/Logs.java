package org.passion.utilities;

import org.apache.log4j.Logger;

public class Logs {
	
	

	Logger Log = Logger.getLogger(Logs.class.getName());
	
	public void startTestCase(String message)
	{
		Log.info(message);
	}
	
	
	public void endTestCase(String message)
	{
		Log.info(message);
	}
	
	public void info(String message)
	{
		Log.info(message);
	}
	
	public void error(String message)
	{
		Log.error(message);
		
	}
	
	public void debug(String message)
	{
		Log.debug(message);
	}
}
