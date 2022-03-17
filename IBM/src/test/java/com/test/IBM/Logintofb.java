package com.test.IBM;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





import POM.FeedPage;
import POM.LoginPage;
import POM.LogoutSession;
import POM.MessengerSection;
import base.Broswer;


import utils.Utility;


public class Logintofb extends Broswer
{
	
	WebDriver driver;
	LoginPage loginpage;
	FeedPage searchProfile;
	MessengerSection messengerb; 
	LogoutSession logoutsession;
	String testId = "TestId1234";
	String browserName;
	
	@BeforeTest
	@Parameters("browsers")
	public void launchBrowser(String browserName) 
	{
		this.browserName = browserName;
		//System.out.println("before test"+browserName); 
		
		if (browserName.equalsIgnoreCase("Chorme"))
		{
	//		System.out.println("Chorme"+browserName);	
			driver = launchChromeBroswer();
		 
		}
		
		if (browserName.equalsIgnoreCase("Firefox"))
		{
		//	System.out.println("Firefox"+browserName);
			driver = launchFirefoxBrowser();
			
		}
		
	
		if (browserName.equalsIgnoreCase("Opera"))
		{
	//		System.out.println("Opera");
			driver = launchOperaBrowser();
			
		}
		
		
		if (browserName.equalsIgnoreCase("Edge"))
		{
		//	System.out.println("Edge");
			driver =launchEdgeBrowser();
			
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}	
	
	
	@BeforeClass
	public void createOfPOMClasses() throws InterruptedException 
	{
		System.out.println("before class");
		loginpage = new LoginPage(driver,testId,this.browserName);
		searchProfile = new FeedPage(driver,testId,this.browserName);
		messengerb = new MessengerSection(driver,testId,this.browserName);
		logoutsession = new LogoutSession(driver,testId,this.browserName);
		
	}	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException 
	{
		System.out.println("before method");
		driver.get("https://www.facebook.com/");
		//login to facebook
		
		ArrayList<String> newUsrNamePwd = Utility.getDataFromExcel();
		
		loginpage.sendUserName(newUsrNamePwd.get(0));
		loginpage.sendPasswordName(newUsrNamePwd.get(1));
		Utility.screenshot(this.driver,testId,this.browserName);
		loginpage.clickOnLogin();
		Utility.screenshot(this.driver,testId,this.browserName);
		Thread.sleep(2000);
	}
	
	@Test (priority = 1)
	public void testA() throws IOException, InterruptedException 
	{
		System.out.println("testa class");
		Utility.screenshot(this.driver,testId,this.browserName);
		searchProfile.seachForProfile();
		Utility.screenshot(this.driver,testId,this.browserName);
	}
	
	/*@Test (priority = 2)
	public void test() 
	{
		System.out.println("testb class");
		messengerb.openMessenger();
	}*/
	
	@AfterMethod
	public void afterMethod() throws InterruptedException, IOException 
	{
		System.out.println("after method ");
		Utility.screenshot(this.driver,testId,this.browserName);
		logoutsession.logoutDropdown();
		Utility.screenshot(this.driver,testId,this.browserName);
	}
	
	@AfterClass
	public void clearPOMobject() 
	{
		System.out.println("after class");
		loginpage = null;
		searchProfile = null;
		messengerb = null;
		logoutsession = null;
	}	
	

	@AfterTest
	public void closedBrowser() 
	{
		System.out.println("after test"); 
		driver.quit();
		driver = null;
		
		System.gc(); //delete alll the object wdout reference
	}	
		
}
