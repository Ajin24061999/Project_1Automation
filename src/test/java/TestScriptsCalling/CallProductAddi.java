package TestScriptsCalling;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElements.AddToCart;

public class CallProductAddi {

	WebDriver driver;
	AddToCart ac ;
	@BeforeMethod
	public void launchB() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

	@Test(priority = 1)
	public void launchUrl() throws InterruptedException
	{
		ac = new AddToCart(driver);
		ac.LinkURL();
	}

	@Test(priority =2)
	public void productsTocarts() throws InterruptedException
	{
		ac = new AddToCart(driver);
		ac.LinkURL();
		ac.CliconButoon();
		//ac.searchbuar();
		
		Actions act = new Actions(driver);
		act.moveToElement(ac.searchbuar()).click();
		act.sendKeys("Shirt");
	    act.sendKeys(Keys.SPACE);
	    act.sendKeys(Keys.ENTER);
	    act.build().perform();	   
		ac.ADDProducts();
		Thread.sleep(6000);
		ac.Cartdet();
		
		
		ac.check();
	
		
	}
	@Test(priority =3)
	public void CreateAccFromAddCartPage() throws InterruptedException
	{
		ac = new AddToCart(driver);
		ac.LinkURL();
		ac.CliconButoon();
		//ac.searchbuar();
		Actions act = new Actions(driver);
		act.moveToElement(ac.searchbuar()).click();
		act.sendKeys("Shirt");
	    act.sendKeys(Keys.SPACE);
	    act.sendKeys(Keys.ENTER);
	    act.build().perform();	   
		ac.CreateAccfromAddcart();
		
	}
	@Test(priority =4)
	public void SignFromAddCartPage() throws InterruptedException
	{
		ac = new AddToCart(driver);
		ac.LinkURL();
		ac.CliconButoon();
		//ac.searchbuar();
		Actions act = new Actions(driver);
		act.moveToElement(ac.searchbuar()).click();
		act.sendKeys("Shirt");
	    act.sendKeys(Keys.SPACE);
	    act.sendKeys(Keys.ENTER);
	    act.build().perform();	   
		ac.signInFromAddCartPag();
		
	}
		@Test(priority = 5)
		public void CheckProduct() throws InterruptedException
		{
			ac = new AddToCart(driver);
			ac.LinkURL();
			ac.CliconButoon();
			//ac.searchbuar();
			
			Actions act = new Actions(driver);
			act.moveToElement(ac.searchbuar()).click();
			act.sendKeys("Shirt");
		    act.sendKeys(Keys.SPACE);
		    act.sendKeys(Keys.ENTER);
		    act.build().perform();	   
			ac.ADDProducts();
			Thread.sleep(6000);
			ac.Cartdet();			
			ac.check();
			//WebElement name = ac.CheckProduIspresent();
			if(ac.CheckProduIspresent().isDisplayed())
			{
				System.out.println("Product is present ");
			}
			else
				System.out.println("Product is absent");
			
			
			
			
			
		}
		
		
		
	}
	/*@AfterMethod
	public void close()
	{
		driver.quit();
	}*/
	
	
	

