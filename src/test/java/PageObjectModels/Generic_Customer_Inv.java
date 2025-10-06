package PageObjectModels;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.sql.ResultSet;

import org.apache.logging.log4j.core.net.Facility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base_FinZor.Base_Class;
import Utility.Pan_Random_Generator;
import Utility.RandomTextGenerator;
import Utility.Random_Number_Generator;
import Utility.Reusable_methods;
import Utility.retryAnalyser;

public class Generic_Customer_Inv extends Base_Class {

	public static Generic_Customer_Inv instance;

	// Constructor
	public Generic_Customer_Inv() {
		PageFactory.initElements(driver, this);
	}

	// Instance
	public static Generic_Customer_Inv getInstance() {
		if (instance == null) {
			synchronized (Generic_Customer_Inv.class) {
				if (instance == null) {
					instance = new Generic_Customer_Inv();
				}
			}
		} else {

		}
		return instance;
	}

	// locators
	@FindBy(xpath = "//*[text()='GENERIC CUSTOMER']")
	WebElement GenericCus;
	// Personal Details-1-1

	// Customer Name

	@FindBy(xpath = "(//*[text()='SELECT'])[1]")
	WebElement Customer_Salient_DD;
	@FindBy(xpath = "//*[text()='DR']")
	WebElement Salient_Option;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement Customer_Fname;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement Customer_Lname;

	// Nationality DD
	@FindBy(xpath = "//*[text()='Nationality']//ancestor::label//parent::div//following-sibling::div//*[text()='Select']")
	WebElement Nationality_DD;
	@FindBy(xpath = "//*[text()='India']")
	WebElement Nationality_option;

	// KYC name
	@FindBy(xpath = "//input[@id='KYC Name']")
	WebElement KYC_name;

	// DOB
	@FindBy(xpath = "//*[text()='Date Of Birth']//parent::div//following-sibling::div//*[text()='Select']")
	WebElement DOB;

	@FindBy(xpath = "//*[text()='YEAR']")
	WebElement Year;

	@FindBy(xpath = "//*[text()='‹']")
	WebElement Navigation;

	@FindBy(xpath = "//*[text()='1996']")
	WebElement Text_1996;

	@FindBy(xpath = "//*[text()='Jan']")
	WebElement Month_Select;

	@FindBy(xpath = "//*[text()='1']")
	WebElement Day;

	// Verification Type
	@FindBy(xpath = "//*[text()='Verification Type']//ancestor::label//parent::div//following::div//*[text()='Select']")
	WebElement Verification_Type;

	// Aadhar Fill
	@FindBy(xpath = "//*[text()='Aadhaar']")
	WebElement Aadhaar_number;

	// Aadhaar labe
	@FindBy(xpath = "//*[text()='UID / Aadhaar No']")
	WebElement Aadhaar_label_1;

	@FindBy(xpath = "//input[@id='UID / Aadhaar No']")
	WebElement Aadhaar_Field_1;

	// Save&Continue
	@FindBy(xpath = "//*[text()='SAVE & CONTINUE']")
	WebElement SaveContinue;

	// PD-1-2
	@FindBy(xpath = "(//*[text()='Select'])[2]")
	WebElement Cus_HB;

	@FindBy(xpath = "//*[text()='Andheri Branch']")
	WebElement HB_option;

	@FindBy(xpath = "//*[text()='Capture Source']//ancestor::label//parent::div//following-sibling::div//*[text()='Select']")
	WebElement Capture_Source;

	@FindBy(xpath = "//*[text()='Extension-Office']")
	WebElement CSoption;

	@FindBy(xpath = "//*[text()='Residency']//ancestor::label//parent::div//following-sibling::div//*[text()='Select']")
	WebElement Residency;

	@FindBy(xpath = "//*[text()='Resident Individual']")
	WebElement Residency_option;

	@FindBy(xpath = "//*[text()='Date Since Customer']//ancestor::label//parent::div//following-sibling::div//*[text()='Select']")
	WebElement DateSinceCustomer;

	@FindBy(xpath = "//*[text()='Gender']//ancestor::label//parent::div//following-sibling::div//*[text()='Select']")
	WebElement Gender;
	@FindBy(xpath = "//*[text()='Male']")
	WebElement Gender_Options;

	@FindBy(xpath = "//*[text()='Country Of Birth']//ancestor::label//parent::div//following-sibling::div//*[text()='Select']")
	WebElement Country;
	@FindBy(xpath = "//*[text()='India']")
	WebElement Country_Options;

	@FindBy(xpath = "//*[text()='Marital Status']//ancestor::label//parent::div//following-sibling::div//*[text()='Select']")
	WebElement Marital_Status;
	@FindBy(xpath = "//*[text()='Single']")
	WebElement Marital_option;

	@FindBy(xpath = "//*[text()='Customer Sub Type']//ancestor::label//parent::div//following-sibling::div//*[text()='Select']")
	WebElement Cus_Subtype;
	@FindBy(xpath = "//*[text()='NORMAL']")
	WebElement Cus_Subtype_options;

