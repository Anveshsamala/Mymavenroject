package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMAddEmployeePage 
{
	@FindBy(id="menu_pim_viewPimModule")
	public static WebElement PIM_menu;
	
	@FindBy(id="menu_pim_addEmployee")
	public static WebElement pim_addEmployee;
	
	@FindBy(id="firstName")
	public static WebElement pim_addEmployee_Firstname;
	
	@FindBy(id="middleName")
	public static WebElement pim_addEmployee_middleName;
	
	@FindBy(id="lastName")
	public static WebElement pim_addEmployee_lastName;
	
	@FindBy(id="btnSave")
	public static WebElement pim_addEmployee_savebutton;
	
	
}
