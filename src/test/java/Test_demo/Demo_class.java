package Test_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_class {
	
	 static WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void browser() {
	        driver.get("https://www.orangehrm.com/");
	    }

	    @Test
	    public void checkURL() {
	        String expectedURL = "https://www.orangehrm.com/";
	        String actualURL = driver.getCurrentUrl();
	        Assert.assertEquals(actualURL, expectedURL, "URL does not match!");
	    }

	    @Test(dependsOnMethods = "browser")
	    public void getText() {
	        String expectedText = "Book a Free Demosss";
	        String actualText = driver.findElement(
	                By.xpath("(//button[contains(@class, 'btn-contact-sales') and normalize-space()='Book a Free Demo'])[2]")).getText();
	        Assert.assertEquals(actualText, expectedText, "Button text does not matches!");
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
