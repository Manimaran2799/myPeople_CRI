package PageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_FinZor.Base_Class;
import Utility.Reusable_methods;

public class Currency_master extends Base_Class {

	// instance
	public static Currency_master instance;

	public static Currency_master getinstance() {
		if (instance == null) {
			synchronized (driver) {

				if (instance == null) {

					instance = new Currency_master();

				}
			}

		}

		return instance;

	}

	// constructor
	public Currency_master() {
		PageFactory.initElements(driver, this);
	}

	// locators
	@FindBy(xpath = "//input[@id='Currency Name']")
	WebElement Currency_name;

	@FindBy(xpath = "//*[text()='Select Country Code']")
	WebElement Country_Code;

	@FindBy(xpath = "//ul//li[contains(@class,'close-modal')]")
	WebElement Country_options;

	@FindBy(xpath = "//input[@id='Currency Prompt']")
	WebElement Currency_prompt;

	@FindBy(xpath = "//*[text()='SAVE & CONTINUE']")
	WebElement Savecontinue;

	@FindBy(xpath = "//*[text()='Add New']")
	WebElement Addnew;

	@FindBy(xpath = "//input[@id='Valid Denomination']")
	WebElement ValidDenomination;

	@FindBy(xpath = "//*[text()='Select Dens Type']")
	WebElement DensTypeDD;

	@FindBy(xpath = "//*[text()='LEGAL TENDER']")
	WebElement option_001;

	@FindBy(xpath = "//*[text()='SAVE']")
	WebElement Save;

	@FindBy(xpath = "(//*[text()='Authorized'])[1]")
	WebElement Authorized;

	@FindBy(xpath = "//*[text()='CREATE NEW']")
	WebElement Create_new;

	@FindBy(xpath = "//*[text()='SUBMIT']")
	WebElement SubmitButton;

	@FindBy(xpath = "//*[text()='Yes']")
	WebElement YesButton;

	@FindBy(xpath = "//*[text()='Master Settings']")
	WebElement mastersettings;
	@FindBy(xpath = "//*[text()='CURRENCY MASTER']")
	WebElement Currency_master;

	@FindBy(xpath = "//*[text()='LOOKUP MASTER']")
	WebElement lookmaster;

	// actions

	// login
	public Currency_master login(String Usr, String Pwd) {

		new Login_Page().setUsername(Usr).setPassword(Pwd).clickLogin();
		return this;
	}

	public Currency_master Navi_to_currency() {
		Reusable_methods.explicitWait(mastersettings);
		Reusable_methods.elementClick(mastersettings);
		Reusable_methods.explicitWait(lookmaster);
		Reusable_methods.elementClick(lookmaster);

		try {
			Reusable_methods.explicitWait(Currency_master);
			Reusable_methods.elementClick(Currency_master);

			return this;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return this;
	}

	public Currency_master Create_new() {
		Reusable_methods.explicitWait(Create_new);
		Reusable_methods.elementClick(Create_new);
		return this;
	}

	public Currency_master SendCurrencyName(String name) {
		Reusable_methods.SendKeys(Currency_name, name);
		return this;
	}

	public void SendCurrencyPrompt(String input) {
		Reusable_methods.SendKeys(Currency_prompt, input);
	}

	public Currency_master SaveContinue()

	{
		Reusable_methods.elementClick(Savecontinue);
		return this;
	}

	public Currency_master AddNew() {
		Reusable_methods.elementClick(Addnew);
		return this;
	}

	public Currency_master send_Valid(String input) {
		Reusable_methods.SendKeys(ValidDenomination, input);
		return this;
	}

	public Currency_master DensType() {

		Reusable_methods.elementClick(DensTypeDD);
		Reusable_methods.elementClick(option_001);
		return this;
	}

	public void saveButton() {
		Reusable_methods.elementClick(Save);
		;
	}

	public Currency_master SubmitButton() {
		Reusable_methods.elementClick(SubmitButton);
		Reusable_methods.elementClick(YesButton);
		return this;
	}

	public Currency_master getAllcountries() {
		Reusable_methods.explicitWait(Country_Code);
		Reusable_methods.elementClick(Country_Code);
		Reusable_methods.explicitWait(Country_options);

		List<WebElement> countryCodes = Reusable_methods
				.getElements(By.xpath("//ul//li[contains(@class,'close-modal')]"));

		for (WebElement code : countryCodes) {
			System.out.println( code.getText());
		}

		return this;

	}

}
