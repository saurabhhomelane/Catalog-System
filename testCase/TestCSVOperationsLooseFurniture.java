package testCase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.CSVOperationsLooseFurniture;
import util.TestBaseNew;

public class TestCSVOperationsLooseFurniture extends TestBaseNew {

	CSVOperationsLooseFurniture csvops;



	@Test (priority=1)
	public void csvoperations() throws InterruptedException {

		test = extent.createTest("csvoperations");
		test.log(Status.INFO, "Select CSV Option dropdown menu");
		test.info("select CSV Option");
		test.log(Status.INFO, "CSV option dropdown selected sucessfully");
		csvops = new CSVOperationsLooseFurniture ();
		csvops.csvoperation();
		//test.log(Status.INFO, "CSV option dropdown selected sucessfully");

	}
	@Test (priority=2)
	public void VersionHistorypage() throws InterruptedException {

		test = extent.createTest("VersionHistorypage");
		test.log(Status.INFO, "This test case is for selection of loosefurniture tab menu");
		test.info("select loosefurniture tab");
		test.log(Status.INFO, "Loose Furniture Tab selected sucessfully");
		
		csvops = new CSVOperationsLooseFurniture ();
		csvops.LooseFur_VersionHistory();
		//test.log(Status.INFO, "Loose Furniture Tab selected sucessfully");

	}
	@Test (priority=3)
	public void LooseFurScrollbar() throws InterruptedException {

		test = extent.createTest("LooseFurScrollbar");
		test.log(Status.INFO, "This test case is for selection of loosefurniture tab menu");
		test.info("select loosefurniture tab");
		test.log(Status.INFO, "Loose Furniture Tab selected sucessfully");
		
		csvops = new CSVOperationsLooseFurniture ();
		csvops.LooseFurscroll();
		//test.log(Status.INFO, "Loose Furniture Tab selected sucessfully");

	}
	@Test (priority=4)
	public void downloadcsvops() throws InterruptedException {

		test = extent.createTest("downloadcsvops");
		test.log(Status.INFO, "This test case is for selection of loosefurniture tab menu");
		test.info("select loosefurniture tab");

		test.log(Status.INFO, "Loose Furniture Tab selected sucessfully");
		
		csvops = new CSVOperationsLooseFurniture ();
		csvops.LooseFur_Downloadcsv();
		//test.log(Status.INFO, "Loose Furniture Tab selected sucessfully");

	}
	@Test (priority=5)
	public void uploadcsvops() throws InterruptedException {

		test = extent.createTest("uploadcsvops");
		test.log(Status.INFO, "This test case is for selection of loosefurniture tab menu");
		test.info("select loosefurniture tab");
		test.log(Status.INFO, "Loose Furniture Tab selected sucessfully");

		csvops = new CSVOperationsLooseFurniture ();
		csvops.uploadfile();
		//test.log(Status.INFO, "Loose Furniture Tab selected sucessfully");

	}


}
