package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TestBaseNew;

public class CatalogueListPage extends TestBaseNew {

	//Page Factory
	@FindBy(xpath= "//select[@class='form-group--select']")
	WebElement Roomdropdown;

	@FindBy(xpath= "//*[contains(text(),'Loose Furniture')]")
	WebElement LooseFurniture;

	@FindBy(xpath= "//*[contains(text(),'Appliances')]")
	WebElement Appliances;

	@FindBy(xpath= "//span[@class='navbar__signout']")
	WebElement Logout;

	@FindBy(xpath= "//img[@class= 'navbar__logo']")
	WebElement HLlogo;

	//initialization of all the page objects/ Page Factory

	public CatalogueListPage () {
		PageFactory.initElements(driver, this);
	}

	//Method to get title of cataloglistpage

	public String titleofpage() {
		return driver.getTitle();
	}
	public void room() throws InterruptedException {

		Select select = new Select (Roomdropdown);
		Roomdropdown.click();
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
	public void loosefurniture() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='navbar__menu-item-name active']"))).build().perform();
		//System.out.println("Loose Furniture tab");
		//return;
	}

	public void appliances () {
		Appliances.click();
	}

	public Boolean logocheck() throws InterruptedException {
		Thread.sleep(1000);
		Boolean li= HLlogo.isDisplayed();
		System.out.println(li);
		return li;
	}

	public SignInPage logoutcat() {
		Logout.click();
		return new SignInPage();
	}

	public void teammember() {

		driver.findElement(By.xpath("//*[contains(text(),'Team Members')]")).click();
	}


}


