package Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Base_FinZor.Base_Class;
import PageObjectModels.Customer_Creation;
import PageObjectModels.Index_Page_Customer;
import PageObjectModels.Login_Page;

public class Test_Customer_Index extends Base_Class {
	

	public static String ExpectedID;
	public static String Actual_ID;
	// Index flow
	@Test(description = "Verify customer ID appears correctly in Index page after customer creation")
	public void Index_001() {
//		Login_Page.getInstance().setUsername("rohit@xyz.com").setPassword("Pass@word1").clickLogin();
		
		Customer_Creation.getInstance().ClickCustomer_DD().ClickExpress().Click_HBDD().Click_Mumbai()
				.set_Cusname("Coolie").set_Kycname("Coolie powerhouse").Click_Cus_SubType().ClickSBoptions()
				.SetPan("EDHHE1234F").Click_Submit().Click_Yes().getID();

		Index_Page_Customer.getInstance().ClickUnauthorized().ClickAuthorizedtab().getTextfromIndex();

		ExpectedID = Customer_Creation.ID_container;
		Actual_ID = Index_Page_Customer.ID_index;
		assertEquals(Actual_ID, ExpectedID);
		System.out.println("Created ID : " + ExpectedID + "  " + " Index ID : " + Actual_ID);

	}
	

}
