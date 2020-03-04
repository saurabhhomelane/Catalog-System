package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import pages.NewProductCreation_LooseFurniture;
import util.TestBaseNew;

public class TestNewProductCreation_LooseFurniture extends TestBaseNew {
	NewProductCreation_LooseFurniture NewProduct;

	@Test (priority=0)
	public void subcatnavigation() throws InterruptedException, IOException {
		test = extent.createTest("subcatnavigation");
		
		test.log(Status.INFO, "Select Subcategory browser option");
		test.info("The user redirecting to Sub-category browser page");
		
		NewProduct = new NewProductCreation_LooseFurniture();
		NewProduct.LooseFursubcategory();
		
		test.log(Status.INFO, "Navigates to Sub category Browser sucessfully");
	}
	
	@Test (priority=1)
	public void category() throws InterruptedException, IOException {
		test = extent.createTest("category");
		
		test.log(Status.INFO, " Select Category from list");
		test.info("Selected TBD Category");
		
		 
		NewProduct.categorytype();
		test.log(Status.INFO, "Category selected successfully");
	}

	@Test (priority=2)
	public void createnewproduct() throws InterruptedException, IOException {
		test = extent.createTest("createnewproduct");
		
		test.log(Status.INFO, "Click on Create new Product button");
		test.info("Product creation pop up appears on screen");
		 
		NewProduct = new NewProductCreation_LooseFurniture();
		NewProduct.addingnewproduct();
		
		test.log(Status.INFO, "Product creation pop up window appears on screen");

	}

	@Test (priority=3)
	public void Validation  () throws InterruptedException, IOException {
		test = extent.createTest("Validation");
		
		test.log(Status.INFO, "Select Save Changes option");
		test.info("Click on Save Changes button");
		

		NewProduct.validationformandatoryfeild();
		test.log(Status.INFO, "Click on Save Changes button");
	}

	@Test (priority=4)
	public void brandslist() throws InterruptedException, IOException {
		test = extent.createTest("brandslist");
		
		test.log(Status.INFO, "Select Brand from dropdown list");
		test.info("Selected one brand for new product");
		

		NewProduct.brands();
		test.log(Status.INFO, "Flipkart Homes brand selected successfully");
	}

	@Test (priority=5)
	public void ProductDescription() throws InterruptedException, IOException {
		test = extent.createTest("ProductDescription");
		
		test.log(Status.INFO, "Enter produt desciption");
		test.info("Entered product description");
			 
		NewProduct.proddescip();
		test.log(Status.INFO, "Product Description entered successfully");
	}
	@Test (priority=6)
	public void EnterHSNcode() throws InterruptedException, IOException {
		test = extent.createTest("EnterHSNcode");
		
		test.log(Status.INFO, "Enter HSN code");
		test.info("Entered HSN code");	
		 
		NewProduct.HSNSACcode();
		test.log(Status.INFO, "Unique HSN Code entered successfully");
	}

	@Test (priority=7)
	public void EnterSKUcode() throws InterruptedException, IOException {
		test = extent.createTest("EnterSKUcode");
		
		test.log(Status.INFO, "Enter SKU code");
		test.info("Entered SKU code successfully");
		
		NewProduct.SKUcode();
		test.log(Status.INFO, "Unique SKU code entered successfully");

	}

	@Test (priority=8)
	public void jitcodeenter () throws InterruptedException, IOException {
		test = extent.createTest("jitcodeenter");
		
		test.log(Status.INFO, "Enter Jit code");
		test.info("JIT code entered");
		
		 
		NewProduct.JITCode();
		test.log(Status.INFO, "Selected JIT option");

	}

	@Test (priority=9)
	public void EnterProductName() throws InterruptedException, IOException {
		test = extent.createTest("EnterProductName");
		
		test.log(Status.INFO, "Enter Product Name");
		test.info("Entered Product Name"); 

		NewProduct.ProductName();
		test.log(Status.INFO, "Entered Product Name");

	}

	@Test (priority=10)
	public void Enterstatus() throws InterruptedException, IOException {
		test = extent.createTest("Enterstatus");
		
		test.log(Status.INFO, "Select status of product from dropdown options");
		test.info("Selected ONHOLD status");	 

		NewProduct.Status();
		test.log(Status.INFO, "Selected status for product");

	}

	@Test (priority=11)
	public void ManufactureCode() throws InterruptedException, IOException {
		test = extent.createTest("ManufactureCode");
		
		test.log(Status.INFO, "Enter Manufacture Code");
		test.info("Entered manufacture code");
	
		NewProduct.ManiCode();
		test.log(Status.INFO, "Entered Manufacture Code successfully");

	}

	@Test (priority=12)
	public void EnterUOM () throws InterruptedException, IOException {
		test = extent.createTest("EnterUOM");
		
		test.log(Status.INFO, "Enter Unit of Measurement");
		test.info("Entered UOM");
		
		 
		NewProduct.UOMcode();
		test.log(Status.INFO, "Entered Unit of Measurement successfully");

	}

