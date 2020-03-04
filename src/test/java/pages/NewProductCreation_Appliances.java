package pages;

import static org.testng.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import util.TestBaseNew;

public class NewProductCreation_Appliances extends TestBaseNew{

	//Page Factory
	//interaction with subcategory browser
	@FindBy(xpath= "//span[@class='navbar__menu-item-name']")
	WebElement SubCatBrowserapp;
	
	@FindBy(xpath= "//div[2]//select[1]")
	WebElement categoryselectionapp;
	

	@FindBy(xpath= "//button[contains(text(),'Add new product')]")
	WebElement Addnewbuttonapp;

	@FindBy(xpath= "//div[@class='ap-modal__container large']//button[@class='ap-button--medium ap-button--blue'][contains(text(),'Save Changes')]")
	WebElement Savebuttonforvalidapp;

	@FindBy(xpath= "//div[5]//select[1]")
	WebElement BrandSelectioapp;
	//Mandatory fields for Basic Tab
	@FindBy(xpath= "//textarea[@placeholder='Enter Description']")
	WebElement productdescriptionapp;

	@FindBy(xpath= "//input[@placeholder='Enter HSN/SAC Code']")
	WebElement HSNSACcode;

	@FindBy(xpath= "//input[@placeholder='Enter Vendor SKU Code']")
	WebElement SKUcode ;

	@FindBy(xpath= "//html//body//div//div//div//div//div//div//div//div//div//label[contains(text(),'JIT')]//span")
	WebElement JITcode ;

	@FindBy(xpath= "//input[@placeholder='Enter Product Name']")
	WebElement Prodnamecode ;

	@FindBy(xpath= "//div[6]//select[1]")
	WebElement Stat ;

	@FindBy(xpath= "//input[@placeholder='Enter Manufacturing Code']")
	WebElement ManufacturingCodeapp ;

	@FindBy(xpath= "//input[@placeholder='Enter UOM']")
	WebElement UOMcode ;

	@FindBy(xpath= "//html//body//div//div//div//div//div//div//div//div//div//label[contains(text(),'Dropshipment')]//span")
	WebElement ProDropapp ;
	//Mandatory fields for Details Tab

	@FindBy(xpath= "//span[contains(text(),'Details')]")
	WebElement Detailsapp ;
	
	@FindBy(xpath= "//input[@placeholder='Enter 6CNNX']")
	WebElement Myfieldapp ;

	//Mandatory fields for Pricing Tab
	@FindBy(xpath= "//span[contains(text(),'Pricing')]")
	WebElement Pricingapp ;
	
	@FindBy(xpath= "//input[@placeholder='Enter MRP']")
	WebElement MRPapp ;

	@FindBy(xpath= "//label[contains(text(),'BLR-April2019')]")
	WebElement PriceBLR ;
	@FindBy(xpath= "//label[contains(text(),'CHE-April2019')]")
	WebElement PriceCHE ;
	@FindBy(xpath= "//label[contains(text(),'HYD-April2019')]")
	WebElement PriceHYD ;
	@FindBy(xpath= "//label[contains(text(),'MUM-April2019')]")
	WebElement PriceMUM ;
	@FindBy(xpath= "//label[contains(text(),'PUN-April2019')]")
	WebElement PricePune ;
	@FindBy(xpath= "//label[contains(text(),'KOL-April2019')]")
	WebElement PriceKOL ;
	@FindBy(xpath= "//label[contains(text(),'NCR-April2019')]")
	WebElement PriceNCR ;

	@FindBy(xpath= "//body/div[@id='root']/div[@class='subcategory']/div[@class='ap-modal sku-modal']/div[@class='ap-modal__container large']/div[@class='ap-modal__content']/div[@class='ap-modal__list mini-scroll']/div[@class='ap-modal__content-section']/div[@class='sku-modal__content']/div[@class='sku-modal__price-versions']/div[2]/input[1]")
	WebElement SP1 ;
	@FindBy(xpath= "//body/div[@id='root']/div[@class='subcategory']/div[@class='ap-modal sku-modal']/div[@class='ap-modal__container large']/div[@class='ap-modal__content']/div[@class='ap-modal__list mini-scroll']/div[@class='ap-modal__content-section']/div[@class='sku-modal__content']/div[@class='sku-modal__price-versions']/div[3]/input[1]")
	WebElement SP2 ;
	@FindBy(xpath= "//body/div[@id='root']/div[@class='subcategory']/div[@class='ap-modal sku-modal']/div[@class='ap-modal__container large']/div[@class='ap-modal__content']/div[@class='ap-modal__list mini-scroll']/div[@class='ap-modal__content-section']/div[@class='sku-modal__content']/div[@class='sku-modal__price-versions']/div[4]/input[1]")
	WebElement SP3 ;
	@FindBy(xpath= "//body/div[@id='root']/div[@class='subcategory']/div[@class='ap-modal sku-modal']/div[@class='ap-modal__container large']/div[@class='ap-modal__content']/div[@class='ap-modal__list mini-scroll']/div[@class='ap-modal__content-section']/div[@class='sku-modal__content']/div[@class='sku-modal__price-versions']/div[5]/input[1]")
	WebElement SP4 ;
	@FindBy(xpath= "//body/div[@id='root']/div[@class='subcategory']/div[@class='ap-modal sku-modal']/div[@class='ap-modal__container large']/div[@class='ap-modal__content']/div[@class='ap-modal__list mini-scroll']/div[@class='ap-modal__content-section']/div[@class='sku-modal__content']/div[@class='sku-modal__price-versions']/div[6]/input[1]")
	WebElement SP5 ;
	@FindBy(xpath= "//body/div[@id='root']/div[@class='subcategory']/div[@class='ap-modal sku-modal']/div[@class='ap-modal__container large']/div[@class='ap-modal__content']/div[@class='ap-modal__list mini-scroll']/div[@class='ap-modal__content-section']/div[@class='sku-modal__content']/div[@class='sku-modal__price-versions']/div[7]/input[1]")
	WebElement SP6 ;
	@FindBy(xpath= "//body/div[@id='root']/div[@class='subcategory']/div[@class='ap-modal sku-modal']/div[@class='ap-modal__container large']/div[@class='ap-modal__content']/div[@class='ap-modal__list mini-scroll']/div[@class='ap-modal__content-section']/div[@class='sku-modal__content']/div[@class='sku-modal__price-versions']/div[8]/input[1]")
	WebElement SP7 ;
	