	@FindBy(xpath = "//*[text()='AADHAAR']")
	WebElement AadhaarRb;
	@FindBy(xpath = "//*[text()='Aadhaar Number']")
	WebElement aadhaarFieldLabel_4;
	@FindBy(xpath = "//input[@id='Aadhaar Number']")
	WebElement Aadhaarfield_Page_4;

	@FindBy(xpath = "//input[@id='PAN No']")
	WebElement PanNum;

	@FindBy(xpath = "//*[text()='SAVE & NEXT']")
	WebElement SaveandNext;

	// Address and contact details
	@FindBy(xpath = "//*[text()='Select Resident type']")
	WebElement ResidentDD;
	@FindBy(xpath = "//*[text()='Own']")
	WebElement Residentoption;

	@FindBy(xpath = "//input[@id='Pin Code']")
	WebElement pincode;

	@FindBy(xpath = "//input[@id='Country' and @value='India']")
	WebElement countryverify;
	@FindBy(xpath = "//input[@id='Street And Road']")
	WebElement Street;
	@FindBy(xpath = "//input[@id='Flat And Building']")
	WebElement Flat;
	@FindBy(xpath = "//*[text()='Select Postal Area']")
	WebElement PostalArea;
	@FindBy(xpath = "//*[text()='Perungudi']")
	WebElement PostalAreaOption;
	@FindBy(xpath = "//*[text()='Select Address Proof']")
	WebElement AddressProff;
	@FindBy(xpath = "//*[text()='Aadhaar']")
	WebElement AddrProffoption;
	@FindBy(xpath = "//input[@id='Document No']")
	WebElement DocNo;
	@FindBy(xpath = "//*[text()='Contact Type']//ancestor::label//parent::div//following-sibling::div//*[text()='Select Contact Type']")
	WebElement ContactType;
	@FindBy(xpath = "//*[text()='Mobile No']")
	WebElement ContactOption;
	@FindBy(xpath = "//input[@id='Contact Details']")
	WebElement Contactfield;

	@FindBy(xpath = "//tr[1]//td[2]")
	WebElement TrowOne;
	@FindBy(xpath = "//tr[2]//td[2]")
	WebElement TrowTwo;

	@FindBy(xpath = "(//*[text()='SIGNATURE CARD'])[2]")
	WebElement Signcard;

	@FindBy(xpath = "//tbody//tr[contains(.,'PROOF OF ID')]")
	WebElement ProofID;

	@FindBy(xpath = "//label[text()='Issue Date']//following-sibling::div")
	WebElement issueDate;
	@FindBy(xpath = "//*[text()='Jan']")
	WebElement mon;
	@FindBy(xpath = "//*[text()='2']")
	WebElement Date;

	@FindBy(xpath = "//*[text()='‹']")
	WebElement NavigationArrow;

	@FindBy(xpath = "//label[text()='Expiry Date']//following-sibling::div")
	WebElement ExpiryDate;
	@FindBy(xpath = "//*[text()='Dec']")
	WebElement expiry_month;
	@FindBy(xpath = "//*[text()='28']")
	WebElement expiry_Day;

	@FindBy(xpath = "//label[text()='Document No']")
	WebElement Doc_Label;

	@FindBy(xpath = "//input[@id='Document No']")
	WebElement Doc_no_form;
	@FindBy(xpath = "//input[@id='file_upload']")
	WebElement fileupload;
	@FindBy(xpath = "//input[@id='File Name']")
	WebElement FileNamePlaceHolder;
	@FindBy(xpath = "//*[text()='SAVE']")
	WebElement SaveButton;
	@FindBy(xpath = "//*[text()='Yes']")
	WebElement yesButton;

	// TaxResident
	@FindBy(xpath = "//*[text()='ADD TAX DETAILS']")
	WebElement TaxResidentBtn;

	// OD-1-2
	@FindBy(xpath = "//*[text()='KYC Rating Date']")
	WebElement KYCratinglabel;

	// Proof Of Identity
	@FindBy(xpath = "//*[text()='ADD DOCUMENTS']")
	WebElement ProoFofIdentityBtn;

	// OtherDetails-1-1
	@FindBy(xpath = "//*[text()='AML Customer Risk Rating']//ancestor::label//parent::div//following-sibling::div//*[text()='Select']")
	WebElement AmLCustomerRating;
	@FindBy(xpath = "//div//ul//li[contains(.,'Medium')]")
	WebElement AmlOption;

	// OD-2-1
	@FindBy(xpath = "//*[text()='Director']")
	WebElement DirectorLabel;

	// OD-2-2
	@FindBy(xpath = "//*[text()='Foreign Travel']")
	WebElement ForeignTravel;

	// Family Details:
	@FindBy(xpath = "//*[text()='Add Family Details']")
	WebElement FDBtn;

	// ND
	@FindBy(xpath = "//*[text()='Add Nominee Details']")
	WebElement NomineeDetailsbtn;

	// Attestation
	@FindBy(xpath = "//*[text()='KYC Declaration Date']")
	WebElement Attest_KYC_label;

	// TDS info-1
	@FindBy(xpath = "//*[text()='Select Form']")
	WebElement AppliedForm;
	@FindBy(xpath = "//div//ul//li[contains(.,'None')]")
	WebElement Appliedoption;

