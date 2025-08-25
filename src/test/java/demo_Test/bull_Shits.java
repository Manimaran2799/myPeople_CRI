package demo_Test;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bull_Shits {
	
	public static WebDriver driver;
	
	@Test
	public void Frames() throws InterruptedException {
		 driver = new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		/*
		 * Task-1 switch to 5th frame interact with input box
		 *
		 */

		WebElement frame5 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]"));
		driver.switchTo().frame(frame5);

		WebElement text1 = driver.findElement(By.xpath("//input[@name='mytext5']"));
		text1.sendKeys("Hi hello vanakkam");

		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();

//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(frame5);
//		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_5.html']")));
		Thread.sleep(4000);

		WebElement logo = driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']"));
		if (logo.isDisplayed()) {
			System.out.println("The logo is been displayed");
		} else {
			System.out.println("the Logo is not displayed");
		}

		driver.switchTo().defaultContent();
		driver.quit();
	}
	
	@Test
	public void CheckBoxes() {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement scrollObject = driver.findElement(By.xpath("//label[normalize-space()='Gend3333er:']"));
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
		driver.quit();

	}
	}
