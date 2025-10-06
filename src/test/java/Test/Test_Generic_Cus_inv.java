package Test;

import org.testng.annotations.Test;

import Base_FinZor.Base_Class;
import PageObjectModels.Customer_Creation;
import PageObjectModels.Generic_Customer_Inv;
import PageObjectModels.Login_Page;

public class Test_Generic_Cus_inv extends Base_Class{
	
	
	@Test
	public void TestCase_001() {
		
		Login_Page.getInstance().setUsername("rohit@xyz.com").setPassword("Pass@word1").clickLogin();
		Customer_Creation.getInstance().clickCustomerType().ClickCustomer_DD();
		
		Generic_Customer_Inv cus=Generic_Customer_Inv.getInstance();
		cus.selectGeneric()
		.select_Saluation()
		.Cus_firstname()
		.Cus_lasttname()
		.select_Nationality()
		.SetKYCname("Johnny ")
		.DOBSelection()
		.Select_VerificationPD1()
		.Verify_Aadhaar_PD1()
		.SendAadhaar_PD1("123456789012")
		.Click_Saveandcontinue()
		.SetCusHB()
		.SetCaptureSource()
		.SetResidency()
		.ClickSaveandNext()
		.setGender()
		.setCoutryofBirth()
		.setMaritalStatus()
		.Customertype()
		.Click_Saveandcontinue()
		.ClickAadharRB()
		.setAadhaarPD2("123456789011")
		.setPanNumber()
		.ClickSaveandNext()
		.SetResidenttype()
		.SetPincode()
		.SetStreet()
		.setFlat()
		.setPostalCode()
		.setAddressProff()
		.setDocNo()
//		.HandlingAddressAlert()
		.setContacttype()
		.ClickSaveandNext()
		.Verify_Taxresident()
		.ClickSaveandNext()
//		.ProofIdentity()
		
		.ClickSaveandNext()
		.setAMLRating()
		.Click_Saveandcontinue()
		.ClickSaveandNext()
		.VerifyDirectorfield() //OD-2-1
		.Click_Saveandcontinue()
		.ClickSaveandNext()//OD-2-2
		.Verify_FamilyDetials()
		.ClickSaveandNext()
		.Verify_NomineeDetials()//ND
		.ClickSaveandNext()
		.VerifyKYCDeclarationfield()//Attest-1
		.ClickSaveandNext()
		.setAppliedFor()
		.setTDS()
		.setEffectiveDate()
		.Click_Saveandcontinue()
		.ClickSaveandNext()//TD-2
		.Verify_taxregistrationBtn()
		.ClickSaveandNext()
		.verifyFacilities()
		.ClickSaveandNext()
		.Verify_AddBankDetialsBtn()
		.clickSubmit()
		.SbmtCfmPopup()
		.clickyesButton().getTextUnauthorized().AuthorizeProcess();
		
	
		
		
	}

	@Test
	public void TestCase_002()
	{

		Login_Page.getInstance().setUsername("rohit@xyz.com").setPassword("Pass@word1").clickLogin();
		Customer_Creation.getInstance().clickCustomerType().ClickCustomer_DD();
		
		Generic_Customer_Inv cus=Generic_Customer_Inv.getInstance();
		cus.selectGeneric()
		.select_Saluation()
		.Cus_firstname()
		.Cus_lasttname()
		.select_Nationality()
		.SetKYCname("Johnny ")
		.setDob()
		.Select_VerificationPD1()
		.Verify_Aadhaar_PD1()
		.SendAadhaar_PD1("123456789012")
		.Click_Saveandcontinue()
		.SetCusHB()
		.SetCaptureSource()
		.SetResidency()
		.ClickSaveandNext()
		.setGender()
		.setCoutryofBirth()
		.setMaritalStatus()
		.setCustomerSubtype()
		.Click_Saveandcontinue()
		.ClickAadharRB()
		.setAadhaarPD2("123456789011")
		.ClickSaveandNext()
		.SetResidenttype()
		.SetPincode()
		.SetStreet()
		.setFlat()
		.setPostalCode()
		.setAddressProff()
		.setDocNo()
		.setContacttype()
		.ClickSaveandNext()
		.Verify_Taxresident()
		.ClickSaveandNext()
		.uploadDocument_001();
	}
}
