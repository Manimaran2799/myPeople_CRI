package Test;

import org.testng.annotations.Test;

import Base_FinZor.Base_Class;
import PageObjectModels.Customer_Creation;
import PageObjectModels.Login_Page;

public class Test_Express_Inv extends Base_Class{
	@Test
	public void TestCase_001() throws InterruptedException {
//		Login_Page.getInstance().setUsername("rohit@xyz.com").setPassword("Pass@word1").clickLogin();

		Customer_Creation.getInstance().ClickCustomer_DD().ClickExpress().Click_HBDD().Click_Mumbai()
				.set_Cusname("Coolie").set_Kycname("Coolie powerhouse").Click_Cus_SubType().ClickSBoptions()
				.SetPan("EDHHE1234F").Click_Submit().Click_Yes();
	}

}
