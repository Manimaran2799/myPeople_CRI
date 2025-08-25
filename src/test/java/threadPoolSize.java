

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class threadPoolSize {

	@Test(invocationCount = 3 ,threadPoolSize = 3)
	public void navigate() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
	    WebElement logo = driver.findElement(By.xpath("(//img[@id='cb-logo-main-menu'])[1]"));
	    String actual=logo.getText();
	    String expected="cricBuzz_verify.verify";
	    System.out.println(expected==actual);
	    driver.quit();
	}
	
}