	@FindBy(xpath= "//div[@class='sku-modal__price-versions']//div[2]//input[2]")
	WebElement OP ;

	@FindBy(xpath= "//div[@class='sku-modal__price-versions']//div[2]//input[3]")
	WebElement IP ;

	//Mandatory fields for Image Tab

	@FindBy(xpath= "//span[@class='sku-modal__tab'][contains(text(),'Images')]")
	WebElement Imageapp ;

	@FindBy(xpath= "//i[@class='fas fa-plus']")
	WebElement AddIMGbutttonapp ;

	@FindBy(xpath= "//div[@class='ap-modal__container large']//button[@class='ap-button--medium ap-button--blue-outline'][contains(text(),'Cancel')]")
	WebElement Cancelbuttonapp;
	
	@FindBy(xpath= "//div[12]//select[1]")
	WebElement payout ;

	//initialization of all the page objects/ Page Factory

	public NewProductCreation_Appliances () {
		PageFactory.initElements(driver, this);
	}

	//Actions

	public void appsubcategory () throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='navbar__menu-item-name']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[2]//ul[1]//li[2]//a[1]")).click();
		Thread.sleep(2000);
	}
	public void appcategorytype() throws InterruptedException {
		
		Select select2 = new Select (categoryselectionapp);
		categoryselectionapp.click();
		Thread.sleep(1000);
		select2.selectByValue("37");
		//Thread.sleep(1000);
	}


	public void appaddingnewproduct() throws InterruptedException {
		Addnewbuttonapp.click();
		//Thread.sleep(1000);
	}
	public void appvalidationformandatoryfeild() throws InterruptedException {

		Savebuttonforvalidapp.click();
		Thread.sleep(2000);
		
		String a1 = driver.findElement(By.xpath("//span[contains(text(),'Product Description is mandatory')]")).getText();
		String e1 = "Product Description is mandatory";
		Assert.assertEquals(a1, e1);
		System.out.println(a1);
		
		String a2 = driver.findElement(By.xpath("//span[contains(text(),'HSN/SAC Code is mandatory')]")).getText();
		String e2 = "HSN/SAC Code is mandatory";
		Assert.assertEquals(a2, e2);
		System.out.println(a2);
		
		String a3 = driver.findElement(By.xpath("//span[contains(text(),'Vendor SKU Code is mandatory')]")).getText();
		String e3 = "Vendor SKU Code is mandatory";
		Assert.assertEquals(a3, e3);
		System.out.println(a3);
		
		String a4 = driver.findElement(By.xpath("//span[contains(text(),'Product Name is mandatory')]")).getText();
		String e4 = "Product Name is mandatory";
		Assert.assertEquals(a4, e4);
		System.out.println(a4);
		
		String a5 = driver.findElement(By.xpath("//span[contains(text(),'UOM is mandatory')]")).getText();
		String e5 = "UOM is mandatory";
		Assert.assertEquals(a5, e5);
		System.out.println(a5);
		//String s1 = driver.findElement(By.xpath("//span[@class='sku-modal__error']")).getText();
		//System.out.println(s1);
		Thread.sleep(2000);
	}
	public void appbrands() throws InterruptedException {

		Select select = new Select (BrandSelectioapp);
		BrandSelectioapp.click();
		select.selectByValue("Kathedra");
		Thread.sleep(1000);
		select.selectByValue("Elica");
		Thread.sleep(1000);
		select.selectByValue("Urban Ladder");
		Thread.sleep(1000);
		select.selectByValue("Latitude");
		Thread.sleep(1000);
		select.selectByValue("Capella");
		Thread.sleep(1000);
		select.selectByValue("Faber");
		Thread.sleep(1000);
		select.selectByValue("Franke");
		Thread.sleep(1000);
		select.selectByValue("Carysil");
		Thread.sleep(1000);
		select.selectByValue("Flipkart Perfect Homes");
		Thread.sleep(1000);
	}
	public void appproddescip() throws InterruptedException {
		productdescriptionapp.sendKeys("test data for product creation");
		Thread.sleep(2000);
	}

	public void appHSNSACcode () throws InterruptedException {
		HSNSACcode.sendKeys("Test" + " - " + RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(3));
		Thread.sleep(2000);
	}
	public void appSKUcode() throws InterruptedException {
		SKUcode.sendKeys("Test" + " - " + RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(3));
		Thread.sleep(2000);
	}
	public void appJITCode() throws InterruptedException {
		JITcode.click();
		Thread.sleep(2000);
	}
	
	public void appProductName () throws InterruptedException {
		String s = RandomStringUtils.randomAlphanumeric(8);
		Prodnamecode.sendKeys("Test_" +s);
		Thread.sleep(2000);
	}
	public void appStatus() throws InterruptedException {
		Select select1 = new Select (Stat);
		Stat.click();
		select1.selectByValue("ONHOLD");
		Thread.sleep(1000);
		select1.selectByValue("AVAILABLE");
		Thread.sleep(2000);
	}
	public void appManiCode () throws InterruptedException {
		ManufacturingCodeapp.sendKeys(RandomStringUtils.randomAlphanumeric(8));
		Thread.sleep(2000);

	}
	public void appUOMcode() throws InterruptedException {
		UOMcode.sendKeys(RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(3));
		Thread.sleep(2000);
	}
	public void Payoutlable() throws InterruptedException {
		Select select2 = new Select (payout);
		payout.click();
		select2.selectByValue("Appliances");
		Thread.sleep(2000);
	}
	
	public void appProdcurementDrop () throws InterruptedException {
		ProDropapp.click();
Thread.sleep(3000);
	}
	public void appDetailtab() throws InterruptedException {
		Detailsapp.click();
		Thread.sleep(2000);
	}
	public void appEnterMyfield() throws InterruptedException {
		
		Myfieldapp.sendKeys("These details are for testing purpose");
		
		Myfieldapp.sendKeys("ertyuidfgh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter KowB6']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@placeholder='Enter kfkjJ']")).sendKeys("New requirement field");
	}
	public void appPricingtab() throws InterruptedException {
		Pricingapp.click();
		Thread.sleep(2000);
	}
	public String appMRPrice () throws InterruptedException {
	 MRPapp.sendKeys(RandomStringUtils.randomNumeric(5));
	 String s = MRPapp.getText();
		System.out.println(s);
        return s;
	}
	public void appPriceverBLR () throws InterruptedException {
		PriceBLR.click();
		Thread.sleep(2000);
	}
	
	public void appsellingprice() throws InterruptedException {
		SP1.clear();
		Thread.sleep(2000);
		SP1.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
	}
	public void appOperationPrice() throws InterruptedException {
		OP.clear();
		Thread.sleep(2000);
		OP.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);

	}
	public void appInstallPrice() throws InterruptedException {
		IP.clear();
		Thread.sleep(2000);
		IP.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
	}
	public void appPriceverall () throws InterruptedException {
		//PriceBLR.click();
		Thread.sleep(2000);
		PriceCHE.click();
		Thread.sleep(2000);
		
		SP2.clear();
		Thread.sleep(2000);
		SP2.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		
		PriceHYD.click();
		Thread.sleep(2000);
		SP3.clear();
		Thread.sleep(2000);
		SP3.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		
		PriceMUM.click();
		Thread.sleep(2000);
		SP4.clear();
		Thread.sleep(2000);
		SP4.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		
		PricePune.click();
		Thread.sleep(2000);
		SP5.clear();
		Thread.sleep(2000);
		SP5.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		
		PriceKOL.click();
		Thread.sleep(2000);
		SP6.clear();
		Thread.sleep(2000);
		SP6.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		
		PriceNCR.click();
		Thread.sleep(2000);
		SP7.clear();
		Thread.sleep(2000);
		SP7.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
	}
	public void appImageTab () throws InterruptedException {
		Imageapp.click();
		Thread.sleep(2000);

	}
	public void appaddimage () throws InterruptedException{
		//AddIMGbuttton.click();
		String FilePath = "C:\\Users\\HL1768\\sofa.PNG";
		WebElement choosefile = driver.findElement(By.xpath("//div[@class='subcategory__images-list-item']//section//div//input"));
		choosefile.sendKeys(FilePath);
		Thread.sleep(2000);	
	}

	public void appcancel () throws InterruptedException {
		Thread.sleep(2000);
		Cancelbuttonapp.click();
		Thread.sleep(2000);
	}
}
