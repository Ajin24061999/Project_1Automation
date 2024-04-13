package TestScriptsCalling;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElements.Searchbar;

public class Searchboxcalling {

	WebDriver driver;
	Searchbar sb ;
	
	@BeforeMethod
	public void launchbrow() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority = 1)
	
	public void searchboxClickable_ornot() throws InterruptedException
	{
		 sb = new Searchbar(driver);
		 sb.url();
		 sb.buttonclick();
		 
		 if(sb.searchbox().isEnabled())
		 {
			 System.out.println("Search box is clickable");
			 sb.searchbox().click();
			 sb.searchbox().sendKeys("xyz");
		 }
		 else
		 {
			 System.out.println("Search box is not clickble");
		 }
		 
	}
	@Test(priority = 2)
	public void SearchforProducts() throws InterruptedException
	{
		 sb = new Searchbar(driver);
		 sb.url();
		 sb.buttonclick();
		 Actions act = new Actions(driver);
		 act.moveToElement(sb.searchbox()).click();
		 act.sendKeys("Shirt");
		 act.sendKeys(Keys.SPACE);
		 Thread.sleep(5000);
		act.build().perform();
		
	}
	
	
	/*public void HeaderOption() throws InterruptedException
	{
		 sb.Headeroptio1();
		 sb.Headeroptio2();

		
	}*/

	
	
	
	
	
}
