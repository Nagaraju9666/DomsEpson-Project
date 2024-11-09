package com.DomsEpson.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.DomsEpson.ExcelfileLibrary.ReadExcelFile;
import com.DomsEpson.PageRepository.PageManagement;
import com.DomsEpson.PropertyfileLibrary.ReadPropertyFile;
import com.DomsEpson.WebDriverLibrary.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * This Class is used for Configure All Precondition and Post Condition for TestScript
 * And Also Initializing All the Library-utility class
 * 
 * 
 * @author Nagaraju*/

public class BaseTest 
{
	public PageManagement PageManagementobj;
	public ReadExcelFile excelutilityobj;
	public WebDriverUtility webdriverobj;
	public String username;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	ReadPropertyFile propertyfileobj;

	@BeforeSuite
	public void suiteSetup() {
		// Create the SparkReport
		spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the sparkReport Information
		spark.config().setDocumentTitle("Regression Testing for the learningSeleniumPage");
		spark.config().setReportName("RegressionSuite||Verification of the Welcome Page");
		spark.config().setTheme(Theme.STANDARD);

		// Create the extent report
		report = new ExtentReports();

		// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System Information in ExtentReport
		report.setSystemInfo("DeviceName:", "Lenovo");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-130.0.6723.92");
	}

	@AfterSuite
	public void suiteTerminateSetup() {
		// Flush the Report Information
		report.flush();
	}

	@Parameters({ "browsername", "weburl" })
	@BeforeClass
	public void browserSetup(String browser, String url) 
	{

	// CreateObject for All the Repository/Utility
		createObjects();

	// Fetch the Username From Excel File
		username = excelutilityobj.readSingleData("RegisterData", 1, 1);
		
	// step1:Launch the browser

		webdriverobj.launchBrowser(browser);;
		Reporter.log("Step1:Browser launched succesfully", true);

		// Maximize the Browser
		webdriverobj.maximizeTheBroser();
		Reporter.log("Step1.1:Maximized the browser succesfully", true);

		// Step2:Navigating to application via URL
		// String url=ReadPropertyFile.readdata("weburl");
		webdriverobj.NavigateToApplication(url);
		Reporter.log("Step2:Navigating to application via URL succesfully", true);

	}

	@AfterClass
	public void terminatebrowser() {
		// Step17:Close the browser
		webdriverobj.closeAllTheBroser();
		Reporter.log("Step10:Close the Browser succesfully", true);
	}

	public void createObjects() {
		webdriverobj = new WebDriverUtility();
		excelutilityobj = new ReadExcelFile();
		propertyfileobj = new ReadPropertyFile();
	}
}