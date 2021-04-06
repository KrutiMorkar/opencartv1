package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText="Register")
	WebElement lnkRegister;
	
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	@FindBy(xpath="//title[normalize-space()='Your Store']")
	WebElement homepagetitle;
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement acc_login;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']")
	WebElement my_account;
	
	@FindBy(xpath="//ul[@class='list-inline']//li[@class='dropdown']")
	WebElement myacc_logout;
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	
	}
	
	public void myacc()
	{
		myacc_logout.click();
	}
	/*public boolean validateURL(WebDriver driver,String expURL)
	{
		boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			result=true;
		}
		return result;
	}*/
	/*public void click_acc() throws InterruptedException
	{
		Thread.sleep(3000);
		acc_login.click();
	}*/
	
	public void my_acc()
	{
		my_account.click();
	}
}
