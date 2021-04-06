package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_004_Logout_2 extends BaseClass {
boolean result;
	@Test
	public void test_logout(){
		logger.info("Starting TC_004_Logout");
		try
		{
		driver.get(rb.getString("appURL"));
		logger.info("displyed home page");
		
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		logger.info("Provided Email ");
		
		lp.setPassword(rb.getString("password"));
		logger.info("Provided Password ");
		
		lp.clickLogin();
		logger.info("Clicked on Login");
		
		MyAccountPage mp=new MyAccountPage(driver);
		mp.lnk_logout();
		
		boolean acc_target=mp.acc_logoutpage();
		if(acc_target)
		{
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
		
		mp.click_acc();
		}catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info(" Finished TC_004_Logout ");
	}
}
