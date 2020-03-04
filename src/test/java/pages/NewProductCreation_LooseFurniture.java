package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TestBaseNew;

public class NewProductCreation_LooseFurniture extends TestBaseNew{

	//Page Factory
	//interaction with subcategory browser
	@FindBy(xpath= "//span[@class='navbar__menu-item-name active']")
	WebElement SubCatBrowser;
	@FindBy(xpath= "//div[2]//select[1]")
	WebElement categoryselection;
	

	@FindBy(xpath= "//i[@class='fas fa-plus ico--bg']")
	WebElement Addnewbutton;

	@FindBy(xpath= "//div[@class='ap-modal__container large']//button[@class='ap-button--medium ap-button--blue'][contains(text(),'Save Changes')]")
	WebElement Savebuttonforvalid;

	@FindBy(xpath= "//div[5]//select[1]")
	WebElement BrandSelection;
	//Mandatory fields for Basic Tab
	@FindBy(xpath= "//textarea[@placeholder='Enter Description']")
	WebElement productdescription;

	@FindBy(xpath= "//input[@placeholder='Enter HSN/SAC Code']")
	WebElement HSNSAC;

	@FindBy(xpath= "//input[@placeholder='Enter Vendor SKU Code']")
	WebElement SKU ;

	@FindBy(xpath= "//html//body//div//div//div//div//div//div//div//div//div//label[contains(text(),'JIT')]//span")
	WebElement JIT ;

	@FindBy(xpath= "//input[@placeholder='Enter Product Name']")
	WebElement Prodname ;

	@FindBy(xpath= "//div[6]//select[1]")
	WebElement Stat ;

	@FindBy(xpath= "//input[@placeholder='Enter Manufacturing Code']")
	WebElement ManufacturingCode ;

	@FindBy(xpath= "//input[@placeholder='Enter UOM']")
	WebElement UOM ;

	@FindBy(xpath= "//html//body//div//div//div//div//div//div//div//div//div//label[contains(text(),'Dropshipment')]//span")
	WebElement ProDrop ;
	//Mandatory fields for Details Tab

	@FindBy(xpath= "//span[contains(text(),'Details')]")
	WebElement Details ;
	
	@FindBy(xpath= "//input[@placeholder='Enter Dimensions']")
	WebElement Dimension ;

	//Mandatory fields for Pricing Tab
	@FindBy(xpath= "//span[contains(text(),'Pricing')]")
	WebElement Pricing ;
	
	@FindBy(xpath= "//input[@placeholder='Enter MRP']")
	WebElement MRP ;

	@FindBy(xpath= "//label[contains(text(),'BLR-April2019')]")
	WebElement Priceversion ;
	
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
	

	@FindBy(xpath= "//body/div[@id='root']/div[@class='subcategory']/div[@class='ap-modal sku-modal']/div[@class='ap-modal__container large']/div[@class='ap-modal__content']/div[@class='ap-modal__list mini-scroll']/div[@class='ap-modal__content-section']/div[@class='sku-modal__content']/div[@class='sku-modal__price-versions']/div[2]/input[1]")
	WebElement SP ;

	@FindBy(xpath= "//div[@class='sku-modal__price-versions']//div[2]//input[2]")
	WebElement OP ;

	@FindBy(xpath= "//div[@class='sku-modal__price-versions']//div[2]//input[3]")
	WebElement IP ;

	//Mandatory fields for Image Tab

	@FindBy(xpath= "//span[@class='sku-modal__tab'][contains(text(),'Images')]")
	WebElement Image ;

	@FindBy(xpath= "//i[@class='fas fa-plus']")
	WebElement AddIMGbuttton ;

	@FindBy(xpath= "//div[@class='ap-modal__container large']//button[@class='ap-button--medium ap-button--blue-outline'][contains(text(),'Cancel')]")
	WebElement Cancelbutton;

	//initialization of all the page objects/ Page Factory

	public NewProductCreation_LooseFurniture () {
		PageFactory.initElements(driver, this);
	}

