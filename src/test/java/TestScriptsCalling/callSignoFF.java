package TestScriptsCalling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElements.SignOff;

public class callSignoFF {

	WebDriver driver;
	SignOff so;
	@BeforeMethod
	public void launchbr() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority = 1)
	public void URl() throws InterruptedException
	{
		so = new SignOff(driver);
		so.uRl();
		so.cliSignoff();
	}
	@Test(priority = 2)
	public void Signof_fromWihlist() throws InterruptedException
	{
		so = new SignOff(driver);
		so.uRl();
		so.wishlist_signout();
	}
	@Test(priority = 3)
	public void Signoff_From_download() throws InterruptedException	{

		so = new SignOff(driver);
		so.uRl();
		so.SignofFRom_downloads();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
