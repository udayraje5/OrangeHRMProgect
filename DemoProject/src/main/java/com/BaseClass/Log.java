package com.BaseClass;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log 
{
	public static Logger log=Logger.getLogger(Log.class.getName());
//	private static Logger log=LogManager.getLogger( Log .class); 
	
	public static void startTestCase(String testCaseName)
	{
		log.info("   "+testCaseName+"test started successfully");
	}
	public static void endTestCase(String testCaseName)
	{
		log.info("   "+testCaseName+"test ended successfully");
	}
	public static void info(String message)
	{
		log.info(message);
	}
	public static void warn(String message)
	{
		log.warn(message);
	}
	public static void error(String message)
	{
		log.error(message);
	}
	public static void fatal(String message)
	{
		log.fatal(message);
	}
	public static void debug(String message)
	{
		log.debug(message);
	}
	
	
	

}
