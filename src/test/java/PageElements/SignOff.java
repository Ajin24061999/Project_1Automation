package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOff {

	
	WebDriver driver ;
	public SignOff(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	//Repositary
	@FindBy(xpath = "//button[@type='button']")WebElement drop;
	@FindBy(xpath = "//div[@class='customer-menu']/child::ul/child::li[3]")WebElement signOut;
	@FindBy(className = "authorization-link")WebElement signinbutt;
	@FindBy(id = "email") WebElement emAil;
	@FindBy(id = "pass")WebElement pAss;
	@FindBy(id = "send2") WebElement SiButt;
	@FindBy(xpath = "//div[@class='customer-menu']/child::ul/child::li[2]")WebElement wish;
	@FindBy(xpath = "//div[@id='block-collapsible-nav']/child::ul/li[3]")WebElement downloaPro;
	public void uRl() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
	}
	public void cliSignoff()
	{
		signinbutt.click();
		emAil.sendKeys("ajinkyaal.a99@gmail.com");
		pAss.sendKeys("Ajinkya@123");
		SiButt.click();
		drop.click();
		signOut.click();
	}
	public void wishlist_signout() throws InterruptedException
	{
		signinbutt.click();
		emAil.sendKeys("ajinkyaal.a99@gmail.com");
		pAss.sendKeys("Ajinkya@123");
		SiButt.click();
		drop.click();
		wish.click();
		Thread.sleep(5000);
		drop.click();
		signOut.click();
		
	}
	public void SignofFRom_downloads() throws InterruptedException
	{
		signinbutt.click();
		emAil.sendKeys("ajinkyaal.a99@gmail.com");
		pAss.sendKeys("Ajinkya@123");
		SiButt.click();
		drop.click();
		wish.click();
		downloaPro.click();
		Thread.sleep(5000);
		drop.click();
		signOut.click();
	}
	
}