	@FindBy(xpath = "//*[text()='Select TDS Reason Code']")
	WebElement TDS;
	@FindBy(xpath = "//div//ul//li[contains(.,'Member')]")
	WebElement TDSOption;

	@FindBy(xpath = "//*[text()='Effective Date']//parent::label//parent::div//following-sibling::div//*[text()='Select Date']")
	WebElement EffectiveDate;
	@FindBy(xpath = "//*[text()='Jan']")
	WebElement TextJan;
	@FindBy(xpath = "//*[text()='25']")
	WebElement TextDay;

	@FindBy(xpath = "(//div[@class='flex justify-between w-full items-center'])[3]")
	WebElement EffectiveDatetext;

	// TaxRegistration
	@FindBy(xpath = "//*[text()='Add Tax Registration']")
	WebElement TaxRegistrationBtn;

	// Facilities
	@FindBy(xpath = "//thead//tr[1]//th[1]")
	WebElement FacHeader;

	// bank detailsButton
	@FindBy(xpath = "//*[text()='Add Bank Details']")
	WebElement BankDetailsBtn;

	// History
	@FindBy(xpath = "//table")
	WebElement HistoryTable;

	// next
	@FindBy(xpath = "//*[text()='NEXT']")
	WebElement Nextbutton;
	// Submit Button
	@FindBy(xpath = "//*[text()='SUBMIT']")
	WebElement Submit;
	@FindBy(xpath = "//button//*[text()='Yes']")
	WebElement Yes;

	@FindBy(xpath = "//br/following-sibling::text()[starts-with(., 'REFIND')]")
	WebElement RefrenceID_expected;

	@FindBy(xpath = "//p[contains(.,'REFIND')]")
	WebElement ExpectedID;
	@FindBy(xpath = "//tr[1]//td[3]")
	WebElement Actual_Ref_ID;

	@FindBy(xpath = "//button[text()='Draft'] | //*[contains(text(),'Draft')] ")
	WebElement drafttab;

	@FindBy(xpath = "//button[text()='Unauthorized']")
	WebElement unauthorizedTab;

	public static String expectedID;
	public static String ActualID;
	public static String lastname;
	public static int randomvalue;

	public Generic_Customer_Inv selectGeneric() {
		Reusable_methods.explicitWait(GenericCus);
		Reusable_methods.delay(10);
		Reusable_methods.elementClick(GenericCus);
		return this;
	}

	public Generic_Customer_Inv select_Saluation() {
		Reusable_methods.elementClick(Customer_Salient_DD);
		Reusable_methods.elementClick(Salient_Option);
		return this;
	}

	public Generic_Customer_Inv Cus_firstname() {

		String firstname = RandomTextGenerator.Generator(6);
		System.out.println("Cus_FirstName : " + firstname);
		Reusable_methods.SendKeys(Customer_Fname, firstname);
		return this;
	}

	public Generic_Customer_Inv Cus_lasttname() {

		lastname = RandomTextGenerator.Generator(6);
		System.out.println("Cus_LastName : " + lastname);
		Reusable_methods.SendKeys(Customer_Lname, lastname);
		return this;
	}

	public Generic_Customer_Inv select_Nationality() {

		Reusable_methods.elementClick(Nationality_DD);
		Reusable_methods.explicitWait(Nationality_option);
		Reusable_methods.elementClick(Nationality_option);
		return this;
	}

	public Generic_Customer_Inv SetKYCname(String input) {
		Reusable_methods.SendKeys(KYC_name, input);
		return this;
	}

	public Generic_Customer_Inv setDob() {
		Reusable_methods.explicitWait(DOB);
		Reusable_methods.elementClick(DOB);
		Reusable_methods.explicitWait(Year);
		Reusable_methods.elementClick(Year);
		Reusable_methods.explicitWait(Navigation);
		Reusable_methods.explicitWait(Navigation);
		Reusable_methods.elementClick(Navigation);
		Reusable_methods.elementClick(Navigation);
		Reusable_methods.explicitWait(Text_1996);

		Reusable_methods.elementClick(Text_1996);
		Reusable_methods.explicitWait(Month_Select);
		Reusable_methods.elementClick(Month_Select);
		Reusable_methods.explicitWait(Day);
		Reusable_methods.elementClick(Day);
		return this;
	}

	public Generic_Customer_Inv Select_VerificationPD1() {

		Reusable_methods.elementClick(Verification_Type);

		Reusable_methods.explicitWait(Aadhaar_number);
		Reusable_methods.elementClick(Aadhaar_number);
		return this;
	}

	public Generic_Customer_Inv Verify_Aadhaar_PD1() {
		Reusable_methods.explicitWait(Aadhaar_Field_1);
		Boolean output = Reusable_methods.ElementIsDisplayed(Aadhaar_label_1);
		if (output = true) {
			System.out.println("field is visible");
		}

		return this;
	}

	public Generic_Customer_Inv SendAadhaar_PD1(String input) {
		Reusable_methods.SendKeys(Aadhaar_Field_1, input);
		return this;
	}

//	

	public Generic_Customer_Inv SetCusHB() {
		Reusable_methods.explicitWait(Cus_HB);
		Reusable_methods.elementClick(Cus_HB);
		Reusable_methods.explicitWait(HB_option);
		Reusable_methods.elementClick(HB_option);
		return this;
	}

