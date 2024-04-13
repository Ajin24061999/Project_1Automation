package TestScriptsCalling;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageElements.MyAccount;

public class MyAccCall {

	WebDriver driver;
	MyAccount ma;
	@BeforeTest
	
	public void launchBrows() throws InterruptedException
	{
		driver= new ChromeDriver();
		Thread.sleep(3000);
	}
	
	@Test(priority =1)
	public void NavigateTo_MyAcc_FromSigninpage() throws InterruptedException
	{
		ma = new MyAccount(driver);
		ma.ulr();
		ma.dropbutton();
		ma.Myacc().click();
		Thread.sleep(5000);
	}
	@Test(priority =2)
	public void Navigate_To_MyAccFrom_ProductWin() throws InterruptedException
	{
		ma = new MyAccount(driver);
		ma.ulr();
		ma.FromProdWindow();
		Actions act = new Actions(driver);
		act.moveToElement(ma.searchbuar()).click();
		act.sendKeys("Shirt");
	    act.sendKeys(Keys.SPACE);
	    act.sendKeys(Keys.ENTER);
	    act.build().perform();
	    
	    ma.dropCli();
	    Thread.sleep(5000);
	    ma.Myacc().click();;
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
