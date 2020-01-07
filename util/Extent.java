package util;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

/**
* This class contains the elements of post sign in basic questionaire from Estimator
* 
* @author  Prashant Choudhary
* @since   2019-09-12 
*/

public class Extent {

	public static ExtentReports report;
	public static ExtentTest logger;

	public static void generateReport() {
		report = new ExtentReports(System.getProperty("user.dir") + "//Report//homelane.html");
//		report.loadConfig(new File(System.getProperty("user.dir") + "//report_config.xml"));
//		report.addSystemInfo("Selenium version", "3.141.59").addSystemInfo("IDE", "Eclipse").addSystemInfo("Framework",
//				"Page Factory Model");
	}

	public void shutReport() {
		report.endTest(logger);
		report.flush();
	}

}
