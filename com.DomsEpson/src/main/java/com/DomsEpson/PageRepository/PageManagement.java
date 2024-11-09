package com.DomsEpson.PageRepository;

import org.openqa.selenium.WebDriver;

public class PageManagement {
	public WebDriver driver;
	public LoginPage loginpageobj;
	public Registerpage regsiterpageobj;
	public WelcomePage welcomepageobj;
	
	
	public PageManagement(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public LoginPage initloginpage() 
	{
		loginpageobj=new LoginPage(driver);
		return loginpageobj;
		
	}
	
	public WelcomePage initWelcomepage() 
	{
		welcomepageobj=new WelcomePage(driver);
		return this.welcomepageobj;
		
	}
	public Registerpage initRegisterpage() 
	{
		regsiterpageobj=new Registerpage(driver);
		return regsiterpageobj;
		
	}
}