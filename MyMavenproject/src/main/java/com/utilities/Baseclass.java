package com.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.net.ssl.SSLEngineResult.Status;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



import Pages.AdminAddJobTitlePage;
import Pages.DeleteJobTitePage;
import Pages.LoginPage;
import Pages.PIMAddEmployeePage;
import Pages.UpdateJobTitlePage;
import Pages.VerifyAddedEmployeepage;
import Pages.VerifyJobTitleInAdminJobPage;

public class Baseclass 
{
	public static Properties prop;
	public static FileInputStream fis;
	public static Actions action;
	public static File f;
	public static WebDriver driver;

	public static LoginPage loginpageObject;
	public static PIMAddEmployeePage PIMAddEmployeePageObject;
	public static VerifyAddedEmployeepage verifyAddedEmployeepageObject;
	public static AdminAddJobTitlePage AdminAddJobTitlePageObject;
	public static VerifyJobTitleInAdminJobPage VerifyJobTitleInAdminJobPageObject;
	public static UpdateJobTitlePage UpdateJobTitlePageObject;
	public static DeleteJobTitePage DeleteJobTitePageObject;

	public static void intialization() throws Exception
	{
		String configpath=System.getProperty("user.dir")+"\\src\\main\\java\\configration.properties";
		prop=new Properties();
		f=new File(configpath);
		fis=new FileInputStream(f);
		prop.load(fis);
	}
	public static void browserintialization()
	{
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gicko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		action=new Actions(driver);
	}
	public static void cleardata(WebElement element)
	{
		element.clear();
	}

	public static void launchUrl()
	{
		driver.get(prop.getProperty("URL"));
	}
	public static void click(WebElement element)
	{
		element.click();
	}

	public static void moveToElement(WebElement element) 
	{
		action.moveToElement(element).build().perform();
	}

	public static void senddata(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	
	public static void Pageintialization()
	{
		loginpageObject=PageFactory.initElements(driver, LoginPage.class);
		PIMAddEmployeePageObject=PageFactory.initElements(driver, PIMAddEmployeePage.class);
		verifyAddedEmployeepageObject=PageFactory.initElements(driver, VerifyAddedEmployeepage.class);
		AdminAddJobTitlePageObject=PageFactory.initElements(driver, AdminAddJobTitlePage.class);
		VerifyJobTitleInAdminJobPageObject=PageFactory.initElements(driver, VerifyJobTitleInAdminJobPage.class);
		UpdateJobTitlePageObject=PageFactory.initElements(driver, UpdateJobTitlePage.class);
		DeleteJobTitePageObject=PageFactory.initElements(driver, DeleteJobTitePage.class);
	}
	public static void loginfunction1()
	{
		//senddata(Login_username, data);
		//		loginpageObject.Login_username.sendKeys(prop.getProperty("username"));
		//		loginpageObject.Login_password.sendKeys(prop.getProperty("password"));
		//		loginpageObject.Login_button.click();

		senddata(LoginPage.Login_username, "Admin");
		senddata(LoginPage.Login_password, "admin123");
		Baseclass.click(LoginPage.Login_button);
	}
	
	
}
