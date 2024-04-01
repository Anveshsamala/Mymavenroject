package javatest;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.utilities.Baseclass;
import com.utilities.Excelreuseclass;

import Pages.PIMAddEmployeePage;
import Pages.VerifyAddedEmployeepage;

public class LoginTest extends Baseclass
{
	
	public static String filename=System.getProperty("user.dir")+"\\TestData\\Readdata.xlsx";
	@Test(priority = 1)
	public void loginfunctionality() throws Exception
	{
		intialization();
		browserintialization();
		launchUrl();
		Pageintialization();
		Baseclass.loginfunction1();
		Thread.sleep(2000);
	}
	@Test(priority = 2, dataProvider = "mydataprovider", dependsOnMethods ="loginfunctionality")
	public static void addEmloyeeFunction(String fname, String mname, String lname) throws InterruptedException {
		moveToElement(PIMAddEmployeePageObject.PIM_menu);
		click(PIMAddEmployeePageObject.pim_addEmployee);
		senddata(PIMAddEmployeePageObject.pim_addEmployee_Firstname, fname);
		senddata(PIMAddEmployeePageObject.pim_addEmployee_middleName, mname);
		senddata(PIMAddEmployeePageObject.pim_addEmployee_lastName, lname);
		click(PIMAddEmployeePageObject.pim_addEmployee_savebutton);
		Thread.sleep(2000);
	}
	@Test(priority = 3, dependsOnMethods ="addEmloyeeFunction")
	public static void verifyAddedEmployeefunction1() throws InterruptedException
	{
		
		click(VerifyAddedEmployeepage.menu_pim_viewEmployeeList);
		senddata(VerifyAddedEmployeepage.menu_pim_empsearch, "0002");
		click(VerifyAddedEmployeepage.menu_pim_searchBtn);
		String exp=VerifyAddedEmployeepage.menu_pim_visiblesearchBtn.getText();
		if(exp.equalsIgnoreCase("0002"))
		{
			System.out.println("Employee id Existed");
		}
		else
		{
			System.out.println("Employee id NOT Existed");
		}
		Thread.sleep(2000);
	}
	@Test(priority = 5)
	public static void addJobTitle() throws InterruptedException
	{
		moveToElement(AdminAddJobTitlePageObject.menu_admin);
		moveToElement(AdminAddJobTitlePageObject.menu_admin_Job);
		click(AdminAddJobTitlePageObject.menu_admin_Job_JobTitle);
		click(AdminAddJobTitlePageObject.addbutton);
		senddata(AdminAddJobTitlePageObject.jobTitle_textfield, "QA ENGINEER ABC");
		click(AdminAddJobTitlePageObject.jobTitle_Savebutton);
		Thread.sleep(2000);
	}
	@Test(priority = 4,dependsOnMethods = "addJobTitle")
	public static void verifyAddedJobTitle() throws InterruptedException
	{
		moveToElement(VerifyJobTitleInAdminJobPageObject.PIM_menu);
		click(VerifyJobTitleInAdminJobPageObject.menu_pim_viewEmployeeList);
		click(VerifyJobTitleInAdminJobPageObject.search_first_Employee);
		click(VerifyJobTitleInAdminJobPageObject.click_on_job);
		click(VerifyJobTitleInAdminJobPageObject.click_on_Edit);
		Select select=new Select(VerifyJobTitleInAdminJobPageObject.search_jobtitle_in_dropdowm);
		select.selectByVisibleText("QA Lead");
		Thread.sleep(2000);
		String exp=VerifyJobTitleInAdminJobPageObject.required_jobtitle_in_dropdowm.getText();
		if(exp.equalsIgnoreCase("QA Lead"))
		{
			System.out.println("verified Job Title is present");
		}
		else
		{
			System.out.println("verified Job Title is NOT present");
		}
		Thread.sleep(2000);
	}
	@Test(priority = 6)
	public static void updateJobTitle()
	{
		moveToElement(UpdateJobTitlePageObject.menu_admin);
		moveToElement(UpdateJobTitlePageObject.menu_admin_Job);
		click(UpdateJobTitlePageObject.menu_admin_Job_JobTitle);
		click(UpdateJobTitlePageObject.click_on_specified_job);
		click(UpdateJobTitlePageObject.click_on_edit_button);
		cleardata(UpdateJobTitlePageObject.clear_data);
		senddata(UpdateJobTitlePageObject.enter_data, "MANAGER1321");
		click(UpdateJobTitlePageObject.click_on_save_button);
	}
	@Test(priority = 7)
	public static void deleteJobTitle()
	{
		moveToElement(DeleteJobTitePageObject.menu_admin);
		moveToElement(DeleteJobTitePageObject.menu_admin_Job);
		click(DeleteJobTitePageObject.menu_admin_Job_JobTitle);
		click(DeleteJobTitePageObject.click_on_checkbox);
		click(DeleteJobTitePageObject.click_on_delete_button);
		click(DeleteJobTitePageObject.click_on_delete_popup);
	}
	@DataProvider
	public static Object[][] mydataprovider() throws Exception
	{
		return Excelreuseclass.getdata(filename, "Addemployee");
	}
	
}
