package javatest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportofLogin 
{
	public static String filepath="C:\\Users\\Anvesh\\eclipse-workspace\\MyMavenproject\\Reports\\LoginReport.html";
	@Test
public  void extentreport() 
{
ExtentHtmlReporter reporter=new ExtentHtmlReporter(filepath);
ExtentReports extent=new ExtentReports();
extent.attachReporter(reporter);
ExtentTest logger=extent.createTest("Login Test Pass and info");
logger.log(Status.INFO, "login test info");
logger.log(Status.PASS, "login test Pass");
extent.flush();


ExtentTest logger2=extent.createTest("Login Test fail;");
logger.log(Status.FAIL, "login test fail");
extent.flush();
}
}
