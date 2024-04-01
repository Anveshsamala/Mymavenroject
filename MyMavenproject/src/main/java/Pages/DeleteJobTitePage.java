package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteJobTitePage 
{
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	public static WebElement menu_admin;
	
	@FindBy(id="menu_admin_Job")
	public static WebElement menu_admin_Job;
	
	@FindBy(id="menu_admin_viewJobTitleList")
	public static WebElement menu_admin_Job_JobTitle;
	
		
	@FindBy(xpath="//*[@id=\"ohrmList_chkSelectRecord_11\"]")
	public static WebElement click_on_checkbox;
	
	@FindBy(id="btnDelete")
	public static WebElement click_on_delete_button;
	
	@FindBy(id="dialogDeleteBtn")
	public static WebElement click_on_delete_popup;
	
}
