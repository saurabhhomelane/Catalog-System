package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import pages.NewProductCreation_Appliances;
import util.TestBaseNew;

public class TestNewProductCreation_Appliances extends TestBaseNew {
	NewProductCreation_Appliances NewProduct;

	@Test (priority=0)
	public void APPsubcatnavigation() throws InterruptedException, IOException {
		test = extent.createTest("APPsubcatnavigation");
		test.log(Status.INFO, "Select Subcategory Browser");
		test.info("Navigating to Subcategory Browser Page");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png"); */
		 
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appsubcategory(); 
		
		test.log(Status.INFO, "Redirects to the SubCategory Browser Page");
	}

	@Test (priority=1)
	public void APPcategory() throws InterruptedException, IOException {
		test = extent.createTest("APPcategory");	
		test.log(Status.INFO, " Select Appliances Category from dropdown list");
		test.info("Select one random category");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appcategorytype();
		
		test.log(Status.INFO, "One category and its corrosponding sub category selected sucessfully");
	}

	@Test (priority=2)
	public void APPcreatenewproduct() throws InterruptedException, IOException {
		test = extent.createTest("APPcreatenewproduct");
		
		test.log(Status.INFO, "Select Create New Product option on UI");
		test.info("Product creation form appear on the screen ");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png"); */


		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appaddingnewproduct();
		test.log(Status.INFO, "Product creation form appears on UI");

	}

	@Test (priority=3)
	public void APPValidation  () throws InterruptedException, IOException {
		test = extent.createTest("APPValidation");
		
		test.log(Status.INFO, "Validate Field validation");
		test.info("Select Save button");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appvalidationformandatoryfeild();
		
		test.log(Status.INFO, "Error message should dispaly mandatory fields for product creation");
	}

	@Test (priority=4)
	public void APPbrandslist() throws InterruptedException, IOException {
		test = extent.createTest("APPbrandslist");
		
		test.log(Status.INFO, "Selection of Brand Type");
		test.info("Select Brand Type from dropdown options");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appbrands();
		
		test.log(Status.INFO, "Selected Brand Type Flipkart Perfect Homes Sucessfully");

	}

