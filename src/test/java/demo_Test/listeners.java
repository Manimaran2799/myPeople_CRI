package demo_Test;

import java.time.LocalDate;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listeners implements ITestListener{
	ExtentSparkReporter spark;//ui-->alignemnt,theme,doc title,report name--->to create the outline of the report
	ExtentReports reports;//common info-->
	ExtentTest test;//inorder to create the entries and enter the status of the each test
	
	public LocalDate LocalDate() {
		LocalDate ld=LocalDate.now();
		return ld;
	}
	public void onStart(ITestContext context) {
		
		//creating the template of the Reports
	   spark=new ExtentSparkReporter(System.getProperty("user.dir") +"/Reports/"+LocalDate()+"myreports.html");//creating obj for ESR and Path
	   spark.config().setDocumentTitle("Automation Testing");
	   spark.config().setReportName("Demo Testing");
	   spark.config().setTheme(Theme.DARK);
	   
	   
	   reports=new ExtentReports();
	   reports.attachReporter(spark);
	   reports.setSystemInfo("ReporterName :", "Manimaaran");
	   reports.setSystemInfo("Device name :", "Lenovo Ideapad Gaming");
	   reports.setSystemInfo("Browser :", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result) {
		
		//create an entry
		//update the status on the report
		test=reports.createTest(result.getName());
		test.log(Status.PASS, "TC is Passed"+result.getName());
	  
	  }
	
	  public  void onTestFailure(ITestResult result) {
		  
		  test=reports.createTest(result.getName());//creating an entry
		  test.log(Status.FAIL, "Tc is Failed"+ result.getName());//updating status
		    
	  }
	  
	  public  void onTestSkipped(ITestResult result) {
		  test=reports.createTest(result.getName());
		  test.log(Status.SKIP, "Tc is skipped"+ result.getName());
		  
		  }
	  public  void onFinish(ITestContext context) {
		    reports.flush();
	  }
}
