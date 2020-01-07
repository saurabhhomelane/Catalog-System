package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TestBaseNew;

public class SubCategoryBrowserFurniture extends TestBaseNew{


	//Page factory to select Loose Furniture Subcategory dropdown Page

	@FindBy(xpath= "//span[@class='navbar__menu-item-name active']")
	WebElement SubCatBrowser;
	
	@FindBy(xpath= "//div[@class='subcategory__actions-group']//div[1]//select[1] ")
	WebElement Roomtype;
	
	@FindBy(xpath= "//div[2]//select[1]")
	WebElement category;
	//Price Version 
	@FindBy(xpath= "//button[contains(text(),'Price Version')]")
	WebElement Price;
	
	@FindBy(xpath= "//button[@class='ap-button--medium ap-button--blue-outline']")
	WebElement cancelbutton;




	public SubCategoryBrowserFurniture () {
		PageFactory.initElements(driver, this);
	}

	//Actions
	// Interacting with Loose Furniture Menu
	public void LooseFurniture () throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='navbar__menu-item-name active']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[1]//ul[1]//li[2]//a[1]")).click();
	}

	public void roomtype() throws InterruptedException {

		Select select = new Select (Roomtype);
		Roomtype.click();
		//select.selectByValue("Living");
		Thread.sleep(1000);
		System.out.println();
		select.selectByValue("2");
		Thread.sleep(1000);
		select.selectByValue("3");
		Thread.sleep(1000);
		select.selectByValue("4");
		select.selectByValue("1");
	}
	public void categorytype() throws InterruptedException {
		Select select = new Select (category);
		category.click();
		Thread.sleep(1000);
		select.selectByValue("30");
		Thread.sleep(1000);
		
	}
	// To check price Version List
	public void priceversion () throws InterruptedException {
		Price.click();
		Thread.sleep(3000);
		cancelbutton.click();
	}
	}
