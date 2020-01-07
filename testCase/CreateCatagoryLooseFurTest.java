package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.CreateCatagoryLooseFur;
import util.TestBaseNew;

public class CreateCatagoryLooseFurTest  extends TestBaseNew {

	CreateCatagoryLooseFur create;
	EventFiringWebDriver eventfiringWebDriver;

	@Test (priority=1)
	public void creatCategory () throws InterruptedException {
		create = new CreateCatagoryLooseFur();
		create.createnewcategory();

		System.out.println("Category created successfully");
	}

	@Test (priority=2)
	public void createsubcat () throws InterruptedException {
		create = new CreateCatagoryLooseFur();
		//driver.findElement(By.xpath("//body/div[@id='root']/div[@class='category-browser']/div[@class='category-browser__container']/div[@class='category-browser__content']/div[@class='category-browser__view']/div[1]/div[3]")).click();

		//driver.findElement(By.cssSelector("div.category-browser__list-item active")).click();
		Thread.sleep(2000);
		create.createSubcategory();
		System.out.println("Subcategory created sucessfully");  
	} 
	
	@Test (priority=3)
	public void scrolltest() throws InterruptedException {
		create = new CreateCatagoryLooseFur();	 
		create.scroll();
	}
	@Test (priority=4)
	public void AddNew() throws InterruptedException {
		create = new CreateCatagoryLooseFur();
		create.Addnewfield();
	} 

	

}
