
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handling_Checkboxes {

	@Test
	public void CheckBoxes() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement scrollObject = driver.findElement(By.xpath("//label[normalize-space()='Gender:']"));
		js.executeScript("arguments[0].scrollIntoView(true);", scrollObject);

		List<WebElement> Checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		int number = Checkboxes.size();
		// Select first 3

		for (int i = 0; i < number - 4; i++) {
			Checkboxes.get(i).click();
		}

		// deselect the selected
		for (int i = 0; i < number; i++) {

			if (Checkboxes.get(i).isSelected()) {
				Checkboxes.get(i).click();
				System.out.println("Checkboxes are unselected");
			}

		}

		// Select last 3 checkBoxes
		for (int i = number - 3; i < number; i++) {
			Checkboxes.get(i).click();
		}

//		driver.quit();
	}

	private JavascriptExecutor JavascriptExecutor(ChromeDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
