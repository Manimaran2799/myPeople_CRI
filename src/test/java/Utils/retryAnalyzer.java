package Utils;

import org.testng.ITestResult;

public class retryAnalyzer {

	
	public boolean Retry(ITestResult result) {
		int count=0;
		int retrycount=2;
		
		while(count<retrycount) {
			count++;
			return true;
		}
		return false;
	}
}
