package POM;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class LoginPage {
	WebDriver driver;
	String testId;
	String browserName;
	
	@FindBy (xpath = "//input[@name ='email']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='pass']")
	private WebElement password ;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement loginButton ;
	
	public LoginPage(WebDriver driver, String testId, String browserName) throws InterruptedException 
	{
		this.driver=driver;
		this.browserName = browserName;
		this.testId = testId;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendUserName(String usrName) throws IOException 
	{
		
		userName.sendKeys(usrName);
	}
	
	public void sendPasswordName(String pwd) 
	{
		password.sendKeys(pwd);
	}
	
	public void clickOnLogin() throws IOException, InterruptedException 
	{
		Utility.screenshot(this.driver,this.testId,this.browserName);
		loginButton.click();
	}
	
	
}
