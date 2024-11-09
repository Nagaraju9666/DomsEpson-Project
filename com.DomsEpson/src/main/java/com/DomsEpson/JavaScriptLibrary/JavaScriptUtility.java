package com.DomsEpson.JavaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.DomsEpson.WebDriverLibrary.WebDriverUtility;


/**
 * This Class provides the Reusable Method to Perform JavaScript Related Actions
 * 
 * 
 * @author Nagaraju*/

public class JavaScriptUtility {
	

	/**
	 * This Method Is Used To soFrame By Element
	 * 
	 * @param element
	 * @return void*/
	
	public static JavascriptExecutor javascriptobj;
	
	public static void enterData_DisabledElement(WebDriver element, String data)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].value='" + data + "'",element);
	}
	public static void click_DisabledElement(WebElement element)
		{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].click()",element);	
		}
	public static void defaultVerticalScrollBy()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;	
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}
	public static void defaultVerticalScrollTo()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
		javascriptobj.executeScript("window.scrollTo(1000,1000)");
	}
	public static void scrollUsingView(WebElement element, Boolean value)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].scrollIntoView("+value+");",element);
		
	}
	
}

