package pages;

//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {

	@FindBy(id="s-name")
	WebElement name ;
	
	@FindBy(id="s-surname")
	WebElement surname;
	
	@FindBy(id="s-address")
	WebElement address;
	
	@FindBy(id="s-zipcode")
	WebElement zipcode;
	
	@FindBy(id ="s-city")
	WebElement city;
	
	@FindBy(id="s-company")
	WebElement company;
	
	@FindBy(id="asap")
	WebElement asap;
	
	@FindBy(xpath = "//button[contains(text(),'Buy')]")
	WebElement buy;
	
	@FindBy(xpath="//h1[text()='Checkout']")
	WebElement chk;
	
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checkHeading()
	{
		 return chk.getText();
	}
	
	
	public void buyItems()
	{
		name.sendKeys("Jai");
		surname.sendKeys("Sri");
		address.sendKeys("OMR");
		zipcode.sendKeys("628504");
		city.sendKeys("Chennai");
		company.sendKeys("zuci");
		asap.click();
		buy.click();
		
////		try
////		{
//		buy.click();
////		}
////		catch(Exception e)
////		{
////			for(int i=0;i<2;i++)
////			{
////			buy.sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
////			if(buy.isDisplayed())
////			{
////				buy.click();
////				break;
////			}
////			}
////			if(!buy.isDisplayed())
////			{
////				throw new NoSuchElementException("button not found");
////			}
////		}
//	}
		
	}
	
	
}