package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	@FindBy(xpath="//h1[normalize-space()='Account Logout']")
	WebElement text_account_logout;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement lnkcontinue;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement right_link_logout;
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement acc_login;
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	public boolean acc_logoutpage() 
	{
		try 
		{
			return (text_account_logout.isDisplayed());
		}catch(Exception e)
		{
			return(false);
		}
	}
	
	public void clickcontinue()
	{
		lnkcontinue.click();
	}
	public void lnk_logout()
	{
		right_link_logout.click();
	}
	
	public void click_acc() throws InterruptedException
	{
		Thread.sleep(3000);
		acc_login.click();
	}
	
}