	@Test (priority=13)
	public void ProcurementDrop () throws InterruptedException, IOException {
		test = extent.createTest("ProcurementDrop");
		
		test.log(Status.INFO, "Enter Procurement");
		test.info("Entered Procurement");
		
		 
		NewProduct.ProdcurementDrop();
		test.log(Status.INFO, "Selected Procurement option");

	}

	@Test (priority=14)
	public void Enterdetailstab() throws InterruptedException, IOException {
		test = extent.createTest("Enterdetailstab");
		
		test.log(Status.INFO, "Select Details tab");
		test.info("Selected Details tab");
		

		NewProduct.Detailtab();
		test.log(Status.INFO, "Navigates to Details tab successfully");

	}

	@Test (priority=15)
	public void EnterDimenssions() throws InterruptedException, IOException {
		
		//test = extent.createTest("EnterDimenssions");
		
		test.log(Status.INFO, "Enter dimenssion");
		test.info("This step shows usage of info(details)");
		
		 

		//NewProduct.Dimenssions(); 
		test.log(Status.INFO, "Entered dimenssions");

	}

	@Test (priority=16)
	public void EnterPricingTab() throws InterruptedException, IOException {
		test = extent.createTest("EnterPricingTab");
		
		test.log(Status.INFO, "Select Pricing tab");
		test.info("Navigates to Pricing tab");
		
		NewProduct.Pricingtab();
		test.log(Status.INFO, "Selected Pricing tab");

	}
	@Test (priority=17)
	public void MPRPrice() throws InterruptedException, IOException {
		test = extent.createTest("MPRPrice");
		
		test.log(Status.INFO, "Enter MRP of Product");
		test.info("Entered MRP");
		
		NewProduct.MRPrice();
		test.log(Status.INFO, "Entered MRP price for product");

	}
	@Test (priority=18)
	public void BLRPriceVer () throws InterruptedException, IOException {
		test = extent.createTest("BLRPriceVer");
		
		test.log(Status.INFO, "Select Bangalore price version");
		test.info("Selected BLR price version option");
	
		NewProduct.Pricevern();
		test.log(Status.INFO, "Selected Bangalore Price version");

	}

	@Test (priority=19)
	public void EnterSP() throws InterruptedException, IOException {
		test = extent.createTest("EnterSP");
		
		test.log(Status.INFO, "Enter Selling Price");
		test.info("This step shows usage of info(details)");
		
		 
		NewProduct.sellingprice();
		test.log(Status.INFO, "Entered Selling Price");
	}

	@Test (priority=20)
	public void EnterOp () throws InterruptedException, IOException {
		test = extent.createTest("EnterOp");
		
		test.log(Status.INFO, "Enter Operational Price");
		test.info("Entered operational price");	 

		NewProduct.OperationPrice();
		test.log(Status.INFO, "Entered Operational Price");

	}
	@Test (priority=21)
	public void EnterIP () throws InterruptedException, IOException {
		test = extent.createTest("EnterIP");
		
		test.log(Status.INFO, "Enter Installation Price");
		test.info("Entered IP");
		
		 

		NewProduct.InstallPrice();
		test.log(Status.INFO, "Entered Installation Price");

	} 
	@Test (priority=22)
	public void EnterImageTab () throws InterruptedException, IOException {
		test = extent.createTest("EnterImageTab");
		
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		
		 

		NewProduct.ImageTab();
		test.log(Status.INFO, "Selected Image tab successfully");

	}
	@Test (priority=23)
	public void Addnewimage() throws InterruptedException, IOException {
		test = extent.createTest("Addnewimage");
		
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		
		 
		NewProduct.addimage();
		test.log(Status.INFO, "Added new Image of Product");

	}
	@Test(priority= 24)
	public void APPallpriceversions() throws InterruptedException, IOException {
		test = extent.createTest("APPallpriceversions");
		
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		
		
		NewProduct.Pricingtab();
		Thread.sleep(3000);
		NewProduct.appPriceverall();
		test.log(Status.INFO, "Select all Price versions as per city");

	}
	@Test (priority=25)
	public void savechanges() throws InterruptedException, IOException {
		test = extent.createTest("savechanges");
		
		test.log(Status.INFO, "Create new product by selecting Save changes option");
		test.info("This step shows usage of info(details)");

		NewProduct.validationformandatoryfeild();
		test.log(Status.INFO, "Changes saved successfully");
	}

	/*
	 @Test (priority=3)
	 public void canceloperation() throws InterruptedException, IOException {
	 test = extent.createTest("canceloperation");
	 test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");

		 NewProduct = new NewProductCreation_LooseFurniture();
		 NewProduct.cancel();
	 } */

}
