package testCase;

import org.testng.annotations.Test;

import pages.SubCategoryBrowserFurniture;
import util.TestBaseNew;

public class TestSubCategoryBrowserFurniture extends TestBaseNew {
	SubCategoryBrowserFurniture subcatbrowser;
	
	
	
	
	@Test(priority=1)
	public void loosefursubmenu() throws InterruptedException {
		 subcatbrowser = new SubCategoryBrowserFurniture(); 
		 subcatbrowser.LooseFurniture();	 
		 
	}
	@Test(priority=2)
	public void roomtypedd() throws InterruptedException {
		subcatbrowser.roomtype();
	}
	@Test(priority=3)
	public void categoryfilter() throws InterruptedException {
		subcatbrowser.categorytype();
	}
	@Test(priority=4)
	public void Pricevercheck() throws InterruptedException {
		subcatbrowser.priceversion();
	}

}
