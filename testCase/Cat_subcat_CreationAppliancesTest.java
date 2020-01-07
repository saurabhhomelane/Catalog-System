package testCase;

import org.testng.annotations.Test;

import pages.Cat_subcat_CreationAplliances;
import pages.CreateCatagoryLooseFur;
import util.TestBaseNew;

public class Cat_subcat_CreationAppliancesTest extends TestBaseNew {
	
	static Cat_subcat_CreationAplliances app;
	
	 @Test (priority=1)
	 public void appliancedropdown() throws InterruptedException {
		 app = new Cat_subcat_CreationAplliances();
		 
		 app.appliances(); 
	 }
	
	 @Test (priority=2)
	 public void creatCategory () throws InterruptedException {
		 app = new Cat_subcat_CreationAplliances();
		 app.createcategoryappliances();
		 
		 System.out.println("Category created sucessfully");
	 }
	
	@Test (priority=3)
	 public void createsubcat () throws InterruptedException {
		 app = new Cat_subcat_CreationAplliances();
		 //Thread.sleep(2000);
		 app.createSubcategoryappliances();
		 System.out.println("Subcategory created sucessfully");
	 } 
	 
	@Test (priority=4)
	public void scrolltest() throws InterruptedException {
		app = new Cat_subcat_CreationAplliances();	 
		app.scroll();
	}
	@Test (priority=5)
	public void AddNew() throws InterruptedException {
		app = new Cat_subcat_CreationAplliances();
		app.Addnewfield();
	} 
}
