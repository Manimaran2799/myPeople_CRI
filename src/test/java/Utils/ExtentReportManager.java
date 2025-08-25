package Utils;

import java.time.LocalDate;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager implements ITestListener {
	
	ExtentSparkReporter extent;//ui
	ExtentReports report;//common info
	ExtentTest test;//creating an entry and updating the status
	
	public  void onStart(ITestContext context) {
		extent=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/"+localDate()+"haboom.html");
		extent.config().setDocumentTitle("Haboom Testing");
		extent.config().setReportName("Functional Testing");
		
		//common info
		report=new ExtentReports();
		report.attachReporter(extent);
		
		report.setSystemInfo("Reportername : ", "ManiMaaran");
		report.setSystemInfo("Device name : ", "Lenovo Ideapad Gaming ");
		report.setSystemInfo("Browser : " , "Chrome");
		   
	  }
	public  void onTestSuccess(ITestResult result) {
	   //creating an entry on report
		test=report.createTest(result.getName());
		test.log(Status.PASS , "Testcase is Passed");
	  }
	public  void onTestFailure(ITestResult result) {
		test=report.createTest(result.getName());
		test.log(Status.FAIL , "Testcase is Failed");
	  }
	public  void onTestSkipped(ITestResult result) {
	    test=report.createTest(result.getName());
	    test.log(Status.SKIP, "Testcase is Skipped");
	  }
	
	public void onFinish(ITestContext context) {
	    report.flush();
	  }
	
		public LocalDate localDate() {
		LocalDate ld=LocalDate.now();
				return ld; 
	}
}
