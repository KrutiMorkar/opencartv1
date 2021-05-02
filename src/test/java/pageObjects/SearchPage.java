package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-search']")
	WebElement searchcriteriabox;
	WebElement target=searchcriteriabox;
	
	@FindBy(xpath="//div[@class='caption']/h4//a")
	WebElement searchresult;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	WebElement dismessage;
	
	public void serch_criteria(String value)
	{
		searchcriteriabox.sendKeys(value);
		//searchcriteriabox.getText();
	}
	
	public boolean resultvalidation()
	{
		//if(target.equals(searchresult)) 
		//{
		try
		{
		return(searchresult.isDisplayed());
		}catch(Exception e)
		{
			return(false);
		}
		/*}else {
			return(false);
		}*/
	}
	
	public boolean display_msg()
	{
		try
		{
		return(dismessage.isDisplayed());
		}catch(Exception e)
		{
			return(false);
		}
	}
}



	


