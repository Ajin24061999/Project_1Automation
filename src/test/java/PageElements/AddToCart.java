package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	

	WebDriver driver ;
	public AddToCart(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	//Repository
	@FindBy(xpath = "//div[@class='panel header']/child::ul/li[2]")WebElement ClickonButtSign;
	
	@FindBy(className = "product-image-photo")WebElement FirstTb;
	@FindBy(id = "option-label-size-143-item-166")WebElement sized;
	@FindBy(id= "option-label-color-93-item-50")WebElement colour;
	@FindBy(id = "product-addtocart-button")WebElement AddButton;
	@FindBy(xpath = "//div[@class = 'minicart-wrapper']/child::a")WebElement cartProd;
	@FindBy(xpath = "//div[@class='actions']/child::div/child::button")WebElement Checkout;
	@FindBy(xpath = "//div[@class='panel header']/child::ul/li[3]") WebElement createButton;
	@FindBy(xpath = "//div[@class='panel header']/child::ul/li[2]")WebElement signinButton;
//	@FindBy(className = "product-item-name")WebElement productname;
	
	public void LinkURL() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
	}
	public void CliconButoon()
	{
		ClickonButtSign.click();
	}
	public WebElement searchbuar()
	{
		return driver.findElement(By.id("search"));
	}
	public void ADDProducts()
	{
		FirstTb.click();
		sized.click();
		colour.click();
		AddButton.click();
	}
	public void signInFromAddCartPag()
	{
		FirstTb.click();
		sized.click();
		colour.click();
		AddButton.click();
		signinButton.click();
		
		
	}
	public void CreateAccfromAddcart()
	{
		FirstTb.click();
		sized.click();
		colour.click();
		AddButton.click();
	
		createButton.click();
		
	}
	
	public void Cartdet()
	{
		cartProd.click();
		
	}
	public void check()
	{
		Checkout.click();
	}
	public WebElement CheckProduIspresent()
	{
	
		return driver.findElement(By.className("product-item-name"));
	}
	public WebElement itemDetails()
	{
		return driver.findElement(By.xpath("//div[@class='product-item-details']"));
	}
	
	
	
	
	
}
