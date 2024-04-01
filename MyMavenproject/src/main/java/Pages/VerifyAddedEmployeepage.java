package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyAddedEmployeepage 
{
	

	@FindBy(id="menu_pim_viewEmployeeList")
	public static WebElement menu_pim_viewEmployeeList;

	@FindBy(name="empsearch[id]")
	public static WebElement menu_pim_empsearch;

	@FindBy(id="searchBtn")
	public static WebElement menu_pim_searchBtn;  

	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")
	public static WebElement menu_pim_visiblesearchBtn;


	
}
