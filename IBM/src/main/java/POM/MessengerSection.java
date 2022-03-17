package POM;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Utility;

public class MessengerSection {

	WebDriver driver;
	String testId;
	String browserName;
	
	@FindBy (xpath = "//input[@placeholder='Search Facebook']")
	private WebElement searchtool;
	
	@FindBy (xpath = "(//div[@class='oajrlxb2 qu0x051f esr5mh6w e9989ue4 r7d6kgcz nhd2j8a9 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x i1ao9s8h esuyzwwr f1sip0of abiwlrkh p8dawk7l lzcic4wl bp9cbjyn s45kfl79 emlxlaya bkmhp75w spb7xbtv rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv j83agx80 taijpn5t jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 tv7at329 thwo4zme tdjehn4e'])[1]")
	private WebElement messenger;
	
	
	public MessengerSection(WebDriver driver, String testId, String browserName) throws InterruptedException 
	{
		this.driver=driver;
		this.browserName = browserName;
		this.testId = testId;
		
		Thread.sleep(3000);
		PageFactory.initElements(driver, this);
		
	}
	
   public void openMessenger() throws IOException, InterruptedException 
	{
	    Utility.screenshot(this.driver,this.testId,this.browserName);
		messenger.click();
		Utility.screenshot(this.driver,this.testId,this.browserName);
	}
	
}

