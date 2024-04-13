package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {

	WebDriver driver;
	public Signin(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	//Repository
	@FindBy(xpath = "//div[@class='panel header']/child::ul/li[2]")WebElement signinButton;
	@FindBy(id = "email") WebElement Mail;
	@FindBy(id = "pass") WebElement pass;
	@FindBy(id = "send2")WebElement button;
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
	}
	public void clickonSignin()
	{
		signinButton.click();
	}
	public void Signin_details()
	{
		Mail.sendKeys("ajinkyaal.a99@gmail.com");
		pass.sendKeys("Ajinkya@123");
	}
	public void BlankDetails()
	{
		Mail.sendKeys("");
		pass.sendKeys("");
		button.click();
	}
	public void InvalidMail()
	{
		Mail.sendKeys("ajinkyaal");
		pass.sendKeys("Ajinkya@123");
		button.click();
	}
	public void InvalidPass()
	{
		Mail.sendKeys("ajinkyaal.a99@gmail.com");
		pass.sendKeys("Aji23");
		button.click();
	}
	public void BothInvalid()
	{
		Mail.sendKeys("ajinkyaal.a99");
		pass.sendKeys("Aji23");
		button.click();
	}
	
	public WebElement creatAcc()
	{
		return driver.findElement(By.linkText("Create an Account"));
	}
	
	public WebElement forgotpassText()
	{
		Mail.sendKeys("ajinkyaal.a99@gmail.com");
		pass.sendKeys("Ajinkya@123");
		button.click();
		return driver.findElement(By.xpath("//div[@class = 'secondary']/a"));
	
	}
	
	
	
	
	
	
	
}
