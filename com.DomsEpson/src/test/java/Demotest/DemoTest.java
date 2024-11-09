package Demotest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoTest{
	
	@Test
	public void DemoTesting()
	{
	//Create the SparkReport
		ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReports/report.html");
		
	// Configure the SparkReport information
		spark.config().setDocumentTitle("Regression Testing for the LearningSeleniumPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);
		
	// Create the Extent Report
		ExtentReports report=new ExtentReports();
		
	// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
	//Configure the system information in Extent Report
		report.setSystemInfo("DeviceName:","Lenovo");
		report.setSystemInfo("OperatingSystem","Windows 11");
		report.setSystemInfo("Browser","Chrome");
		report.setSystemInfo("Browser Version","Chrome-130.0.6723.92");
		
	// Create the Test information
		ExtentTest test= report.createTest("RegressionTest");
		
	// Steps information
		test.log(Status.INFO,"Step 1: launching the Browser Sucessful");
		test.log(Status.INFO,"Step 2: Navigating to the Application via URL Succesful");
		test.log(Status.PASS,"Step 3: Verify the WebPage Successful");
		if("Lenovo".equals("Lenovo"))
		{
			test.log(Status.PASS,"Step 4: Verified the WebElement displayed");
		}
		else
		{
			test.log(Status.PASS,"Step 5: Verified the WebElement not displayed");
		}
		test.log(Status.SKIP,"Step 6: Element is Hidden");
		
	// Flush the Report information
		report.flush();
		System.out.println("Execution done");
	}
	@Test
	public void DemoTesting1()
	{
	//Create the SparkReport
		ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReports/report.html");
		
	// Configure the SparkReport information
		spark.config().setDocumentTitle("Regression Testing for the LearningSeleniumPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);
		
	// Create the Extent Report
		ExtentReports report=new ExtentReports();
		
	// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
	//Configure the system information in Extent Report
		report.setSystemInfo("DeviceName:","Lenovo");
		report.setSystemInfo("OperatingSystem","Windows 11");
		report.setSystemInfo("Browser","Chrome");
		report.setSystemInfo("Browser Version","Chrome-130.0.6723.92");
		
	// Create the Test information
		ExtentTest test= report.createTest("RegressionTest");
		
	// Steps information
		test.log(Status.INFO,"Step 1: launching the Browser Sucessful");
		test.log(Status.INFO,"Step 2: Navigating to the Application via URL Succesful");
		test.log(Status.PASS,"Step 3: Verify the WebPage Successful");
		if("Lenovo".equals("Lenovo"))
		{
			test.log(Status.PASS,"Step 4: Verified the WebElement displayed");
		}
		else
		{
			test.log(Status.PASS,"Step 5: Verified the WebElement not displayed");
		}
		test.log(Status.SKIP,"Step 6: Element is Hidden");
		
	// Flush the Report information
		report.flush();
		System.out.println("Execution done");
	}
	@Test
	public void DemoTesting2()
	{
	//Create the SparkReport
		ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReports/report.html");
		
	// Configure the SparkReport information
		spark.config().setDocumentTitle("Regression Testing for the LearningSeleniumPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);
		
	// Create the Extent Report
		ExtentReports report=new ExtentReports();
		
	// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
	//Configure the system information in Extent Report
		report.setSystemInfo("DeviceName:","Lenovo");
		report.setSystemInfo("OperatingSystem","Windows 11");
		report.setSystemInfo("Browser","Chrome");
		report.setSystemInfo("Browser Version","Chrome-130.0.6723.92");
		
	// Create the Test information
		ExtentTest test= report.createTest("RegressionTest");
		
	// Steps information
		test.log(Status.INFO,"Step 1: launching the Browser Sucessful");
		test.log(Status.INFO,"Step 2: Navigating to the Application via URL Succesful");
		test.log(Status.PASS,"Step 3: Verify the WebPage Successful");
		if("Lenovo".equals("Lenovo"))
		{
			test.log(Status.PASS,"Step 4: Verified the WebElement displayed");
		}
		else
		{
			test.log(Status.PASS,"Step 5: Verified the WebElement not displayed");
		}
		//test.log(Status.SKIP,"Step 6: Element is Hidden");
		
	// Flush the Report information
		report.flush();
		System.out.println("Execution done");
	}
	@Test
	public void DemoTesting3()
	{
	//Create the SparkReport
		ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReports/report.html");
		
	// Configure the SparkReport information
		spark.config().setDocumentTitle("Regression Testing for the LearningSeleniumPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);
		
	// Create the Extent Report
		ExtentReports report=new ExtentReports();
		
	// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
	//Configure the system information in Extent Report
		report.setSystemInfo("DeviceName:","Lenovo");
		report.setSystemInfo("OperatingSystem","Windows 11");
		report.setSystemInfo("Browser","Chrome");
		report.setSystemInfo("Browser Version","Chrome-130.0.6723.92");
		
	// Create the Test information
		ExtentTest test= report.createTest("RegressionTest");
		
	// Steps information
		test.log(Status.INFO,"Step 1: launching the Browser Sucessful");
		test.log(Status.INFO,"Step 2: Navigating to the Application via URL Succesful");
		test.log(Status.PASS,"Step 3: Verify the WebPage Successful");
		if("Lenovo".equals("Lenovo"))
		{
			test.log(Status.PASS,"Step 4: Verified the WebElement displayed");
		}
		else
		{
			test.log(Status.PASS,"Step 5: Verified the WebElement not displayed");
		}
		//test.log(Status.SKIP,"Step 6: Element is Hidden");
		
	// Flush the Report information
		report.flush();
		System.out.println("Execution done");
	}
	@Test
	public void DemoTesting4()
	{
	//Create the SparkReport
		ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReports/report.html");
		
	// Configure the SparkReport information
		spark.config().setDocumentTitle("Regression Testing for the LearningSeleniumPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);
		
	// Create the Extent Report
		ExtentReports report=new ExtentReports();
		
	// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
	//Configure the system information in Extent Report
		report.setSystemInfo("DeviceName:","Lenovo");
		report.setSystemInfo("OperatingSystem","Windows 11");
		report.setSystemInfo("Browser","Chrome");
		report.setSystemInfo("Browser Version","Chrome-130.0.6723.92");
		
	// Create the Test information
		ExtentTest test= report.createTest("RegressionTest");
		
	// Steps information
		test.log(Status.INFO,"Step 1: launching the Browser Sucessful");
		test.log(Status.INFO,"Step 2: Navigating to the Application via URL Succesful");
		test.log(Status.PASS,"Step 3: Verify the WebPage Successful");
		if("Lenovo".equals("Lenovo"))
		{
			test.log(Status.PASS,"Step 4: Verified the WebElement displayed");
		}
		else
		{
			test.log(Status.PASS,"Step 5: Verified the WebElement not displayed");
		}
		//test.log(Status.SKIP,"Step 6: Element is Hidden");
		
	// Flush the Report information
		report.flush();
		System.out.println("Execution done");
	}
	@Test
	public void DemoTesting5()
	{
	//Create the SparkReport
		ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReports/report.html");
		
	// Configure the SparkReport information
		spark.config().setDocumentTitle("Regression Testing for the LearningSeleniumPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);
		
	// Create the Extent Report
		ExtentReports report=new ExtentReports();
		
	// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
	//Configure the system information in Extent Report
		report.setSystemInfo("DeviceName:","Lenovo");
		report.setSystemInfo("OperatingSystem","Windows 11");
		report.setSystemInfo("Browser","Chrome");
		report.setSystemInfo("Browser Version","Chrome-130.0.6723.92");
		
	// Create the Test information
		ExtentTest test= report.createTest("RegressionTest");
		
	// Steps information
		test.log(Status.INFO,"Step 1: launching the Browser Sucessful");
		test.log(Status.INFO,"Step 2: Navigating to the Application via URL Succesful");
		test.log(Status.PASS,"Step 3: Verify the WebPage Successful");
		if("Lenovo".equals("Lenovo"))
		{
			test.log(Status.PASS,"Step 4: Verified the WebElement displayed");
		}
		else
		{
			test.log(Status.PASS,"Step 5: Verified the WebElement not displayed");
		}
		//test.log(Status.SKIP,"Step 6: Element is Hidden");
		
	// Flush the Report information
		report.flush();
		System.out.println("Execution done");
	}

}