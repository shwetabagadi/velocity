package POM;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Utility;

public class FeedPage {
	WebDriver driver;
	String testId;
	String browserName;

	@FindBy (xpath = "//input[@placeholder='Search Facebook']")
	private WebElement searchtool;
	
	public FeedPage() {}
	public FeedPage(WebDriver driver, String testId, String browserName) throws InterruptedException 
	{
		this.driver=driver;
		this.browserName = browserName;
		this.testId = testId;
		
		Thread.sleep(2000);
		PageFactory.initElements(driver, this);	
	}
	
	   public void seachForProfile() throws IOException, InterruptedException 
		{
		   Utility.screenshot(this.driver,this.testId,this.browserName);
			searchtool.sendKeys("Bagadi sourabh");
			Utility.screenshot(this.driver,this.testId,this.browserName);
			searchtool.sendKeys(Keys.ENTER);
			Utility.screenshot(this.driver,this.testId,this.browserName);
		}
}
