package Test;

import org.testng.annotations.Test;

import Base_FinZor.Base_Class;
import PageObjectModels.Login_Page;

public class Login_TestCases extends Base_Class{
	
	
	@Test
	public void TestCase_001() {
		Login_Page.getInstance().setUsername("rohitxyz.com").setPassword("Pass@word1").clickLogin();
	}

}
