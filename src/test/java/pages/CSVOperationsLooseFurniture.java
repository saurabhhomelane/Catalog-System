package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBaseNew;

public class CSVOperationsLooseFurniture extends TestBaseNew {
	JavascriptExecutor js = (JavascriptExecutor) driver;

	//Page Factory
	@FindBy(xpath= "//button[text()='CSV Options']")
	WebElement CSV ;
	@FindBy(xpath= "//span[contains(text(),'View Version History')]")
	WebElement VersionHistory  ;
	//Page Factory
	@FindBy(xpath= "//body/div[@id='root']/div[@class='subcategory']/div[2]/div[1]/div[2]/div[1]/div[1]")
	WebElement scrollonversionhistory;
	//Page Factory
	@FindBy(xpath= "//i[@class='fas fa-times-circle']")
	WebElement Cancel ;
	@FindBy(xpath= "//span[contains(text(),'Download CSV Data')]")
	WebElement Downloadcsv ;
	@FindBy(xpath= "//div[@class='submenu__content']//section//div//input")
	WebElement UploadCSV;

	//initialization of all the page objects/ Page Factory

	public CSVOperationsLooseFurniture () {
		PageFactory.initElements(driver, this);
	}

	// ACTIONS
	public void csvoperation() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//button[text()='CSV Options']"))).build().perform();
		CSV.click();
	}
	public void LooseFur_VersionHistory() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'View Version History')]"))).build().perform();
		Thread.sleep(1000);
		VersionHistory.click();
		Thread.sleep(1000);
	}
	public void LooseFurscroll() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='subcategory']/div[2]/div[1]/div[2]/div[1]/div[1]"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println(element.getText());
		Thread.sleep(5000);
		Cancel.click();
	}
	public void LooseFur_Downloadcsv() throws InterruptedException {
		CSV.click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Download CSV Data')]"))).build().perform();
		Thread.sleep(1000);
		Downloadcsv.click();
		Thread.sleep(5000);
	}
	public void uploadfile() throws InterruptedException {
		CSV.click();
		Thread.sleep(3000);
		String FilePath = "C:\\Users\\HL1768\\Downloads\\Custom Sofa Set (1).csv";
		WebElement choosefile = driver.findElement(By.xpath("//div[@class='submenu__content']//section//div//input"));
		choosefile.sendKeys(FilePath);
		Thread.sleep(2000);	
	}

}