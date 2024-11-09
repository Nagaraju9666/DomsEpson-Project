package com.DomsEpson.JavaLibrary;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This Class provides the Reusable Method to Perform Java-Related Actions
 * 
 * 
 * @author Nagaraju*/

public class JavaUtility 
{
	/**
	 * This Method Is Used For pause the Execution for SomeTime.
	 * 
	 * @param time
	 * @return void*/
	
	public static void pause(long time)
	{
try {
	Thread.sleep(time);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
	}
	
	/**
	 * This Method Is Used To Generate random Number
	 * 
	 * @param limit
	 * @return void*/
	
	public int generateRandomNum(int limit)
		{
		Random random=new Random();
		return random.nextInt(limit);
	}
	
	/**
	 * This Method Is Used To get Current Time
	 * 
	 * @return void*/
	
	public String getCurrentTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
	}
}
