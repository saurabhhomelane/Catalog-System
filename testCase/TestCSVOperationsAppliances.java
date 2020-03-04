package testCase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.CSVOperationsAppliances;
import util.TestBaseNew;

public class TestCSVOperationsAppliances extends TestBaseNew {

	CSVOperationsAppliances CsvApps;

	@Test (priority=1)
	public void Appcsvoperations() throws InterruptedException {
		test = extent.createTest("CSVOperation");
		test.log(Status.INFO, "Select CSV option dropdown menu");
		test.info("Dropdown opens with three options");

		CsvApps = new CSVOperationsAppliances ();
		CsvApps.Appcsvoperation();

		test.log(Status.INFO, "Selected CSV dropdown with three options menu sucessfully");
	}
	@Test (priority=2)
	public void AppVersionHistorypage() throws InterruptedException {
		test = extent.createTest("VersionHistorypage");
		test.log(Status.INFO, "Select CSV option Version History Page");
		test.info("Version History details pop up page should appears on the screen");

		CsvApps = new CSVOperationsAppliances ();
		CsvApps.App_VersionHistory();

		test.log(Status.INFO, "Version History Page appears on the screen sucessfully");

	}
	@Test (priority=3)
	public void AppScrollbar() throws InterruptedException {

		test = extent.createTest("LooseFurScrollbar");
		test.log(Status.INFO, "Scroll on Version History Page to see complte history");
		test.info("Scroll till last element on page");

		CsvApps = new CSVOperationsAppliances ();
		CsvApps.Appscroll();

		test.log(Status.INFO, "Srolled sucessfully");

	}
	@Test (priority=4)
	public void Appdownloadcsvops() throws InterruptedException {
		test = extent.createTest("downloadcsvops");
		test.log(Status.INFO, "Select CSV option download csv");
		test.info("Notice Progress bar of download process");

		CsvApps = new CSVOperationsAppliances ();
		CsvApps.App_Downloadcsv();

		test.log(Status.INFO, "CSV file downloaded sucessfully");

	}
	@Test (priority=5)
	public void Appuploadcsvops() throws InterruptedException {

		test = extent.createTest("uploadcsvops");
		test.log(Status.INFO, "Select CSV option Upload");
		test.info("Select CSV File from system");
		test.info("Start Upload");

		CsvApps = new CSVOperationsAppliances ();
		CsvApps.Appuploadfile();

		test.log(Status.INFO, "CSV Uploaded sucessfully");

	}


}
