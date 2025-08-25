package pages_Haboom;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.testBase;

import Utils.utility;

public class account_Summary extends testBase {

	public account_Summary() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='ssc-balance']")
	private WebElement mainExposuredd;

	// DD's
	@FindBy(xpath = "(//td[@class='ssc-wla wallet_balance'])[2]")
	private WebElement r1d1;// $0.00

	@FindBy(xpath = "//div[contains(text(),'Cash Balance')]")
	private WebElement r1d2;// cashbalance

	@FindBy(xpath = "//a[contains(text(),'Hide Balance')]")
	private WebElement r1d3;// hidebalance

	@FindBy(xpath = "(//td[@class='ssc-wla wallet_balance'])[3]")
	private WebElement r2d1;// $0.00

	@FindBy(xpath = "//div[contains(text(),'Main Wallet')]")
	private WebElement r2d2;// Main wallet

	@FindBy(xpath = "//a[contains(text(),'Deposit')][@class='ssc-wlcp ssc-wlcDeposit ']")
	private WebElement r2d3;// deposit

	@FindBy(xpath = "//a[contains(text(),'Withdraw')]")
	private WebElement r2d4;// withdraw

	@FindBy(xpath = "//a[normalize-space(text())='Account Summary']")
	private WebElement AccSummary;

	@FindBy(xpath = "//a[@class='ssc-sb']")
	private WebElement showBalancebtn;

	@FindBy(xpath = "//a[@id='EXCHANGE']")
	private WebElement ExchangeTab;

	@FindBy(xpath = "//a[@class='ssc-unc']")
	private WebElement myAccountDD;
	
	@FindBy(xpath = "//a[@class='ssc-myau'] ")
	private WebElement userName;

	@FindBy(xpath = "(//h4)[1]")
	private WebElement textWelcome;
	
	//elements on Account summary pages
	
	

	public void beforeLogin() {
		// Set an implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		// Check if the element is displayed
		Boolean output = utility.isDisplayed(AccSummary);

		// Validate the result and print appropriate messages
		if (!output) {
			System.out.println("Test case passed: Element is not displayed as expected.");
		} else {
			System.out.println("Test case failed: Element is displayed unexpectedly.");
		}
	}

	public void afterLogin(String username, String password) {

		new login_Page().Login(username, password);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(mainExposuredd));
		boolean output = utility.isDisplayed(mainExposuredd);
		if (output) {
			System.out.println("Test case passed: Element is  displayed as expected.");
		} else {
			System.out.println("Test case failed: Element is not displayed unexpectedly.");
		}
	}

	public void Fade(String username, String password) {
		new login_Page().Login(username, password);
		utility.explicitWait(mainExposuredd, 4);

		String initialColor = mainExposuredd.getCssValue("background-color");
		System.out.println(initialColor);

		utility.mouseHover(mainExposuredd);
		String hoverColor = mainExposuredd.getCssValue("background-color");
		System.out.println(hoverColor);
	}

	public void clickMainExposure() {
		utility.explicitWait(mainExposuredd, 4);
		utility.click(mainExposuredd);

	}

	public void elementsVisibility() {
		utility.verifyElementVisibility(r1d1, 2, "0.00 is displayed");
		utility.verifyElementVisibility(r1d2, 2, "Cashbalance is displayed");
		utility.verifyElementVisibility(r1d3, 2, "Hide Balance option is displayed.");
		utility.verifyElementVisibility(r2d1, 2, "2nd row 0.00 option is displayed.");
		utility.verifyElementVisibility(r2d2, 2, "Main wallet option is displayed.");
		utility.verifyElementVisibility(r2d3, 2, "Deposit option is displayed.");
		utility.verifyElementVisibility(r2d4, 2, "Withdraw option is displayed.");

	}

	public void accSummaryisDisplayed() {

		utility.verifyElementVisibility(AccSummary, 2, "Acc summary link is Displayed");
		// Get the link of the Account Summary element
		String link = utility.getLink(AccSummary);
		System.out.println("Account Summary Link: " + link);
	}

	public void showBalanceDisplayed() {
		utility.verifyElementVisibility(mainExposuredd, 4, "main exposure dd is displayed");
		clickMainExposure();
		utility.implicitWait(2);
		utility.click(r1d3);// clicking the hide Balance
		System.out.println(utility.getText(showBalancebtn));
	}

	public void visibleofMainExposureDD() {
		showBalanceDisplayed();
		utility.click(showBalancebtn);
		System.out.println(utility.getText(mainExposuredd));
	}

	public void visiblityofShowBalanceBtn() {
		clickMainExposure();
		utility.click(r1d3);
		String initialText = utility.getText(showBalancebtn);
		System.out.println("initial text before refresh : " + initialText);

		utility.refresh();
		utility.implicitWait(4);
		boolean afterRefresh = utility.isDisplayed(showBalancebtn);
		assertTrue(afterRefresh, "The Show Balance button is unexpectedly visible after refresh");
	}

	public void textOfUseronAccSumpage() {
		//getting text of username
		utility.explicitWait(myAccountDD, 4);
		utility.click(myAccountDD);
		String un = utility.getText(userName);
		utility.implicitWait(4);
		
		clickMainExposure();
		utility.click(AccSummary);
		utility.implicitWait(4);
		
		//getting header text 
		String expected = "Hi " + un + ", here's how much you can bet :";
		String actual = utility.getText(textWelcome);
		System.out.println(actual);
		
		assertEquals(actual, expected);

		

	}

	

}