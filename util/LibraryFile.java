
package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
/**
* This class contains the elements of post sign in basic questionaire from Estimator
* 
* @author  Prashant Choudhary
* @since   2019-09-17 
*/
public class LibraryFile  {
	
	static String result;
	
	public String getPropertiyfileObj(String key) throws IOException {
		FileInputStream fobj = new FileInputStream(
		System.getProperty("user.dir") + "//src//test//java//util//global.properties");
		Properties pobj = new Properties();
		pobj.load(fobj);
		String value = pobj.getProperty(key);
		return value;
	}
	
	public static String fn_GetTimeStamp() {
		DateFormat DF = DateFormat.getDateTimeInstance();
		Date dte = new Date();
		String DateValue = DF.format(dte);
		DateValue = DateValue.replaceAll(":", "_");
		DateValue = DateValue.replaceAll(",", "");
		return DateValue;
	}

	public static String fn_TakeSnapshot(WebDriver driver, String DestFilePath) throws IOException {
		String TS = fn_GetTimeStamp();
		TakesScreenshot tss = (TakesScreenshot) driver;
		File srcfileObj = tss.getScreenshotAs(OutputType.FILE);
		DestFilePath = DestFilePath + TS + ".png";
		File DestFileObj = new File(DestFilePath);
		FileUtils.copyFile(srcfileObj, DestFileObj);
		return DestFilePath;
	}

	public static String isElementPresent(WebElement element) {
		try {
			if (element.isDisplayed()) {
				result = "Element is present";
			}
		} catch (NoSuchElementException nse) {
			result = "Element is not present";
			nse.printStackTrace();
		}
		return result;
	}
	
	
	public static void textFieldsInputProcess(WebElement elementLocated,String credentialsSent) throws InterruptedException
	{
		WebElement element = elementLocated;
		element.click();
		Thread.sleep(500);
		element.clear();
		Thread.sleep(500);
		element.sendKeys(credentialsSent);
	}
	
	public static void dropdownFieldsInputProcess(WebElement elementLocated,String indexSent)
	{
		WebElement element = elementLocated;
		Select select = new Select(element);
		select.selectByIndex(Integer.parseInt(indexSent));
	}
	
	

}
