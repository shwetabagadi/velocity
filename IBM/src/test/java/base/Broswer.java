package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Broswer {
	
	public static WebDriver launchChromeBroswer() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver launchFirefoxBrowser() {
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\chromedriver_win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
   public static WebDriver launchOperaBrowser() {
		
	   System.setProperty("webdriver.opera.driver","D:\\Selenium\\chromedriver_win32\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		return driver;
	}
    
   public static WebDriver launchEdgeBrowser() {
		
	   System.setProperty("webdriver.edge.driver","D:\\Selenium\\chromedriver_win32\\msedgedriver.exe");
	   WebDriver driver = new EdgeDriver();
	   return driver;


}
   }

