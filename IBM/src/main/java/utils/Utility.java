package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void screenshot(WebDriver driver, String testId, String browserName) throws IOException, InterruptedException {
		System.out.println("taking SS");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date = new Date();
		//System.out.println(formatter.format(date));
	    String dateStr = formatter.format(date).toString();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\shwet\\OneDrive\\Documents\\Selenium Image\\" +browserName +"_" + testId +"_"+ dateStr +".png");
		FileHandler.copy(src, destination);   //FileHandler is new Class in Selenium which help us to store screenshots, create directory and so on
		Thread.sleep(1000);
		
}
	public static ArrayList<String> getDataFromExcel() throws IOException {
		
	ArrayList<String> usrNamePwd = new ArrayList<String>();
	
	String path = "D:\\cred\\cred.xlsx";

	// to fetch data from excel, we will create FileInputStream object, 
	//then we will create Sheet object by using WoWorkbookFactory.create().getSheet() method
	// then we will fetch data by sheet.getRow().getCell().getStringCellValue()/ getNumericCellValue() /getBooleanCellValue()
	FileInputStream file = new FileInputStream(path);
	Sheet sheet = WorkbookFactory.create(file).getSheet("Facebook");
	
	try 
	{
	 String userName = sheet.getRow(1).getCell(0).getStringCellValue();
	 usrNamePwd.add(userName);
	}
	catch(IllegalStateException e) 
	{	 	
		 Double userName = sheet.getRow(1).getCell(0).getNumericCellValue();
		 usrNamePwd.add(userName.toString());
	}
	catch(NullPointerException e) 
	{
	e.printStackTrace();	
	}
	catch(Exception e) 
	{
	e.printStackTrace();	
	}
	finally{
		System.out.println("Finally");
		}	
	
	try 
	{
	 String usrPwd= sheet.getRow(1).getCell(1).getStringCellValue();
	 usrNamePwd.add(usrPwd);
	}
	catch(IllegalStateException e) 
	{	 	
		 Double usrPwd= sheet.getRow(1).getCell(1).getNumericCellValue();	
		 usrNamePwd.add(usrPwd.toString());
	}
	catch(NullPointerException e) 
	{
	e.printStackTrace();	
	}
	catch(Exception e) 
	{
	e.printStackTrace();	
	}
	finally{
		System.out.println("Finally");
		}
	
	 return usrNamePwd;
	}

	
}


