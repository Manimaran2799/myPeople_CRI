package Test;




import org.testng.Assert;
import org.testng.annotations.Test;

import Base_FinZor.Base_Class;
import PageObjectModels.Currency_master;

import PageObjectModels.Login_Page;

public class testCases_Login extends Base_Class {


	@Test
	public void TestCase() {
		Login_Page.getInstance().setUsername("rohit@xyz.com").setPassword("Pass@word1").clickLogin().ElementCheck();
	
		// Get current URL after login
	    String actualURL =Login_Page.getInstance().getURL();
	    String expectedURL = "https://stage.finzorcbs.com/customer";

	    // Print for debugging
	    System.out.println("Current URL: " + actualURL);

	    // Assertion
	    Assert.assertEquals(actualURL, expectedURL, "Login did not redirect to Customer page.");
	}


//
//	@Test
//	public void TestCase_002() {
//
//		Login_Page.getInstance().setUsername("rohit@xyz.com").setPassword("Pass@word1").clickLogin();
//		Currency_master.getinstance().Navi_to_currency().Create_new().SendCurrencyName("Brazil").getAllcountries()
//				.SendCurrencyPrompt("Brazil");
//
//	}

	
	 

}
