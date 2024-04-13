package PageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchbar {

	WebDriver driver;

	public Searchbar(WebDriver idriver)
	{
		driver = idriver;
		
		PageFactory.initElements(driver,this);
	}
	
	//Repository
	@FindBy(xpath = "//div[@class='panel header']/child::ul/li[2]")WebElement signinbutton;
	/*@FindBy(xpath = "//ul[@id='ui-id-2']/child::li[1]")WebElement option1;
	@FindBy(xpath = "//ul[@id='ui-id-2']/child::li[2]")WebElement option2;
	@FindBy(xpath = "//ul[@id='ui-id-2']/child::li[3]") WebElement option3;
	@FindBy(xpath = "//ul[@id='ui-id-2']/child::li[4]") WebElement option4;
	@FindBy(xpath = "//ul[@id='ui-id-2']/child::li[5]") WebElement option5;
	@FindBy(xpath = "//ul[@id='ui-id-2']/child::li[6]") WebElement option6;*/
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
	}
	public void buttonclick()
	{
		signinbutton.click();
	}
	public WebElement searchbox()
	{
	
	
		return driver.findElement(By.id("search"));
	}
/*public void selectOption(String option)
	
	{
	
	WebElement selectop = driver.findElement(By.xpath("//input[@id='search']li[contains(text(), '\" + option + \"')]"));
	selectop.click();
	}*/
/*	public void Headeroptio1() throws InterruptedException
	{
		option1.click();
	}
	public void Headeroptio2()
	{
	
		option2.click();
	}*/
	
	
	
}