	public Generic_Customer_Inv SetCaptureSource() {
		Reusable_methods.elementClick(Capture_Source);
		Reusable_methods.explicitWait(CSoption);
		Reusable_methods.elementClick(CSoption);
		return this;
	}

	public Generic_Customer_Inv SetResidency() {
		Reusable_methods.elementClick(Residency);
		Reusable_methods.explicitWait(Residency_option);
		Reusable_methods.elementClick(Residency_option);

		return this;
	}

	public Generic_Customer_Inv CheckDateSinceIsenabled() {
		Reusable_methods.ElementIsclickable(DateSinceCustomer);
		return this;
	}

	public Generic_Customer_Inv setGender() {
		Reusable_methods.explicitWait(Gender);
		Reusable_methods.elementClick(Gender);
		Reusable_methods.explicitWait(Gender_Options);
		Reusable_methods.elementClick(Gender_Options);
		return this;
	}

	public Generic_Customer_Inv setCoutryofBirth() {
		Reusable_methods.elementClick(Country);
		Reusable_methods.explicitWait(Country_Options);
		Reusable_methods.elementClick(Country_Options);
		return this;
	}

	public Generic_Customer_Inv setMaritalStatus() {
		Reusable_methods.elementClick(Marital_Status);
		Reusable_methods.explicitWait(Marital_option);
		Reusable_methods.elementClick(Marital_option);
		return this;
	}

	public Generic_Customer_Inv setCustomerSubtype() {
		Reusable_methods.elementClick(Cus_Subtype);
		Reusable_methods.explicitWait(Cus_Subtype_options);
		Reusable_methods.elementClick(Cus_Subtype_options);

		return this;

	}

//	

	public Generic_Customer_Inv ClickAadharRB() {
		Reusable_methods.explicitWait(AadhaarRb);
		Reusable_methods.elementClick(AadhaarRb);

		return this;
	}

	public Generic_Customer_Inv setAadhaarPD2(String input) {
		Reusable_methods.explicitWait(aadhaarFieldLabel_4);
		Reusable_methods.SendKeys(Aadhaarfield_Page_4, input);

		return this;
	}

	public Generic_Customer_Inv setPanNumber() {
		String PanNo = Pan_Random_Generator.PanGenerator(lastname);
		System.out.println("Pan Number : " + PanNo);
		Reusable_methods.SendKeys(PanNum, PanNo);

		return this;
	}

	public Generic_Customer_Inv ConfigPRooFInden_001() {

		return this;
	}

	// Address details page actions
	public Generic_Customer_Inv SetResidenttype() {
		Reusable_methods.explicitWait(ResidentDD);
		Reusable_methods.elementClick(ResidentDD);
		Reusable_methods.explicitWait(Residentoption);
		Reusable_methods.elementClick(Residentoption);
		return this;
	}

	public Generic_Customer_Inv SetPincode() {
		Reusable_methods.SendKeys(pincode, 600096);
		return this;
	}

	public Generic_Customer_Inv VerifyCountry() {
		Reusable_methods.explicitWait(countryverify);
		String output = Reusable_methods.GetAttribute(countryverify, "value");
		String expected = "India";
		assertEquals(output, expected, "India is selected");
		return this;
	}

	public Generic_Customer_Inv SetStreet() {
		Reusable_methods.SendKeys(Street, "No 17 TVM");
		return this;
	}

	public Generic_Customer_Inv setFlat() {
		Reusable_methods.SendKeys(Flat, "Brown Stone Appartment");
		return this;
	}

	public Generic_Customer_Inv setPostalCode() {
		Reusable_methods.elementClick(PostalArea);
		Reusable_methods.explicitWait(PostalAreaOption);
		Reusable_methods.elementClick(PostalAreaOption);
		return this;
	}

	public Generic_Customer_Inv setAddressProff() {
		Reusable_methods.elementClick(AddressProff);
		Reusable_methods.explicitWait(AddrProffoption);
		Reusable_methods.elementClick(AddrProffoption);
		return this;
	}

