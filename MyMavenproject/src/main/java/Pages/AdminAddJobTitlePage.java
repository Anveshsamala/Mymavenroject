package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminAddJobTitlePage 
{
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	public static WebElement menu_admin;
	
	@FindBy(id="menu_admin_Job")
	public static WebElement menu_admin_Job;
	
	@FindBy(id="menu_admin_viewJobTitleList")
	public static WebElement menu_admin_Job_JobTitle;
	
	@FindBy(name="btnAdd")
	public static WebElement addbutton;
	
	@FindBy(id="jobTitle_jobTitle")
	public static WebElement jobTitle_textfield;
	
	@FindBy(id="btnSave")
	public static WebElement jobTitle_Savebutton;
	
}