	@Test (priority=5)
	public void APPProductDescription() throws InterruptedException, IOException {
		test = extent.createTest("APPProductDescription");
		
		test.log(Status.INFO, "Description about the product");
		test.info("Enter description about the product");
	/*	test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appproddescip();
		test.log(Status.INFO, "Description of product added successfully");
	}
	@Test (priority=6)
	public void APPEnterHSNcode() throws InterruptedException, IOException {
		test = extent.createTest("APPEnterHSNcode");
		
		test.log(Status.INFO, "Enter HSN Code");
		test.info("Entered alphanumaric HSN Code for the product");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appHSNSACcode();
		test.log(Status.INFO, "HSN Code entered sucessfully");
	}

	@Test (priority=7)
	public void APPEnterSKUcode() throws InterruptedException, IOException {
		test = extent.createTest("APPEnterSKUcode");
		
		test.log(Status.INFO, "Enter SKU Code for product");
		test.info("Enter alphanumaric SKU code on form");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appSKUcode();
		test.log(Status.INFO, "SKU code added for the product");
	}

	@Test (priority=8)
	public void APPjitcodeenter () throws InterruptedException, IOException {
		test = extent.createTest("APPjitcodeenter");
		
		test.log(Status.INFO, "Select JIT option");
		test.info("Entered Jit ");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appJITCode();
		test.log(Status.INFO, "Selected option JIT");
	}

	@Test (priority=9)
	public void APPEnterProductName() throws InterruptedException, IOException {
		test = extent.createTest("APPEnterProductName");
		
		test.log(Status.INFO, "Name of Product");
		test.info("Enter unique Product name");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appProductName();
		test.log(Status.INFO, "Product name entered sucessfully");

	}

	@Test (priority=10)
	public void APPEnterstatus() throws InterruptedException, IOException {
		test = extent.createTest("APPEnterstatus");
		
		test.log(Status.INFO, "Select status from dropdown options");
		test.info("Selected status as Available");
	/*	test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appStatus();
		test.log(Status.INFO, "Selected status sucessfully");

	}

	@Test (priority=11)
	public void APPManufactureCode() throws InterruptedException, IOException {
		test = extent.createTest("APPManufactureCode");
		
		test.log(Status.INFO, "Enter manufacture Code for product");
		test.info("Manufacture code enetred");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appManiCode();
		test.log(Status.INFO, "Manufacture code entered successfully");

	}

	@Test (priority=12)
	public void APPEnterUOM () throws InterruptedException, IOException {
		test = extent.createTest("APPEnterUOM");
		
		test.log(Status.INFO, "Enter UOM");
		test.info("Enter Unit of Measurement for product");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appUOMcode();
		test.log(Status.INFO, "Selected UOM for product sucessfully");

	}
	@Test (priority=13)
	public void Apppauoutlable () throws InterruptedException, IOException {
		test = extent.createTest("Apppauoutlable");
		
		test.log(Status.INFO, "Select payout lable");
		test.info("Select suitable payout lable");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.Payoutlable();
		test.log(Status.INFO, "Appliances payout selected sucessfully");

	}
	@Test (priority=14)
	public void APPProcurementDrop () throws InterruptedException, IOException {
		test = extent.createTest("APPProcurementDrop");
		
		test.log(Status.INFO, "Select Procurement option");
		test.info("This step shows usage of info(details)");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appProdcurementDrop();
		
		test.log(Status.INFO, "Selected Procurement option sucessfully");
	}

	@Test (priority=15)
	public void APPEnterdetailstab() throws InterruptedException, IOException {
		test = extent.createTest("APPEnterdetailstab");
		
		test.log(Status.INFO, "Select details tab");
		test.info("Navigates to details tab");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appDetailtab();
		test.log(Status.INFO, "Selected Details tab sucessfully");

	}

	@Test (priority=16)
	public void APPEnterfieldvalue() throws InterruptedException, IOException {
		test = extent.createTest("APPEnterFIELDVALUE");
		
		test.log(Status.INFO, "Enter Field Value");
		test.info("Field value is mandatory field");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appEnterMyfield();
		test.log(Status.INFO, "Entered field value sucessfully");
	}

	@Test (priority=17)
	public void APPEnterPricingTab() throws InterruptedException, IOException {
		test = extent.createTest("APPEnterPricingTab");
		
		test.log(Status.INFO, "Select Pricing Tab");
		test.info("Naviagting to Pricing Tab");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appPricingtab();
		test.log(Status.INFO, "Redirects to Pricing tab sucessfully");

	} 
	@Test (priority=18)
	public void APPMPRPrice() throws InterruptedException, IOException {
		test = extent.createTest("APPMPRPrice");
		
		test.log(Status.INFO, "Enter MRP Price");
		test.info("Enter MRP price for product");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appMRPrice();
		test.log(Status.INFO, "Entered MRP price sucessfully");

	}
	@Test (priority=19)
	public void APPBLRPriceVer () throws InterruptedException, IOException {
		test = extent.createTest("APPBLRPriceVer");
		
		test.log(Status.INFO, "Select one Price Version");
		test.info("Select bangalore Price version");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appPriceverBLR();
		test.log(Status.INFO, "Bangalore Price version selected sucessfully");

	}

	@Test (priority=20)
	public void APPEnterSP() throws InterruptedException, IOException {
		test = extent.createTest("APPEnterSP");
		
		test.log(Status.INFO, "Enter Selling Price");
		test.info("Entered Selling Price");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appsellingprice();
		test.log(Status.INFO, "Entered selling price sucessfully");
	}

	@Test (priority=21)
	public void APPEnterOp () throws InterruptedException, IOException {
		test = extent.createTest("APPEnterOp");
		
		test.log(Status.INFO, "Operation Cost");
		test.info("Enter Operation Cost");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appOperationPrice();
		test.log(Status.INFO, "Operation cost entered sucessfully");

	}
	@Test (priority=22)
	public void APPEnterIP () throws InterruptedException, IOException {
		test = extent.createTest("APPEnterIP");
		
		test.log(Status.INFO, "Installation Price");
		test.info("Enter Installation Price");
	/*	test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appInstallPrice();
		test.log(Status.INFO, "Entered Installation Price sucessfully");

	}

	@Test (priority=23)
	public void APPEnterImageTab () throws InterruptedException, IOException {
		test = extent.createTest("APPEnterImageTab");
		test.log(Status.INFO, "Select Image Tab");
		test.info("Naviagetes to Image tab");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appImageTab();
		test.log(Status.INFO, "Redirects to image tab sucessfully");

	}

	@Test (priority=24)
	public void APPAddnewimage() throws InterruptedException, IOException {
		test = extent.createTest("APPAddnewimage");
		
		test.log(Status.INFO, "Select add image option");
		test.info("Select Image from system storage");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */

		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appaddimage();
		test.log(Status.INFO, "Image uploaded  sucessfully");
	}
	//Test Case to go back and select all price version
	@Test(priority= 25)
	public void APPallpriceversions() throws InterruptedException, IOException {
		test = extent.createTest("APPallpriceversions");
		
		test.log(Status.INFO, "Select all price version one by one");
		test.info("Enter Selling Price for all price version");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appPricingtab();
		Thread.sleep(3000);
		NewProduct.appPriceverall();
		test.log(Status.INFO, "Selected all price version sucessfully");

	}
	@Test (priority=26)
	public void APPsavechanges() throws InterruptedException, IOException {

		test = extent.createTest("APPsavechanges");
		
		test.log(Status.INFO, "Select Save button to create product");
		test.info("Click on save button");
		/*test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		 */
		NewProduct = new NewProductCreation_Appliances();
		NewProduct.appvalidationformandatoryfeild();
		test.log(Status.INFO, "Product created sucessfully");
	}

	/*

	 @Test (priority=26)
	 public void APPcanceloperation() throws InterruptedException {
	 test = extent.createTest("APPcanceloperation");
	 test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");

		 NewProduct = new NewProductCreation_Appliances();
		 NewProduct.appcancel();
	 } 
	 */
}
