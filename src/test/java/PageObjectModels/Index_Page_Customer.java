package PageObjectModels;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_FinZor.Base_Class;
import Utility.Reusable_methods;

public class Index_Page_Customer extends Base_Class {

	public static Index_Page_Customer instance;

	// Const
	public Index_Page_Customer() {
		PageFactory.initElements(driver, this);
	}

	// instance

	public static Index_Page_Customer getInstance() {

		try {
			if (instance == null|| driver == null) {
				synchronized (Index_Page_Customer.class) {
					if (instance == null|| driver == null) {
						instance = new Index_Page_Customer();
					}
					else {
						  PageFactory.initElements(driver, instance);
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return instance;
	}

	// Locators
	@FindBy(xpath = "//*[text()='Authorized']")
	WebElement Authorized_tab;

	@FindBy(xpath = "//*[text()='Unauthorized']")
	WebElement unauthorized_tab;

	@FindBy(xpath = "//*[text()='Draft']")
	WebElement draft_tab;

	@FindBy(xpath = "//*[text()='Request Revision']")
	WebElement req_revisiontab;
	@FindBy(xpath = "Rejected")
	WebElement rejected_tab;

	@FindBy(xpath = "Deactivated")
	WebElement assign_button;

	@FindBy(xpath = "//*[text()='RECALL']")
	WebElement recall_button;

	@FindBy(xpath = "//div[contains(@class,'rounded-full transform')]")
	WebElement inbox_toggle_unauth;

	@FindBy(xpath = "//tr[1]//td[4]")
	WebElement Cusno_index;

	@FindBy(xpath = "//img[@src='/build/assets/TableRefresh-BHk02eVf.svg']")
	WebElement Refresh_Button;

	public static String ID_index;

	// Actions
	public Index_Page_Customer getTextfromIndex() {
		Reusable_methods.explicitWait(Cusno_index);
		ID_index = Reusable_methods.getText(Cusno_index);
		return this;
	}

	public Index_Page_Customer Clickrefresh() {
		Reusable_methods.explicitWait(Refresh_Button);
		Reusable_methods.elementClick(Refresh_Button);
		return this;
	}

	public Index_Page_Customer ClickUnauthorized() {
		Reusable_methods.delay(10);
		Reusable_methods.explicitWait(unauthorized_tab);
		Reusable_methods.elementClick(unauthorized_tab);
		return this;
	}

	public Index_Page_Customer ClickAuthorizedtab() {
		Reusable_methods.delay(5);
		Reusable_methods.explicitWait(Authorized_tab);
		Reusable_methods.elementClick(Authorized_tab);
		return this;
	}

}
