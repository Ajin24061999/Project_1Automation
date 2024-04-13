package TestScriptsCalling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElements.Signin;

public class SigninScript {

	WebDriver driver;
	Signin sc;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority = 8)
	
	public void Sign_inWith_Correctdetails() throws InterruptedException
	{
		sc = new Signin(driver);
		sc.url();
		sc.clickonSignin();
		sc.Signin_details();
		
	}
	@Test(priority = 2)
	public void Sign_inWith_Blankdetails() throws InterruptedException
	{
		sc = new Signin(driver);
		sc.url();
		sc.clickonSignin();
		sc.BlankDetails();
	}
	@Test(priority = 3)
	public void signIN_invalidmail() throws InterruptedException
	{
		sc = new Signin(driver);
		sc.url();
		sc.clickonSignin();
		sc.InvalidMail();
	}
	@Test(priority = 4)
	public void signIN_invalidpass() throws InterruptedException
	{
		sc = new Signin(driver);
		sc.url();
		sc.clickonSignin();
		sc.InvalidPass();
	}
	@Test(priority = 5)
	public void signIN_Bothinvalid() throws InterruptedException
	{
		sc = new Signin(driver);
		sc.url();
		sc.clickonSignin();
		sc.BothInvalid();
	}
	@Test(priority = 6)
	public void CreateAccText() throws InterruptedException
	{
	
		sc = new Signin(driver);
		sc.url();
		sc.clickonSignin();
		if(sc.creatAcc().isDisplayed())
		{
			System.out.println("Button is active");
			sc.creatAcc().click();
			}
		else
		{
			System.out.println("Button is not active");
		}
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority = 7)
	public void Titleofpag() throws InterruptedException
	
	{
		sc = new Signin(driver);
		sc.url();
		sc.clickonSignin();
		String actualTitle = driver.getTitle();
		String expTitle = "Customer Login";
		if(actualTitle.equals(expTitle))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
	}
	
	
	@Test(priority =1)
	public void TextForgotpass_active_ornot() throws InterruptedException
	{
		//String actualtitle = sc.forgotpassText().getText();
		//String expectedtitle = "Forgot Your Password";
		sc = new Signin(driver);
		sc.url();
		sc.clickonSignin();
		if(sc.forgotpassText().isDisplayed())
{
	
	System.out.println("Text is present ");
	sc.forgotpassText().click();
}
else
{
	System.out.println("Text is absent");
}
		Thread.sleep(3000);
	}
	
	
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
