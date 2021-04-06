package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenpasswordPage {
	WebDriver driver;
	
	public ForgottenpasswordPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement forgotten_email;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;
	
	public void email() throws InterruptedException
	{
		Thread.sleep(3000);
		forgotten_email.sendKeys("pavanoltraining@gmail.com");
	}
	
	public void btncontinue() throws InterruptedException
	{
		Thread.sleep(3000);
		btn_continue.click();
	}
	public boolean alert_msg()
	{
		try
		{
		return(alertmsg.isDisplayed());
		}catch(Exception e)
		{
			return(false);
		}
		
	}
}
