package javatest;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 
{
	public static WebDriver driver;
	public static void main(String[] args) {
		String execteddate="1-September-2021";
		String emonth=execteddate.split("-")[1];
		String eyear=execteddate.split("-")[2];
		String edate=execteddate.split("-")[0];
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		WebElement datebtn=driver.findElement(By.className("ui-datepicker-trigger"));
		datebtn.click();
		WebElement actmonth=driver.findElement(By.className("ui-datepicker-month"));
		String amonth=actmonth.getText();
		WebElement actyear=driver.findElement(By.className("ui-datepicker-year"));
		String ayear= actyear.getText();
		System.out.println(emonth);
		System.out.println(eyear);
		System.out.println(edate);
		while((!emonth.equals(amonth)) || (!eyear.equals(ayear)))
		{
			WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span"));
			nextbtn.click();
			actmonth=driver.findElement(By.className("ui-datepicker-month"));
			amonth=actmonth.getText();
			actyear=driver.findElement(By.className("ui-datepicker-year"));
			ayear= actyear.getText();
		}
		java.util.List<WebElement> dates=  driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for(WebElement e:dates)
		{
			if(e.getText().trim().equals(edate))
			{
				System.out.println(e.getText());
				e.click();
				break;
			}
		}
//		WebElement adate=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[7]/a"));
//		if(adate.getText().equals(edate))
//		{
//			System.out.println(adate.getText());
//			adate.click();
//		}
				
	}
}
