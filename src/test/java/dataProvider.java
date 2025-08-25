/*
* dataProvider--->for passing multiple test data
 * in a test methods
 * 
 * points to remember:
 * method which is have @dataprovider will returns only object[][] 
 * 
 * Diff between attribute dataprovider is used for interlinking the Annotation dataprovider 
 */

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Utils.input_Data;


public class dataProvider  {
	
	
//	@DataProvider(name="negative")
//	public Object[][] negaData() {
//		return new Object[][] {
//			{"",""},//null data
//			{"manimar.1999@gmail.com",""},//positive,null
//			{"krishmanimaran11@gmail.com","7787878"},//positive,negative
//			{"manimar@gmail.com","8787878"},//neg,neg
//			{"","Manimaran@123"},//null,positive
//			{"ini@","Manimaran@123"},//negative,positive
//			
//			};
//			
//	}
	

	@Test(dataProvider = "Positive",dataProviderClass = input_Data.class) //
	public void loginFuntionality(String emailID, String pass) {

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailID);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'ManiMaran Sudhakar')]")).getText());
		driver.findElement(By.xpath(
				"//div[@class=\"x6s0dn4 x78zum5 x1s65kcs x1n2onr6 x1ja2u2z\"]//div[@class=\"x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z\"]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='x1qjc9v5 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1r8uery xdt5ytf x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli xz9dl7a xsag5q8 x4uap5 xkhd6sd x1n2onr6 x1ja2u2z']"))
				.click();
		driver.quit();
	}
	
//	@Test(dataProvider = "negative")
//	public void negativeTest(String emailID,String pass) {
//		ChromeOptions ch = new ChromeOptions();
//		ch.addArguments("disable-notifications");
//		ChromeDriver driver = new ChromeDriver(ch);
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailID);
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
//		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
//		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'ManiMaran Sudhakar')]")).getText());
//		driver.findElement(By.xpath(
//				"//div[@class=\"x6s0dn4 x78zum5 x1s65kcs x1n2onr6 x1ja2u2z\"]//div[@class=\"x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z\"]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//div[@class='x1qjc9v5 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1r8uery xdt5ytf x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli xz9dl7a xsag5q8 x4uap5 xkhd6sd x1n2onr6 x1ja2u2z']"))
//				.click();
//		driver.quit();
	//}

	@Test
	public void verify() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		WebElement logo = driver.findElement(By.xpath("(//img[@id='cb-logo-main-menu'])[1]"));
		String actual = logo.getText();
		String expected = "cricBuzz_verify.verify";
		System.out.println(expected == actual);
		driver.quit();
	}
}

//
//public class dataProvider {
//
//    // DataProvider method to supply test data
//    @DataProvider(name = "Positive")
//    public Object[][] inputs() {
//        // Corrected the array indices and return type
//        return new Object[][] {
//            {"manimar.1999@gmail.com", "Mani@123"},
//            {"krishmanimaran11@gmail.com", "Yaathra@123"}
//        };
//    }
//
//    // Test method that uses the DataProvider
//    @Test(dataProvider = "Positive")
//    public void loginFunctionality(String emailID, String password) {
//        // Initialize EdgeDriver (make sure EdgeDriver is set up properly on your system)
//        System.setProperty("webdriver.edge.driver", "path_to_your_edgedriver");
//        ChromeDriver driver=new ChromeDriver();
//
//        try {
//            // Open Facebook
//            driver.get("https://www.facebook.com/");
//            driver.manage().window().maximize();
//
//            // Enter email and password
//            driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailID);
//            driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
//
//            // Click the login button
//            driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
//
//            // Logout process (modify the XPath based on actual structure if needed)
//            driver.findElement(By.xpath("//div[contains(@class,'user-settings-icon-class')]")).click();
//            driver.findElement(By.xpath("//div[contains(@class,'logout-option-class')]")).click();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Quit the browser
//            driver.quit();
//        }
//    }
//}
//
