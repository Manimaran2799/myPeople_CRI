package Utility;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.invokers.Arguments;

import Base_FinZor.Base_Class;

public class Reusable_methods extends Base_Class {

	public Reusable_methods() {
		PageFactory.initElements(driver, this);
	}

	public static void SendKeys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void SendKeys(WebElement element, long value) {
		element.sendKeys(String.valueOf(value));
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}

	public static void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void delay(int Seconds) {
		try {
			Thread.sleep(Seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void DDHandling(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public static void JS(WebElement element) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static String getText(WebElement element) {
		return element.getText();
	}

	public static Boolean ElementIsDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public static void ElementIsclickable(WebElement element) {
		Boolean output = (element.isDisplayed() && element.isEnabled());
		assertEquals(false, output);
	}

	public static void FileUpload(WebElement element, String path) {
		WebElement uploadInput = element;
		((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", uploadInput);
		uploadInput.sendKeys(path);

	}

	public static String GetAttribute(WebElement element, String atriName) {
		return element.getAttribute(atriName);
	}

	public static void Clicksaveandnext(WebElement element) {

		int attempts = 0;

		while (attempts < 10) {

			try {

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				wait.until(ExpectedConditions.elementToBeClickable(element)).click();
				break;
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception

				System.out.println("Stale element caught, retrying attempt " + (attempts + 1));
			}
			attempts++;
		}

	}

	public static void ClicksaveandContinue(WebElement element) {
		int attempts = 0;

		while (attempts < 10) {

			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			} catch (StaleElementReferenceException e) {
				System.out.println("Stale element Caught , retrying attempt" + (attempts + 1));
			}

		}
	}

	public static void Clicksubmit(WebElement element) {
		int attempts = 0;

		while (attempts < 3) {

			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} catch (ElementClickInterceptedException e) {
				System.out.println(" element is still not able to click , retrying attempt" + (attempts + 1));
			}

		}
	}

	public static void ClickYes(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}

	//handling AlertBox
	
	public static void HandlingAlert() {
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}
}
