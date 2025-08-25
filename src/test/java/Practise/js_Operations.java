package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * JS executor--->interface--->implements through Remote webdriver
 * where it is parent for various classes
 * when we go for JS exe--->elementintercepted exception
 * 
 * 
 */


public class js_Operations {
	
	
	WebDriver driver;
	@Test
	public void sample_operations() {
		//SendKeys--->we can use arguments[].setattributes('','')
	driver=new ChromeDriver();	
	driver.get("https://www.facebook.com/");	
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','krishmanimaran11@gmail.com')", email);
	js.executeScript("arguments[0].setAttribute('value','password@123')", password);
	
	js.executeScript("arguments[0].click()",button );
	}
	@Test
	//Scrolling 
	public void Scroll() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Kamal_Haasan");
		driver.manage().window().maximize();
		
////		//pixel
	JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500);");
//		
//		//webelement
//		WebElement element = driver.findElement(By.xpath("//h3[@id='1980–1989']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		//top and bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,-0);");
	}
}
