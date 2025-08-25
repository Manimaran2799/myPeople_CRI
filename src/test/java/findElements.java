import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findElements {

	@Test
	public void Displayed() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wwe.com/");
		WebElement element = driver.findElement(By.xpath("(//a[text()='Tickets'])[1]"));
		boolean output = element.isDisplayed();
		System.out.println(element.getText());
		System.out.println("Text is displayed on header section" + " " + output);
		driver.quit();
	}

}