	public Generic_Customer_Inv setDocNo() {
		Reusable_methods.SendKeys(DocNo, "123456789012");
		Reusable_methods.delay(10);

		WebElement sC1 = driver.findElement(By.xpath("//*[text()='SAVE & CONTINUE']"));
		Reusable_methods.elementClick(sC1);
		

		return this;

	}

//	public Generic_Customer_Inv HandlingAddressAlert() {
//		
//		
//		return this;
//	}
	public Generic_Customer_Inv setContacttype() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).perform();

		Reusable_methods.explicitWait(ContactType);
		Reusable_methods.elementClick(ContactType);
		Reusable_methods.explicitWait(ContactOption);
		Reusable_methods.elementClick(ContactOption);
		Reusable_methods.SendKeys(Contactfield, "8989898989");
		Reusable_methods.explicitWait(SaveandNext);
		Reusable_methods.delay(10);
		Reusable_methods.HandlingAlert();

		return this;
	}

	public Generic_Customer_Inv Verify_Taxresident() {
		Reusable_methods.explicitWait(TaxResidentBtn);
		Boolean output = Reusable_methods.ElementIsDisplayed(TaxResidentBtn);
		assertEquals(output, true, "Button is displayed");
		return this;
	}

	// proof of identity page actions
	public Generic_Customer_Inv uploadDocument_001() {
		Reusable_methods.explicitWait(ProofID);

		Reusable_methods.elementClick(ProofID);
		Reusable_methods.explicitWait(issueDate);
		Reusable_methods.elementClick(issueDate);
		Reusable_methods.explicitWait(mon);
		Reusable_methods.elementClick(mon);
		Reusable_methods.elementClick(Day);

		Reusable_methods.elementClick(ExpiryDate);
		Reusable_methods.explicitWait(expiry_month);
		Reusable_methods.elementClick(expiry_month);
		Reusable_methods.elementClick(expiry_Day);

		Reusable_methods.SendKeys(Doc_no_form, "AAAAA1234A");

		String filePath = System.getProperty("user.dir") + File.separator + "Test_Datas" + File.separator
				+ "loan (25).pdf";
		Reusable_methods.FileUpload(fileupload, filePath);

		Reusable_methods.FileUpload(fileupload, filePath);
//
//			String output = Reusable_methods.GetAttribute(FileNamePlaceHolder, "value");
//	        Assert.assertEquals(output, "loan.pdf", "File name mismatch!");

		Reusable_methods.elementClick(SaveButton);
		Reusable_methods.delay(10);

		Reusable_methods.explicitWait(Signcard);
		Reusable_methods.elementClick(Signcard);
		Reusable_methods.delay(10);

		Reusable_methods.explicitWait(Doc_Label);
		Reusable_methods.SendKeys(Doc_no_form, "12131341");
		String filePath1 = System.getProperty("user.dir") + File.separator + "Test_Datas" + File.separator
				+ "loan (25).pdf";
		Reusable_methods.FileUpload(fileupload, filePath1);

//			String output = Reusable_methods.GetAttribute(FileNamePlaceHolder, "value");
//			assertEquals(output, "loan (25).pdf");

		Reusable_methods.elementClick(SaveButton);
		return this;
	}

//	public Generic_Customer_Inv uploadDocument_002() {
//		Reusable_methods.explicitWait(Signcard);
//		Reusable_methods.elementClick(Signcard);
//		Reusable_methods.delay(10);
//		Reusable_methods.SendKeys(Doc_no_form, "12131341");
//		String filePath = System.getProperty("user.dir") + File.separator + "Test_Datas" + File.separator + "loan (25).pdf";
//		Reusable_methods.FileUpload(fileupload, filePath);
//
////		String output = Reusable_methods.GetAttribute(FileNamePlaceHolder, "value");
////		assertEquals(output, "loan (25).pdf");
//
//		Reusable_methods.elementClick(SaveButton);
//		Reusable_methods.delay(10);
//		return this;
//	}

	public Generic_Customer_Inv setAMLRating() {
		Reusable_methods.explicitWait(AmLCustomerRating);
		Reusable_methods.elementClick(AmLCustomerRating);
		Reusable_methods.explicitWait(AmlOption);
		Reusable_methods.elementClick(AmlOption);

		return this;
	}

	public Generic_Customer_Inv VerifyDirectorfield() {
		Reusable_methods.explicitWait(DirectorLabel);
		Boolean output = Reusable_methods.ElementIsDisplayed(DirectorLabel);
		assertEquals(output, true, "Director RB is displayed");

		return this;
	}

	public Generic_Customer_Inv Verify_FamilyDetials() {
		Reusable_methods.explicitWait(FDBtn);
		Boolean output = Reusable_methods.ElementIsDisplayed(FDBtn);
		assertEquals(output, true, "FD Button is displayed");
		return this;
	}

	public Generic_Customer_Inv Verify_NomineeDetials() {
		Reusable_methods.explicitWait(NomineeDetailsbtn);
		Boolean output = Reusable_methods.ElementIsDisplayed(NomineeDetailsbtn);
		assertEquals(output, true, "Nominee Button is displayed");
		return this;
	}

	public Generic_Customer_Inv VerifyKYCDeclarationfield() {
		Reusable_methods.explicitWait(Attest_KYC_label);
		Boolean output = Reusable_methods.ElementIsDisplayed(Attest_KYC_label);
		assertEquals(output, true, "Attest_KYC_label is displayed");

		return this;
	}

	public Generic_Customer_Inv setAppliedFor() {

		Reusable_methods.explicitWait(AppliedForm);
		Reusable_methods.elementClick(AppliedForm);
		Reusable_methods.explicitWait(Appliedoption);
		Reusable_methods.elementClick(Appliedoption);
		return this;
	}

	public Generic_Customer_Inv setTDS() {
		Reusable_methods.explicitWait(TDS);
		Reusable_methods.elementClick(TDS);
		Reusable_methods.explicitWait(TDSOption);
		Reusable_methods.elementClick(TDSOption);
		return this;
	}

	public Generic_Customer_Inv setEffectiveDate() {
		Reusable_methods.elementClick(EffectiveDate);
		Reusable_methods.explicitWait(TextJan);
		Reusable_methods.elementClick(TextJan);
		Reusable_methods.explicitWait(TextDay);
		Reusable_methods.elementClick(TextDay);

		String actual = Reusable_methods.getText(EffectiveDatetext);

		String expectedDate = "25-01-2025";
		assertEquals(actual, expectedDate);

		return this;

	}

	public Generic_Customer_Inv Verify_taxregistrationBtn() {
		Reusable_methods.explicitWait(TaxRegistrationBtn);
		Boolean output = Reusable_methods.ElementIsDisplayed(TaxRegistrationBtn);
		assertEquals(output, true, "TaxRegistrationBtn  is displayed");
		return this;
	}

	public Generic_Customer_Inv verifyFacilities() {
		Reusable_methods.explicitWait(FacHeader);
		Boolean output = Reusable_methods.ElementIsDisplayed(FacHeader);
		assertEquals(output, true, "Facilities page  is displayed");

		return this;
	}

	public Generic_Customer_Inv Verify_AddBankDetialsBtn() {
		Reusable_methods.explicitWait(BankDetailsBtn);
		Boolean output = Reusable_methods.ElementIsDisplayed(BankDetailsBtn);
		assertEquals(output, true, "BankDetailsBtn  is displayed");
		return this;
	}

	public Generic_Customer_Inv Verify_Hsistory() {
		Reusable_methods.explicitWait(HistoryTable);
		Boolean output = Reusable_methods.ElementIsDisplayed(HistoryTable);
		assertEquals(output, true, "BankDetailsBtn  is displayed");
		return this;
	}

	public Generic_Customer_Inv SbmtCfmPopup() {
		Reusable_methods.explicitWait(ExpectedID);
		String popupText = Reusable_methods.getText(ExpectedID);
		String[] lines = popupText.split("\\r?\\n");
		expectedID = lines[1]; // REFIND202510000110
		String customerName = lines[2]; // King Kohli

		System.out.println("RefID: " + expectedID);
		System.out.println("Customer: " + customerName);

//		System.out.println(expectedID);
		return this;
	}

	public Generic_Customer_Inv getTextUnauthorized() {
		Reusable_methods.delay(10);
		Reusable_methods.explicitWait(Actual_Ref_ID);
		Reusable_methods.delay(10);
		Reusable_methods.elementClick(drafttab);
		Reusable_methods.delay(10);
		Reusable_methods.elementClick(unauthorizedTab);
		Reusable_methods.delay(5);
		Reusable_methods.explicitWait(Actual_Ref_ID);
		ActualID = Reusable_methods.getText(Actual_Ref_ID);

		assertEquals(ActualID, expectedID);
		System.out.println("Created ID : " + expectedID + "  " + " Index ID : " + ActualID);
		return this;
	}

