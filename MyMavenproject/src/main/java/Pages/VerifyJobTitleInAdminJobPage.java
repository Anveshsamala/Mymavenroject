package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyJobTitleInAdminJobPage 
{
	@FindBy(id="menu_pim_viewPimModule")
	public static WebElement PIM_menu;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public static WebElement menu_pim_viewEmployeeList;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[5]/td[3]/a")
	public static WebElement search_first_Employee;
	
	@FindBy(xpath="//*[@id=\"sidenav\"]/li[6]/a")
	public static WebElement click_on_job;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement click_on_Edit;
	
	@FindBy(xpath="//*[@id=\"job_job_title\"]")
	public static WebElement search_jobtitle_in_dropdowm;
	
	@FindBy(xpath="//*[@id=\"job_job_title\"]")
	public static WebElement required_jobtitle_in_dropdowm;
	
	
}