	//Actions

	public void LooseFursubcategory () throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='navbar__menu-item-name active']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[1]//ul[1]//li[2]//a[1]")).click();
		Thread.sleep(2000);
	}
	public void categorytype() throws InterruptedException {
		Select select2 = new Select (categoryselection);
		categoryselection.click();
		Thread.sleep(1000);
		select2.selectByValue("30");
		//Thread.sleep(1000);
	}


	public void addingnewproduct() throws InterruptedException {
		Addnewbutton.click();
		Thread.sleep(1000);
	}
	public void validationformandatoryfeild() throws InterruptedException {

		Savebuttonforvalid.click();	
		/*String s1 = driver.findElement(By.xpath("//span[@class='sku-modal__error']")).getText();
		System.out.println(s1); */
		Thread.sleep(1000);
	}
	public void brands() throws InterruptedException {

		Select select = new Select (BrandSelection);
		BrandSelection.click();
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
	public void proddescip() throws InterruptedException {
		productdescription.sendKeys("test data for product creation");
		Thread.sleep(2000);
	}

	public void HSNSACcode () throws InterruptedException {
		HSNSAC.sendKeys("Test" + " - " + RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(3));
		Thread.sleep(2000);
	}
	public void SKUcode() throws InterruptedException {
		SKU.sendKeys("Test" + " - " + RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(3));
		Thread.sleep(2000);
	}
	public void JITCode() throws InterruptedException {
		JIT.click();
		Thread.sleep(2000);
	}
	
	public void ProductName () throws InterruptedException {
		String s = RandomStringUtils.randomAlphanumeric(8);
		Prodname.sendKeys("Test_" +s);
		Thread.sleep(2000);
	}
	public void Status() throws InterruptedException {
		Select select1 = new Select (Stat);
		Stat.click();
		select1.selectByValue("AVAILABLE");
		Thread.sleep(1000);
		select1.selectByValue("ONHOLD");
		Thread.sleep(2000);
	}
	public void ManiCode () throws InterruptedException {
		ManufacturingCode.sendKeys(RandomStringUtils.randomAlphanumeric(8));
		Thread.sleep(2000);

	}
	public void UOMcode() throws InterruptedException {
		UOM.sendKeys(RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(3));
		Thread.sleep(2000);
	}
	public void ProdcurementDrop () throws InterruptedException {
		ProDrop.click();
Thread.sleep(3000);
	}
	public void Detailtab() throws InterruptedException {
		Details.click();
		Thread.sleep(2000);
	}
	public void Dimenssions() throws InterruptedException {
		
		Dimension.sendKeys("2000");
		Thread.sleep(2000);
	}
	public void Pricingtab() throws InterruptedException {
		Pricing.click();
		Thread.sleep(2000);
	}
	public void MRPrice () throws InterruptedException {
		MRP.sendKeys(RandomStringUtils.randomNumeric(5));
		Thread.sleep(2000);
	}
	public void Pricevern () throws InterruptedException {
		Priceversion.click();
		Thread.sleep(2000);
	}
	public void sellingprice() throws InterruptedException {
		SP.clear();
		Thread.sleep(2000);
		SP.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
	}
	public void OperationPrice() throws InterruptedException {
		OP.clear();
		Thread.sleep(2000);
		OP.sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);

	}
	public void InstallPrice() throws InterruptedException {
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
	
	public void ImageTab () throws InterruptedException {
		Image.click();
		Thread.sleep(2000);

	}
	public void addimage () throws InterruptedException{
		//AddIMGbuttton.click();
		String FilePath = "C:\\Users\\HL1768\\sofa.PNG";
		WebElement choosefile = driver.findElement(By.xpath("//div[@class='subcategory__images-list-item']//section//div//input"));
		choosefile.sendKeys(FilePath);
		Thread.sleep(2000);	
	}

	public void cancel () throws InterruptedException {
		Thread.sleep(2000);
		Cancelbutton.click();
		Thread.sleep(2000);
	}
}
