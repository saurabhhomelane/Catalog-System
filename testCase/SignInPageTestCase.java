package testCase;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CatalogueListPage;
import pages.SignInPage;
import util.TestBaseNew;

public class SignInPageTestCase extends TestBaseNew {
	
	SignInPage SIP; 
	String Parentwinhandle;
	
	// Local variable created for object of SignInPage class
	
	@Test
	public void catlogpagetitle() {
		
		 SIP = new SignInPage();
		String title = SIP.validatetitle();
		Assert.assertEquals(title, "Catalog System");
		//System.out.println(tit
	}
	
	@Test
	public void testlogin() throws InterruptedException, IOException {
		
		//Get current window handle 
		String Parentwinhandle = driver.getWindowHandle();
		System.out.println("Parent window handle:" +Parentwinhandle);
		SIP.SignIn();
		Set<String> handler = driver.getWindowHandles(); // To handles the window sets
		
		for (String handle: handler) {
		if(!handle.equals(Parentwinhandle)) {
	   driver.switchTo().window(handle);
	   Thread.sleep(1000);
	   System.out.println("Title of the new child window:" +driver.getTitle());
	   SIP.googlelogin();
		}
		}
	}
	
}
