package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateJobTitlePage 
{
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	public static WebElement menu_admin;
	
	@FindBy(id="menu_admin_Job")
	public static WebElement menu_admin_Job;
	
	@FindBy(id="menu_admin_viewJobTitleList")
	public static WebElement menu_admin_Job_JobTitle;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[17]/td[2]/a")
	public static WebElement click_on_specified_job;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement click_on_edit_button;
	
	@FindBy(id="jobTitle_jobTitle")
	public static WebElement clear_data;
	
	@FindBy(id="jobTitle_jobTitle")
	public static WebElement enter_data;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement click_on_save_button;
	
	
	
}
