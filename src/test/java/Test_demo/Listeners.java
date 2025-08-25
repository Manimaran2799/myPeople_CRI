package Test_demo;


import java.time.LocalDate;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


/**
 * simple things u need to folow while generating extent reports using listener class
 * implement itestlistner interface to class
 * create obj for extentsparkreporter,extentreports,extenttest
 * 
 * set path for file while obj creation of esr
 * integrate esr and er using attachreporter()
 * 
 * create obj for extenttest like test=reports.createtest()
 * update status using 
 * tst.log()
 */
public class Listeners implements ITestListener{
	
	ExtentSparkReporter Spark;//UI
	ExtentReports report;//Common info on Ui 
	ExtentTest test;//status updation on report
	
	public LocalDate LocalDate() {
		LocalDate ld=LocalDate.now();
		return ld;
	}
	 public  void onStart(ITestContext context) {
		
		 //create obj for ESR and ER
		 Spark=new ExtentSparkReporter(System.getProperty("user.dir")+"/Folder/"+LocalDate()+"myreports.html");
		 report= new ExtentReports();
		 
		 //config layout 
		 Spark.config().setDocumentTitle("Demo report");
		 Spark.config().setTheme(Theme.DARK);
		 Spark.config().setReportName("Dave Batista");
		 
		 //we need to integrate Spark and report
		 report.attachReporter(Spark);
		 
		 //configure common info using setsystemtinfo()
		 report.setSystemInfo("ReporterName :", "Manimaaran");
		 report.setSystemInfo("Device name :", "Lenovo Ideapad Gaming");
		 report.setSystemInfo("Browser :", "Chrome");
		 
		   }
	
	public  void onTestSuccess(ITestResult result) {
		
		//steps 1.create an entry 1.make an updation
		
		test=report.createTest(result.getName());
		test.log(Status.PASS, "testcase passed"+ result.getName());
	    
	  }

	public void onTestFailure(ITestResult result) {
	  
		test=report.createTest(result.getName());
		test.log(Status.FAIL, "testcase failed "+result.getName());
	  }
	
	public  void onTestSkipped(ITestResult result) {
		test=report.createTest(result.getName());
		test.log(Status.SKIP, "testcase skipped "+result.getName());
	  }
	 public  void onFinish(ITestContext context) {
		   report.flush();
		  }
}
