package com.DomsEpson.WebDriverLibrary;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This Class Provides the Reusable Methods To Perform All Browser Related Actions
 * *@author Nagaraju*/
public class WebDriverUtility {

	public WebDriver driver;
	public static WebDriver driver_static;
	public Select selectobj;
	public Actions actionobj;
	public Robot robotobj;
	WebDriverWait wait;
	
	/**
	 * This Method Is Used To Launch The Specific Browser
	 * 
	 * @param String Browser Name
	 * @return void*/
	public void launchBrowser(String browser)
	{
		//Launch the browser ------> Chrome, Edge, firefox
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver_static=driver;
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver_static=driver;
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver_static=driver;
			break;
		default:
			System.out.println("invalid input");
			driver_static=driver;
			break;
		}
	}
	
	/**
	 * This Method Is Used To Navigate To The Particular Application
	 * 
	 * @param String Url
	 * @return void*/
	
	public void NavigateToApplication(String url)
	{
		driver.get(url);
	}
	
	/**
	 * This Method Is Used To Maximize The Browser
	 * 
	 * @return void*/
	
	public void maximizeTheBroser()
	{
		driver.manage().window().maximize();
	}
	/**
	 * This Method Is Used To Close The Specific Browser
	 * 
	 * @return void*/
	
	public void closeTheBroser()
	{
		driver.close();
	}
	
	/**
	 * This Method Is Used To Close All The Specific Browser
	 * 
	 * @return void*/
	
	public void closeAllTheBroser()
	{
		driver.quit();
	}
	
	/**
	 * This Method Is Used For Implicitly Waiting Purpose
	 * 
	 * @param duration
	 * @return void*/
	
	public void waitImplicitly(long duration)
	{
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	
	/**
	 * This Method Is Used For Explicitly Waiting Purpose
	 * 
	 * @param duration, element
	 * @return void*/
	
	public void waitexplicitly(long duration, WebElement element)
	{
		wait=new WebDriverWait(driver, duration);
				 
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This Method Is Used For Selection From Dropdown by Index
	 * 
	 * @param element, index
	 * @return void*/
	
	public void selectOptionInDropdown(WebElement element, int index)
	{
		selectobj.selectByIndex(index);
	}
	
	/**
	 * This Method Is Used For Selection From Dropdown by Visibletext
	 * 
	 * @param element, visibletext
	 * @return void*/
	
	public void selectOptionInDropdown(WebElement element, String visibletext)
	{
		selectobj.selectByVisibleText(visibletext);
	}
	
	/**
	 * This Method Is Used For Selection From Dropdown by Value
	 * 
	 * @param value, element
	 * @return void*/
	
	public void selectOptionInDropdown(String value, WebElement element)
	{
		selectobj.selectByValue(value);
	}
	
	/**
	 * This Method Is Used To Perform MouseHover Action by MoveToElement
	 * 
	 * @param element
	 * @return void*/
	
	public void mouseHovering(WebElement element)
	{
		actionobj.moveToElement(element).perform();
	}
	
	/**
	 * This Method Is Used For KeyBoard Action by KeyPress
	 * 
	 * @return void*/
	
	public void pressTheKey_pageDown()
	{
		robotobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This Method Is Used For KeyBoard Action by KeyRelease
	 * 
	 * @return void*/
	
	public void ReleaseTheKey_pageDown()
	{
		robotobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This Method Is Used To Accept the AlertPopup
	 * 
	 * @return void*/
	
	public void alertPopupAccept()
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This Method Is Used To Dismiss the AlertPopup
	 * 
	 * @return void*/
	
	public void alertPopupDismiss()
	{
		driver.switchTo().alert().dismiss();;
	}
	
	/**
	 * This Method Is Used To switchControlToFrame By Index
	 * 
	 * @param index
	 * @return void*/
	
	public void switchControlToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This Method Is Used To switchControlToFrame By Element
	 * 
	 * @param element
	 * @return void*/
	
	public void switchControlToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * This Method Is Used To switchControlToMain
	 * 
	 * @return void*/
	
	public void switchBackControlToMain()
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This Method Is Used To switchControlToWindow By WindowAddress
	 * 
	 * @param windowaddress
	 * @return void*/
	
	public void switchControlToWindow(String windowaddress)
	{
		
		driver.switchTo().window(windowaddress);
	}
	
	
}