package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

	WebDriver driver ;
	public MyAccount(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	//Repository
	@FindBy(xpath = "//div[@class='panel header']/child::ul/li[2]")WebElement signinButton;
	@FindBy(xpath = "//button[@type='button']")WebElement Account;
	@FindBy(id = "email") WebElement Mail1;
	@FindBy(id = "pass") WebElement pass1;
	@FindBy(id = "send2")WebElement button;
	
	public void ulr() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
	}
	public void dropbutton()
	{
		signinButton.click();
		Mail1.sendKeys("ajinkyaal.a99@gmail.com");
		pass1.sendKeys("Ajinkya@123");
		button.click();
		Account.click();
	}

	public void FromProdWindow()
	{
		signinButton.click();
		Mail1.sendKeys("ajinkyaal.a99@gmail.com");
		pass1.sendKeys("Ajinkya@123");
		button.click();
		
	}
	
	public void dropCli()
	{
		Account.click();
		
	}
	
	public WebElement searchbuar()
	{
		return driver.findElement(By.id("search"));
	}
	
	public WebElement Myacc()
	{
		return driver.findElement(By.xpath("//div[@class='customer-menu']/child::ul/child::li[1]"));
	}

	
	
	
	
}
