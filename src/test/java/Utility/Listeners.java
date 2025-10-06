package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener {

	// Step 1 create instance for esr,er, and et

	ExtentSparkReporter spark;// for ui
	ExtentReports report;// config common info for all testcases
	ExtentTest test;// for logging

	public void onTestStart(ITestResult result) {
		// step 2: create obj

		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/" + "Finzor.html");// created obj and
																										// also added
																										// path
		spark.config().setDocumentTitle("FinZor.html");
		spark.config().setReportName("Smoke testing");
		spark.config().setTheme(Theme.DARK);

		// step 3: creating obj for report
		report = new ExtentReports();
		report.attachReporter(spark);

		report.setSystemInfo("Reporter name : ", "Manimaaran");
		report.setSystemInfo("Device name :", "Lenovo Ideapad Gaming");
		report.setSystemInfo("Browser :", "Chrome");

	}

	public void onTestSuccess(ITestResult result) {
			
		test=report.createTest(result.getName());
		test.log(Status.PASS, "TC is passed"+ result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		test=report.createTest(result.getName());
		test.log(Status.SKIP, "TC is skipped"+ result.getName());
	}

	public void onTestFailure(ITestContext result) {
		test=report.createTest(result.getName());
		test.log(Status.FAIL, "TC is failed"+ result.getName());
	}
	
	public void onFinish(ITestContext result) {
	    report.flush();
	  }

}
