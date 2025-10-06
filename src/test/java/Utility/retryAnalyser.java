package Utility;

import org.testng.ITestResult;

public class retryAnalyser {

	
	private static int retrycount=0;
	private static final int  maxretrycount=2;
	
	
	public static boolean retry(ITestResult result) {
		if (retrycount < maxretrycount) {
			retrycount++;
			return true;
		}
		return false;
		
	}
}
