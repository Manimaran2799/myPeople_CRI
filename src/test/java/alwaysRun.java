import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

/**
 * Attributes :AlwaysRun,Enabled,Description
 */

public class alwaysRun {

	// on real time example where in amazon platform we can visit or explore the
	// platform without the login or signup
	@Test(enabled = false, alwaysRun = true) // here enabled attributes will suppress the alwaysrun attributes
	public void Test1() {
		System.out.println("hi hello, this is Test 1");
	}

	/**
	 * where depended method will be execute first, non dependant method , if
	 * alwaysRun depending method will execute and ship=0
	 */
	@Test(description = "Test 2")
	public void Test2() {

		System.out.println("hi hello, this is Test2");
		throw new NoSuchElementException("Element is not there");
	}

	@Test(dependsOnMethods = "Test2", alwaysRun = true)
	public void Test3() {
		System.out.println("hi hello, this is Test3");
	}

}