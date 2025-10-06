package PageObjectModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_FinZor.Base_Class;
import Utility.Reusable_methods;

public class Customer_Creation extends Base_Class {

	public static Customer_Creation instance;

	// Constructor
	public Customer_Creation() {
		PageFactory.initElements(driver, this);

	}

	public static Customer_Creation getInstance() {
		if (instance == null|| driver == null) {
			synchronized (Customer_Creation.class) {
				if (instance == null|| driver == null) {
					instance = new Customer_Creation();
				}
				else {
					  PageFactory.initElements(driver, instance);
				}
			}
		}

		return instance;
	}

	@FindBy(xpath = "//*[text()='CREATE NEW']")
	WebElement Customer_DD;
	
	@FindBy(xpath = "//*[text()='CORPORATE']")
	WebElement CustomerType;
	@FindBy(xpath="//*[text()='INDIVIDUAL']")
	WebElement CustomerInv;

	@FindBy(xpath = "//*[text()='EXPRESS CUSTOMER']")
	WebElement Exp_option;

	@FindBy(xpath = "//*[text()='Select Customer Home Branch']")
	WebElement Cus_HB_DD;

	@FindBy(xpath = "//*[text()='Main Branch - Mumbai']")
	WebElement Mumbai_Option;

	@FindBy(xpath = "//input[@id='KYC Name']")
	WebElement Kyc_Name;
	@FindBy(xpath = "//input[@id='Customer Name']")
	WebElement Cus_Name;

	@FindBy(xpath = "//*[text()='Select Customer Sub Type']")
	WebElement Cus_SubType;

	@FindBy(xpath = "//div/ul/li[text()='Corporate']")
	WebElement SubType_Options;

	@FindBy(xpath = "//*[text()='AADHAR NO']")
	WebElement Aadhar_RD;

	@FindBy(xpath = "//input[@id='Aadhaar No']")
	WebElement Aadhar;

	@FindBy(xpath = "//input[@id='PAN No']")
	WebElement PanNo;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	WebElement Submit_button;

	@FindBy(xpath = "//button[@type='button']//div[contains(text(),'Yes')]")
	WebElement yes_option;

	@FindBy(xpath = "//*[text()='Customer Number']//parent::div//following-sibling::div//*[text()='Customer Name']\r\n")
	WebElement Confirm;

	@FindBy(xpath = "//*[text()='Customer Number']//following-sibling::p[text()]")
	WebElement CustId;

	public static String ID_container;
	
	public Customer_Creation clickCustomerType() {
		Reusable_methods.explicitWait(CustomerType);
		Reusable_methods.elementClick(CustomerType);
		Reusable_methods.explicitWait(CustomerInv);
		Reusable_methods.elementClick(CustomerInv);
		return this;
	}

	// actions
	public Customer_Creation ClickCustomer_DD() {
		Reusable_methods.explicitWait(Customer_DD);
		Reusable_methods.elementClick(Customer_DD);
		return this;
	}

	public Customer_Creation ClickExpress() {

		try {
			Reusable_methods.explicitWait(Exp_option);
			Reusable_methods.elementClick(Exp_option);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return this;
	}

	public Customer_Creation Click_HBDD() {
		Reusable_methods.explicitWait(Cus_HB_DD);
		Reusable_methods.elementClick(Cus_HB_DD);
		return this;
	}

	public Customer_Creation Click_Mumbai() {
		Reusable_methods.explicitWait(Mumbai_Option);
		Reusable_methods.elementClick(Mumbai_Option);
		return this;
	}

	public Customer_Creation set_Cusname(String Name) {
		Reusable_methods.delay(4);
		Reusable_methods.SendKeys(Cus_Name, Name);
		return this;
	}

	public Customer_Creation set_Kycname(String Kyc) {
		Reusable_methods.SendKeys(Kyc_Name, Kyc);
		return this;
	}

	public Customer_Creation Click_Cus_SubType() {
		Reusable_methods.elementClick(Cus_SubType);
		return this;
	}

	public Customer_Creation ClickSBoptions() {
		Reusable_methods.elementClick(SubType_Options);
		return this;
	}

//	public Customer_Creation Click_Aadhar() {
//		Reusable_methods.elementClick(Aadhar_RD);
//		return this;
//	}
//	
//	public Customer_Creation Set_Aadhar(long num) {
//		Reusable_methods.explicitWait(Aadhar);
//		Reusable_methods.SendKeys(Aadhar,num);
//		return this;
//	}

	public Customer_Creation SetPan(String value) {
		Reusable_methods.SendKeys(PanNo, value);
		return this;
	}

	public Customer_Creation Click_Submit() {
		Reusable_methods.elementClick(Submit_button);
		return this;
	}

	public Customer_Creation Click_Yes() {
		Reusable_methods.explicitWait(yes_option);
		Reusable_methods.elementClick(yes_option);
		Reusable_methods.explicitWait(Confirm);
		return this;
	}

	public Customer_Creation getID() {
		Reusable_methods.explicitWait(CustId);
		ID_container = Reusable_methods.getText(CustId);
		return this;
	}

}
