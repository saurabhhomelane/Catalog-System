package testCase;

import org.testng.annotations.Test;

import pages.SubCategoryBrowserFurniture;
import pages.SubcategoryBrowserAppliances;
import util.TestBaseNew;

public class TestSubCategoryBrowserAppliances extends TestBaseNew  {
	
	SubcategoryBrowserAppliances subcatapp;
	
	
	@Test(priority=1)
	public void appliancesmenu() throws InterruptedException {
	
		 subcatapp = new SubcategoryBrowserAppliances();
		  
		 subcatapp.Appliancesdd();	 
		 
	}
	@Test(priority=2)
	public void roomtypeapp() throws InterruptedException {
		subcatapp.roomtypeapp();
	}
	@Test(priority=3)
	public void categoryfilterapp() throws InterruptedException {
		subcatapp.categorytypeapp();
	}
	@Test(priority=4)
	public void Pricevercheckapp() throws InterruptedException {
		subcatapp.priceversionapp();
	}


}
