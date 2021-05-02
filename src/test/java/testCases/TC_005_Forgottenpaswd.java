package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgottenpasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_005_Forgottenpaswd extends BaseClass {

	@Test
	public void test_forgottenpassword()
	{
		logger.info(" Starting TC_005_Forgottenpaswrd ");
		
		try
		{
			driver.get(rb.getString("appURL"));
			logger.info("Home Page Displayed ");
			
			driver.manage().window().maximize();
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account ");
			hp.clickLogin();
			logger.info("Clicked on Login ");
			
			LoginPage lp=new LoginPage(driver);
			
			lp.setEmail(rb.getString("email"));
			logger.info("Provided Email ");
			
			
			lp.clickforgottenpaswd();
			
			ForgottenpasswordPage fp=new ForgottenpasswordPage(driver);
			fp.email();
			fp.btncontinue();
			
			boolean alert=fp.alert_msg();
			if(alert)
			{
				Assert.assertTrue(true);
			}else
			{
				Assert.assertTrue(false);
			}
		}	
		catch(Exception e)
		{
			logger.fatal("Login Failed ");
			Assert.fail();
		}
		
		logger.info(" Finished TC_002_Login ");
		
	}
	
	
}
