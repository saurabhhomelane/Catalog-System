package util;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import pages.CreateCatagoryLooseFur;

import org.testng.annotations.AfterTest;

/**
* This class contains the elements of post sign in basic questionaire from Estimator
* 
* @author  Pooja Rikibe
*/

public class TestBaseNew extends Extent{
	
	public static WebDriver driver;
	LibraryFile lib= new  LibraryFile();
    public static Properties prop;
	static String result;
	 String intpgurl;
//	static Extent extent;

	
	  public void beforeTest() throws IOException {
		generateReport();
	}
	
	 @BeforeTest
	  public void BeforeClass() throws IOException, InterruptedException {
		 LibraryFile prop = new LibraryFile();
		
		//System.setProperty("webdriver.gecko.driver",
		//System.getProperty("user.dir") + "//src//test//resources//drivers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HL1768\\Documents\\Drivers\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("test-type");
	    options.addArguments("start-maximized");
	    options.addArguments("--js-flags=--expose-gc");  
	    options.addArguments("--enable-precise-memory-info"); 
	    options.addArguments("--disable-popup-blocking");
	    options.addArguments("--disable-default-apps");
	    options.addArguments("test-type=browser");
	    options.addArguments("disable-infobars");
	    options.addArguments("--disable-notifications");
		
	   // driver = new FirefoxDriver();
	    driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String lnk = lib.getPropertiyfileObj("url");
		driver.get(lnk);
		
		//Temporary changes
		String Parentwinhandle = driver.getWindowHandle();
		System.out.println("Parent window handle:" +Parentwinhandle);
		driver.findElement(By.xpath("//button[@type= 'button']")).click();
		
        Set<String> handler = driver.getWindowHandles(); 
        
        // To handles the window sets
		for (String handle: handler) {
		if(!handle.equals(Parentwinhandle)) {
	   driver.switchTo().window(handle);
	   Thread.sleep(1000);
	   System.out.println("Title of the new child window:" +driver.getTitle());
	   //username
	   driver.findElement(By.id("identifierId")).sendKeys(prop.getPropertiyfileObj("username"));
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//div[@id = 'identifierNext']")).click();
	   Thread.sleep(500);
	   //Password
	   driver.findElement(By.name("password")).sendKeys(prop.getPropertiyfileObj("password"));
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//div[@id = 'passwordNext']")).click();	 
	   
	   driver.switchTo().window(Parentwinhandle);
       // Print the URL to the console
       System.out.println("Parent window URL: " + driver.getCurrentUrl());
       /*
       Thread.sleep(1000);
       intpgurl ="https://catalogue-stage.homelane.com/loose-furniture/category-browser";

       driver.navigate().to(intpgurl);*/
	  }
		
		}
		
	 }
		
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  

  @AfterClass
  public void afterClass() {
	  //driver.close();
	  //System.out.println("Driver Is Closed..");
  }

  

  @AfterTest
  public void afterTest() {
	 //driver.close();
	  //shutReport();
  }

}
