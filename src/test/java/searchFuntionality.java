import static org.testng.Assert.assertEquals;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class searchFuntionality {
	
	@Test
	public void Search() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement searchField = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		searchField.click();
		searchField.sendKeys("Boost");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.RETURN).perform();


		String actual = driver.findElement(By.xpath("(//a[contains(text(),'Boost')])[1]")).getText();
		String expected="Boost Nutrition Drink";
		 assertEquals(actual, expected);
		driver.quit();
	}
}
