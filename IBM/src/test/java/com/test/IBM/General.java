package com.test.IBM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class General {
	

	@BeforeSuite
	public void beforetSuite() 
	{
		System.out.println("before suite12");	
	}
	
	@BeforeTest
	public void beforetTest() 
	{
		System.out.println("before test12");	
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("before class12");
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium\\chromedriver_win32\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
	//	System.setProperty("webdriver.opera.driver","D:\\Selenium\\chromedriver_win32\\operadriver.exe");
	//	WebDriver driver = new OperaDriver();
		
	//	System.setProperty("webdriver.edge.driver","D:\\Selenium\\chromedriver_win32\\msedgedriver.exe");
	//	WebDriver driver = new EdgeDriver();
	}
		
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException 
	{
		System.out.println("before method12");
		
	}
	
	@Test (priority = 1)
	public void testA() 
	{
		System.out.println("testa class12");
		
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException 
	{
		System.out.println("after method12 ");
		
	}
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("after class12");
	}	
	@AfterTest
	public void afterTest() 
	{
		System.out.println("after test12");
		
	}
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("after suite12");	
	}
	

}