//	Navigation buttons
	public Generic_Customer_Inv Click_Saveandcontinue() {
		Reusable_methods.explicitWait(SaveContinue);
		Reusable_methods.elementClick(SaveContinue);
		Reusable_methods.delay(5);
		return this;
	}

	public Generic_Customer_Inv ClickSaveandNext() {
		Reusable_methods.explicitWait(SaveandNext);
		Reusable_methods.Clicksaveandnext(SaveandNext);
		return this;
	}

	public Generic_Customer_Inv ClickNext() {
		Reusable_methods.explicitWait(Nextbutton);
		Reusable_methods.elementClick(Nextbutton);
		Reusable_methods.delay(5);
		return this;
	}

	public Generic_Customer_Inv clickSubmit() {
		Reusable_methods.explicitWait(Submit);
		Reusable_methods.elementClick(Submit);
		return this;
	}

	public Generic_Customer_Inv clickyesButton() {
		Reusable_methods.explicitWait(yesButton);
		Reusable_methods.ClickYes(yesButton);
		Reusable_methods.delay(10);

		return this;
	}

	public Generic_Customer_Inv ClickSavecontinue() {
		Reusable_methods.explicitWait(SaveContinue);
		Reusable_methods.ClicksaveandContinue(SaveContinue);
		Reusable_methods.delay(5);
		return this;
	}

	@FindBy(xpath = "//tr[1]//td[16]//*[text()='ASSIGN']")
	WebElement AssignBtn;

	@FindBy(xpath = "//tr[1]//td[16]//*[text()='RECALL']")
	WebElement RecallBtn;

	@FindBy(xpath = "//p[contains(.,'Assign')]")
	WebElement AssignConfirmation;
	@FindBy(xpath = "//button//*[text()='Yes']")
	WebElement YesButton;

	@FindBy(xpath = "//div[contains(@class,'transition-transform duration-200')]")
	WebElement Togglebtn;

	@FindBy(xpath = "//div//p[contains(.,'My Inbox')]")
	WebElement ToggleTxtmy;

	@FindBy(xpath = "//div//p[contains(.,'Group Inbox')]")
	WebElement ToggleTxtGroup;

	@FindBy(xpath = "//tr[1]//td[3]")
	WebElement refIDmyInbox;

	@FindBy(xpath = "//tr[1]//td[16]//button//*[contains(.,'AUTHORIZE')]")
	WebElement AuthorizeBtn;

	@FindBy(xpath = "//div//h2")
	WebElement VerifyViewMode;// detailsmode
	// Assign and authorize
	// history
	@FindBy(xpath = "//ul//*[text()='HISTORY']")
	WebElement History;

	@FindBy(xpath = "//button[contains(.,'AUTHORIZE')]")
	WebElement AuthorizeButtonmyinbox;

	@FindBy(xpath = "//p[contains(.,'Authorize')]")
	WebElement AuthorizeConpopupText;

	@FindBy(xpath = "//div//button[contains(.,'Yes')]")
	WebElement YesBtnAuth;

	@FindBy(xpath = "//tr[1]//td[3]")
	WebElement RefIDAUth;
	@FindBy(xpath = "//tr[1]//td[4]")
	WebElement CusID;

	public Generic_Customer_Inv AuthorizeProcess() {

		Reusable_methods.explicitWait(ToggleTxtGroup);
		System.out.println("group inbox text is displayed" + Reusable_methods.ElementIsDisplayed(ToggleTxtGroup));
		Reusable_methods.explicitWait(Actual_Ref_ID);
		Reusable_methods.elementClick(AssignBtn);
		Reusable_methods.explicitWait(AssignConfirmation);
		String AssignTxt = Reusable_methods.getText(AssignConfirmation);
		System.out.println(AssignTxt);
		Reusable_methods.explicitWait(yesButton);
		Reusable_methods.elementClick(yesButton);
		Reusable_methods.delay(10);
		Reusable_methods.explicitWait(Togglebtn);
		Reusable_methods.elementClick(Togglebtn);
		Reusable_methods.explicitWait(Togglebtn);
		Reusable_methods.elementClick(Togglebtn);
		Reusable_methods.explicitWait(ToggleTxtmy);
		System.out.println("my inbox text is displayed" + Reusable_methods.ElementIsDisplayed(ToggleTxtmy));

		Reusable_methods.explicitWait(refIDmyInbox);

		boolean isMatch = refIDmyInbox.equals(ActualID);
		assertTrue(isMatch, "Values are matched");

		if (isMatch) {
			Reusable_methods.elementClick(AuthorizeBtn);
			Reusable_methods.explicitWait(VerifyViewMode);
			System.out.println(Reusable_methods.getText(AadhaarRb));
			Reusable_methods.elementClick(History);
			Reusable_methods.explicitWait(HistoryTable);
			Boolean output = Reusable_methods.ElementIsDisplayed(HistoryTable);
			assertEquals(output, true, "BankDetailsBtn  is displayed");
			Reusable_methods.elementClick(Nextbutton);
			Reusable_methods.explicitWait(AuthorizeButtonmyinbox);
			Reusable_methods.elementClick(AuthorizeButtonmyinbox);
			Reusable_methods.explicitWait(AuthorizeConpopupText);
			System.out.println(Reusable_methods.getText(AuthorizeConpopupText));
			Reusable_methods.elementClick(YesBtnAuth);

			Reusable_methods.explicitWait(RefIDAUth);
			boolean ouput1 = RefIDAUth.equals(ActualID);
			if (ouput1) {

				System.out.println("Customer ID : " + Reusable_methods.getText(CusID));
			}

		}
		return this;
	}

	// POM for senior citizen
	@FindBy(xpath = "//*[text()='1960']")
	WebElement SeniorCitizenYear;
	@FindBy(xpath = "//*[text()='Jan']")
	WebElement SeniorCiti_mon;

	@FindBy(xpath = "//*[text()='1']")
	WebElement Senior_Day;

	public Generic_Customer_Inv DOBSelection() {
		randomvalue = Random_Number_Generator.RandomNumber();

		switch (randomvalue) {
		case 1:// minor

			Reusable_methods.explicitWait(DOB);
			Reusable_methods.elementClick(DOB);
			String month = Demo.getMonth();
			int Date = Demo.getDate();
			String xpathmon_minor = "//*[text()='" + month + "']";
			String xpathdate_minor = "//*[text()='" + Date + "']";

			driver.findElement(By.xpath(xpathmon_minor)).click();
			Reusable_methods.delay(10);
			driver.findElement(By.xpath(xpathdate_minor)).click();

			break;

		case 2:// normal
			Reusable_methods.explicitWait(DOB);
			Reusable_methods.elementClick(DOB);
			Reusable_methods.explicitWait(Year);
			Reusable_methods.elementClick(Year);
			Reusable_methods.explicitWait(Navigation);
			Reusable_methods.explicitWait(Navigation);
			Reusable_methods.elementClick(Navigation);
			Reusable_methods.elementClick(Navigation);
			Reusable_methods.explicitWait(Text_1996);

			Reusable_methods.elementClick(Text_1996);
			Reusable_methods.explicitWait(Month_Select);
			Reusable_methods.elementClick(Month_Select);
			Reusable_methods.explicitWait(Day);
			Reusable_methods.elementClick(Day);

			break;

		case 3:
			Reusable_methods.explicitWait(DOB);
			Reusable_methods.elementClick(DOB);
			Reusable_methods.explicitWait(Year);
			Reusable_methods.elementClick(Year);

			Reusable_methods.explicitWait(Navigation);
			Reusable_methods.elementClick(Navigation);
			Reusable_methods.elementClick(Navigation);
			Reusable_methods.elementClick(Navigation);
			Reusable_methods.elementClick(Navigation);
			Reusable_methods.elementClick(Navigation);
			Reusable_methods.explicitWait(SeniorCitizenYear);
			Reusable_methods.elementClick(SeniorCitizenYear);
			Reusable_methods.explicitWait(SeniorCiti_mon);
			Reusable_methods.elementClick(SeniorCiti_mon);
			Reusable_methods.explicitWait(Senior_Day);
			Reusable_methods.elementClick(Senior_Day);

			break;
		default:
			break;
		}

		return this;
	}

	@FindBy(xpath = "//span[text()='Customer Sub Type']//ancestor::div[@class='mb-1']//following-sibling::div")
	WebElement CustomerSubType;

	@FindBy(xpath = "//span[contains(.,'Related Person Type')]//ancestor::div[@class='mb-1']//following-sibling::div//*[text()='Select']")
	WebElement RelatedPerson;
	@FindBy(xpath = "//*[text()='GUARDIAN OF MINOR']")
	WebElement RPoptions;
	@FindBy(xpath = "//button//div[text()='Select']")
	WebElement GuardianCustomerSelect;
	@FindBy(xpath = "//table")
	WebElement CusTable;
	@FindBy(xpath = "//tbody//tr[1]")
	WebElement CusFirstRow;

	public Generic_Customer_Inv Customertype() {

		switch (randomvalue) {
		case 1:
			System.out.println("Customer is minor");
			Reusable_methods.explicitWait(CustomerSubType);
			System.out.println(Reusable_methods.getText(CustomerSubType));
			Reusable_methods.elementClick(RelatedPerson);
			Reusable_methods.explicitWait(RPoptions);
			Reusable_methods.elementClick(RPoptions);
			Reusable_methods.elementClick(GuardianCustomerSelect);
			Reusable_methods.explicitWait(CusTable);
			System.out.println(Reusable_methods.ElementIsDisplayed(CusTable));
			Reusable_methods.elementClick(CusFirstRow);

			break;

		case 2:
			System.out.println("Customer is neither senior or minor");
			Reusable_methods.elementClick(Cus_Subtype);
			Reusable_methods.explicitWait(Cus_Subtype_options);
			Reusable_methods.elementClick(Cus_Subtype_options);

			break;

		case 3:
			System.out.println("Customer is senior");
			Reusable_methods.explicitWait(CustomerSubType);
			System.out.println(Reusable_methods.getText(CustomerSubType));

			break;
		default:
			break;
		}
		return this;
	}

	@FindBy(xpath="// button//div[text()='ADD DOCUMENTS']")
	WebElement DocButton;
	public Generic_Customer_Inv ProofIdentity() {

		switch (randomvalue) {
		case 1:
			Reusable_methods.explicitWait(ProofID);

			Reusable_methods.elementClick(ProofID);
			Reusable_methods.explicitWait(issueDate);
			Reusable_methods.elementClick(issueDate);
			Reusable_methods.explicitWait(mon);
			Reusable_methods.elementClick(mon);
			Reusable_methods.elementClick(Day);

			Reusable_methods.elementClick(ExpiryDate);
			Reusable_methods.explicitWait(expiry_month);
			Reusable_methods.elementClick(expiry_month);
			Reusable_methods.elementClick(expiry_Day);

			Reusable_methods.SendKeys(Doc_no_form, "AAAAA1234A");

			String filePath = System.getProperty("user.dir") + File.separator + "Test_Datas" + File.separator
					+ "loan (25).pdf";
			Reusable_methods.FileUpload(fileupload, filePath);

			Reusable_methods.FileUpload(fileupload, filePath);
			//
//				String output = Reusable_methods.GetAttribute(FileNamePlaceHolder, "value");
//		        Assert.assertEquals(output, "loan.pdf", "File name mismatch!");

			Reusable_methods.elementClick(SaveButton);
			Reusable_methods.delay(10);

			Reusable_methods.explicitWait(Signcard);
			Reusable_methods.elementClick(Signcard);
			Reusable_methods.delay(10);

			Reusable_methods.explicitWait(Doc_Label);
			Reusable_methods.SendKeys(Doc_no_form, "12131341");
			String filePath1 = System.getProperty("user.dir") + File.separator + "Test_Datas" + File.separator
					+ "loan (25).pdf";
			Reusable_methods.FileUpload(fileupload, filePath1);

//				String output = Reusable_methods.GetAttribute(FileNamePlaceHolder, "value");
//				assertEquals(output, "loan (25).pdf");

			Reusable_methods.elementClick(SaveButton);

			break;

		case 2:
			Reusable_methods.explicitWait(DocButton);
			System.out.println("Document Upload is displayed : " +Reusable_methods.ElementIsDisplayed(DocButton));
			break;
		case 3:
			
			Reusable_methods.explicitWait(DocButton);
			System.out.println("Document Upload is displayed : " +Reusable_methods.ElementIsDisplayed(DocButton));
			break;
		default:
			break;
		}

		return this;

	}
}
