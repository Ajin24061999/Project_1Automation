package TestScriptsCalling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElements.AccElemnts;

public class Script {

	WebDriver driver;
	AccElemnts cac;
	@BeforeMethod
	
	public void launchbro() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	@Test(priority = 1)
	public void CreatAccount()
	{
		cac = new AccElemnts(driver);
		cac.launchUrl();
		cac.clickonButton();
		cac.CAccount();
	}
	@Test(priority = 2)
	public void CreatAccountwithexistingdetails()
	{
		cac = new AccElemnts(driver);
		cac.launchUrl();
		cac.clickonButton();
		cac.CAccount();
	}
	@Test(priority = 3)
	public void CreatAccwithnumbersin_name()
	{
		cac = new AccElemnts(driver);
		cac.launchUrl();
		cac.clickonButton();
		cac.CreateAcwithnumbers();
	}
	@Test(priority = 4)
	public void InvalidMailwithout_gmail()
	{
		cac = new AccElemnts(driver);
		cac.launchUrl();
		cac.clickonButton();
		cac.InvalidMail();
	}
	@Test (priority = 5)
	public void differentPasswrds() throws InterruptedException
	{
		cac = new AccElemnts(driver);
		
		cac.launchUrl();
		cac.clickonButton();
		cac.Diffpasswrd();
		Thread.sleep(2000);
		
	}
	@Test (priority = 6)
	public void weakPass() throws InterruptedException
	{
cac = new AccElemnts(driver);
		
		cac.launchUrl();
		cac.clickonButton();
		cac.lessStrongPass();
		Thread.sleep(5000);
		
	}
	@Test (priority =7)
	public void aCCbutton()
	{
cac = new AccElemnts(driver);
		
		cac.launchUrl();
		cac.clickonButton();
		cac.Accbutton();
		Assert.assertTrue(cac.Accbutton().isDisplayed(), "Button is not displayed");
		
	}
	@Test (priority = 8)
	public void CheckWithAllblankFields()
	{
		cac = new AccElemnts(driver);
		cac.launchUrl();
		cac.clickonButton();
		cac.AllBlank();
	}
	@AfterMethod
	
	public void clos()
	{
		driver.quit();
	}
	
	
	
	

}
