package Base_FinZor;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


public class Base_Class {

	// step
	public static WebDriver driver;
	private Properties prop;

	public static ChromeOptions options;
	

	@BeforeMethod
	public void KickStart() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
			    System.getProperty("user.dir") + "/Test_Datas/Config.properties");

		prop.load(fis);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("Url");
		
		
		options = new ChromeOptions();
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-autofill-keyboard-accessory-view");
		options.addArguments("--disable-popup-blocking");
		
		//browser launch
		if (browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver =new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver=new FirefoxDriver();
		}
		else throw new RuntimeException("Browser not found"+browser);
		
		//actions on after browser launch
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
	}

	@AfterMethod
	public void shutDown() {
		
		if (driver !=null) {
			driver.quit();
		}

	}

}
