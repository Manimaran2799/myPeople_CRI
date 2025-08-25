package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testBase {
	public static WebDriver driver;
	public static Properties prop;

	@BeforeMethod
	public void intialization() throws FileNotFoundException {
		try {
			prop = new Properties();
			
			System.out.println(System.getProperty("user.dir") + "\\src\\test\\java\\com\\Config\\Text.properties");
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\Config\\Text.properties");
			prop.load(file);
			String browserName = prop.getProperty("browser");

			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("fireFox")) {
				driver = new FirefoxDriver();
			}

			String Link = prop.getProperty("url");
			driver.get(Link);
			driver.manage().window().maximize();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@AfterMethod
	public void turnOFF() {
		driver.quit();

	}
}
