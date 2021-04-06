package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_004_Logout_3 extends BaseClass {

	@Test
	public void test_Login()
	{
		logger.info(" Starting TC_004_Logout_3 ");
		
		try
		{
			driver.get(rb.getString("appURL"));
			logger.info("Home Page Displayed ");
			
			driver.manage().window().maximize();
			
			HomePage hp=new HomePage(driver);
			//hp.clickMyAccount();
			//logger.info("Clicked on My Account ");
			/*hp.clickLogin();
			logger.info("Clicked on Login ");*/
			
			//hp.click_acc();
			hp.myacc();
			hp.my_acc();
		}	
		catch(Exception e)
		{
			logger.fatal("Login Failed ");
			Assert.fail();
		}
		
		logger.info(" Finished TC_004_Logout_3 ");
		
	}
	
	
}
