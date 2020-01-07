package testCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CatalogueListPage;
import pages.SignInPage;
import util.TestBaseNew;

public class CatalogueListPageTestClass extends TestBaseNew {
	// Initialization of local variable created for objects of CatalogueListPage class

	static CatalogueListPage catalogue;
	
	 
	 @Test (priority=1)
 	public String Pagetitle() {
		catalogue = new CatalogueListPage ();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Catalog System";
		assertEquals("Catalog System",actualTitle);
		System.out.println(actualTitle);
		return expectedTitle; 
       	
		 /*String title = catalogue.titleofpage();
    	 //assert.assertEquals(title, "Catalog System");
  		AssertJUnit.assertEquals(title, "Catalog System");
  		System.out.println(title);
		return title; */
     }
		
     @Test (priority=2) 
     public void loosefurnituretab() throws InterruptedException {
    	 catalogue = new CatalogueListPage ();
    	 catalogue.loosefurniture();
    	 
     }
     
     @Test (priority=3)
     public void appliancestab() {
    	 catalogue.appliances();
    	 return;
     }
     
     @Test (priority=4)
     public void verifylogo() throws InterruptedException {
    	 catalogue = new CatalogueListPage ();
    	 catalogue.logocheck();
    	 
     }
     
     @Test (priority=5)
     public void roomtype() throws InterruptedException {
    	 catalogue = new CatalogueListPage ();
    	 catalogue.room();
     }
     /*
 	@Test (priority=6)
 	public void teammember1() {
 		catalogue.teammember();
 	}
     
     @Test (priority=7)
     public void signout() {
    	 //catalogue = new CatalogueListPage (); 
    	 catalogue.logoutcat();
     } */
 	
     }