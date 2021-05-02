package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_006_Search extends BaseClass{
	@Test
	public void test_Login()
	{
		logger.info(" Starting TC_006_Search ");
		
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
			
			lp.setPassword(rb.getString("password"));
			logger.info("Provided Password ");
			
			lp.clickLogin();
			logger.info("Clicked on Login");
			
			
			boolean targetpage=lp.isMyAccountPageExists();
			
			if(targetpage)
			{
				logger.info("Login Success ");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Login Failed ");
				captureScreen(driver, "test_Login"); //Capturing screenshot
				Assert.assertTrue(false);
			}
			MyAccountPage mp=new MyAccountPage(driver);
			//mp.search_box("imac");
			mp.search_btn();
			
			SearchPage sp=new SearchPage(driver);
			//sp.serch_criteria("imac");
			
			/*boolean resultsearch=sp.resultvalidation();
			if(resultsearch)
			{
				Assert.assertTrue(true);
			}else
			{
				Assert.assertTrue(false);
			}*/
			
			mp.search_box("fitbit");
			boolean displaymsg=sp.display_msg();
			if(displaymsg)
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
		
		logger.info(" Finished TC_006_Search");
	}
	
}
