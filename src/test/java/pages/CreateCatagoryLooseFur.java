package pages;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import util.TestBaseNew;

public class CreateCatagoryLooseFur  extends TestBaseNew {
	EventFiringWebDriver eventfiringWebDriver;
	 String lastRowcount;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	//Page Factory for Category creation
	@FindBy(xpath= "//body/div[@id='root']/div[@class='category-browser']/div[@class='category-browser__container']/div[@class='category-browser__content']/div[@class='category-browser__view']/div[1]/span[2]/i[1]")
	WebElement Createbutton;
	@FindBy(xpath= "//body/div[@id='root']/div[@class='category-browser']/div[@class='category-browser__container']/div[@class='category-browser__content']/div[@class='category-browser__view']/div[1]/div[2]/input[1]")
	WebElement Enternameofcat;

	//Page Factory for Sub-Category creation

	@FindBy(xpath= "//div[@class='category-browser__content']//div[2]//span[2]//i[1]")
	WebElement CreateSub;
	@FindBy(xpath= "//div[@class='category-browser__content']//div[2]//div[2]//input[1]")
	WebElement EnterNameSub;
	
	//Page Factory for dropdown option for New Field addition
	@FindBy(xpath= "//div[@class='category-browser__table-content mini-scroll']//div[2]//select[1]")
	WebElement Field1;
	@FindBy(xpath= "//div[@class='category-browser__table-content mini-scroll']//div[2]//select[1]")
	WebElement Field2;
	
	@FindBy(xpath= "//div[@class='category-browser__list--large']//div[3]//select[1]")
	WebElement Num1;
	
	@FindBy(xpath= "//div[@class='category-browser__list--large']//div[3]//select[1]")
	WebElement Num2;

	
	//initialization of all the page objects/ Page Factory
	public CreateCatagoryLooseFur () {
		PageFactory.initElements(driver, this);
	}

	//Actions performed
	public void createnewcategory() throws InterruptedException {
		Createbutton.click();
		Thread.sleep(2000);
		String s = RandomStringUtils.randomAlphanumeric(8);
		Enternameofcat.sendKeys("Test" +s);
		Thread.sleep(1000);
		Enternameofcat.sendKeys(Keys.ENTER);
		
		 //No.of rows 
        List<WebElement>  rows = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[66]")); 
        System.out.println("No of rows are : " + rows.size());
        int lastRow = rows.size();
		WebElement lastRowFetch =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div["+lastRowcount+"])"));
		
		lastRowFetch.click();
    }
		
	/*    String id = driver.findElement(By.xpath("//*[contains(text(), s1)]")).getAttribute("id");
		String id = Enternameofcat.getAttribute(s);
		System.out.println(id);

		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		List<WebElement> elements = element.findElements(By.xpath("//body//div[51]"));
		elements.get(elements.size() - 1).click(); */

	
	public void createSubcategory() throws InterruptedException {
		CreateSub.click();
		Thread.sleep(2000);
		String s1 = RandomStringUtils.randomAlphanumeric(8);
		EnterNameSub.sendKeys("Test" +s1);
		Thread.sleep(1000);
		EnterNameSub.sendKeys(Keys.ENTER); 
	
		
	} 
	//Scrolling of mini scroll bar present on webelement
	public void scroll () throws InterruptedException {
		/*
		EventFiringWebDriver eventfiringWebDriver = new EventFiringWebDriver(driver);
		Thread.sleep(2000);
		eventfiringWebDriver.executeScript("document.querySelector('div.category-browser div.category-browser__container div.category-browser__content:nth-child(2) div.category-browser__view div.category-browser__list--large:nth-child(3) div.category-browser__table div:nth-child(1) > div.category-browser__table-content.mini-scroll').scrollTop=1000");
		*/
		WebElement element = driver.findElement(By.xpath("//i[@class='fas fa-plus-circle']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println(element.getText());
	}
	
	public void Addnewfield() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='fas fa-plus-circle']")).click();
		String s3 = RandomStringUtils.randomAlphanumeric(5);
		driver.findElement(By.xpath("//input[@placeholder='Enter field name']")).sendKeys(s3);
		
		//Action for Optional Field
		Select select = new Select (Field1);
		Field1.click();
		Thread.sleep(1000);
		select.selectByValue("mandatory");
		Thread.sleep(1000);
		
		//Action for Numaric Field
		Select select1 = new Select (Num1);
		Num1.click();
		Thread.sleep(1000);
		select1.selectByValue("String");
		driver.findElement(By.xpath("//i[@class='fas fa-check-circle']")).click();
		Thread.sleep(4000);
		
		//Trying with other parameters 
		
		driver.findElement(By.xpath("//i[@class='fas fa-plus-circle']")).click();
		String s4 = RandomStringUtils.randomAlphanumeric(5);
		driver.findElement(By.xpath("//input[@placeholder='Enter field name']")).sendKeys(s4);
		
		//Action for Optional Field
		Select select2 = new Select (Field2);
		//Field2.click();
		Thread.sleep(1000);
		select2.selectByValue("optional");
		Thread.sleep(1000);
		
		//Action for Numaric Field
		Select select3 = new Select (Num2);
		//Num2.click();
		Thread.sleep(1000);
		select3.selectByValue("String");
		driver.findElement(By.xpath("//i[@class='fas fa-check-circle']")).click();
	}


}