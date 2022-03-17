package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class LogoutSession
{
	WebDriver driver;
	String testId;
	String browserName;
	
	@FindBy (xpath ="(//div[@role='button'])[3]")
	private WebElement dropdownlist;
	
	@FindBy (xpath = "(//div[@class='oajrlxb2 gs1a9yip g5ia77u1 mtkw9kbi tlpljxtp qensuy8j ppp5ayq2 goun2846 ccm00jje s44p3ltw mk2mc5f4 rt8b4zig "
			+ "n8ej3o3l agehan2d sk4xxmp2 rq0escxv nhd2j8a9 mg4g778l pfnyh3mw p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x tgvbjcpo hpfvmrgz "
			+ "jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 i1ao9s8h esuyzwwr f1sip0of du4w35lb btwxx1t3 abiwlrkh p8dawk7l lzcic4wl ue3kfks5 "
			+ "pw54ja7n uo3d90p7 l82x9zwi a8c37x1j'])[5]")
	private WebElement logout;
	
	public LogoutSession(WebDriver driver, String testId, String browserName) throws InterruptedException 
	{
		this.driver=driver;
		this.browserName = browserName;
		this.testId = testId;
		
		Thread.sleep(2000);
		PageFactory.initElements(driver, this);
	}

	public void logoutDropdown() throws InterruptedException, IOException 
	{
		Utility.screenshot(this.driver,this.testId,this.browserName);
		dropdownlist.click();
		Utility.screenshot(this.driver,this.testId,this.browserName);
		Thread.sleep(2000);
		logout.click();
		Utility.screenshot(this.driver,this.testId,this.browserName);
		System.out.println("logout done successfully");		
	}

}
