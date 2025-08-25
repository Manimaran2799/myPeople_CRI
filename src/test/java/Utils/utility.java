package Utils;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.testBase;

public class utility extends testBase {

	/*
	 * Click,getText,Clear,DD handle,isdisplayed,isSelected,isEnabled,CheckBox
	 * selection,sendKeys
	 */

	public static void click(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void sendKeys(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].setAttribute('value','Demo')", element);
	}

	public static String getText(WebElement element) {
		return element.getText();

	}

	public static boolean isDisplayed(WebElement element) {

		return element.isDisplayed();

//		 try {
//		        return element.isDisplayed();
//		    } catch (NoSuchElementException e) {
//		    	
//		        //System.out.println("Element not found: " + e.getMessage());
//		        return false;
//		    } catch (Exception e) {
//		        System.out.println("Unexpected exception occurred: " + e.getMessage());
//		        return false;
//		    }
	}

	public static boolean isSelected(WebElement element) {
		return element.isSelected();
	}

	public static boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	public static void handleDD(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void handleCheckBox(WebElement element) {
		element.click();
	}

	public static void refresh() {

		driver.navigate().refresh();
	}

	public static void backButton() {

		driver.navigate().back();
	}

	public static void mouseHover(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public static String getLink(WebElement element) {
		String link = element.getAttribute("href");
		return link;
	}

	public static void explicitWait(WebElement element, int num) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void implicitWait(int num) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
	}

	public static void verifyElementVisibility(WebElement element, int waitTime, String assertionMessage) {
		// Wait for the element
		utility.explicitWait(element, waitTime);

		// Verify the element is displayed
		Boolean isVisible = utility.isDisplayed(element);
		assertTrue(isVisible, assertionMessage);
	}
	
	

	public static void highLight() {

	}

}
