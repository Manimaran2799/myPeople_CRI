package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_FinZor.Base_Class;
import Utility.Reusable_methods;

public class Login_Page extends Base_Class {


	private static Login_Page instance;

	// constructor
	public Login_Page() {
		PageFactory.initElements(driver, this);
	}

	public static Login_Page getInstance() {
		if (instance == null|| driver == null) {
			synchronized (Login_Page.class) {
				if (instance == null|| driver == null) {
					instance = new Login_Page();
				}
				else {
					  PageFactory.initElements(driver, instance);
				}
			}
		}
		return instance;
	}

	// Locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement Username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement Password;

	@FindBy(xpath = "//button[normalize-space(text())='LOGIN']")
	private WebElement login;
	
	@FindBy(xpath = "//*[text()='CREATE NEW']")
	WebElement Customer_DD;

	// Actions
	public Login_Page setUsername(String txtUsername) {
		Reusable_methods.explicitWait(Username);
		Reusable_methods.SendKeys(Username, txtUsername);
		return this;
	}

	public Login_Page setPassword(String txtPassword) {
Reusable_methods.delay(2);
		Reusable_methods.SendKeys(Password, txtPassword);
		return this;
	}

	public Login_Page clickLogin() {
		Reusable_methods.delay(2);
		Reusable_methods.elementClick(login);
		Reusable_methods.delay(5);
		return this;
	}

	public String getURL() {
		Reusable_methods.delay(2);
		return driver.getCurrentUrl();
		

	}
	public void ElementCheck() {
		Reusable_methods.explicitWait(Customer_DD);
		Reusable_methods.ElementIsDisplayed(Customer_DD);
	
	}

}
