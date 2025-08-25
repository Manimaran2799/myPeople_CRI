import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/*
 * Parallel--->tests--->single test case for diff browser (cross browser testing)
 * Class--->independant class(like diff modules--->doc,approvals
 * methods--->independant methods
 */
public class paraMeters {

	RemoteWebDriver driver;

	@Parameters({ "url", "email", "password", "Browser" })
	@Test
	public void para(String url, String emailID, String pass, String browser) {

		switch (browser) {
		case "Chrome":
			ChromeOptions choptions = new ChromeOptions();
			choptions.addArguments("--disable-notifications");
			driver = new ChromeDriver(choptions);

			break;

		default:
			EdgeOptions edoptions = new EdgeOptions();

			edoptions.addArguments("--disable-notifications");
			driver = new EdgeDriver(edoptions);
			break;
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailID);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

		driver.findElement(By.xpath(
				"//div[@class=\"x6s0dn4 x78zum5 x1s65kcs x1n2onr6 x1ja2u2z\"]//div[@class=\"x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z\"]"))
				.click();
		driver.findElement(By.xpath("//div[@class='x1qjc9v5 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1r8uery xdt5ytf x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli xz9dl7a xsag5q8 x4uap5 xkhd6sd x1n2onr6 x1ja2u2z']")).click();
		driver.quit();

	}
}
