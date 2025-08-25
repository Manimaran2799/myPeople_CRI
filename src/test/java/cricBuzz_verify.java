import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cricBuzz_verify {

	@Test
	public void verify() {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
	    WebElement logo = driver.findElement(By.xpath("(//img[@id='cb-logo-main-menu'])[1]"));
	    String actual=logo.getText();
	    String expected="cricBuzz_verify.verify";
	    System.out.println(expected==actual);
	    driver.quit();
	}
}
	

