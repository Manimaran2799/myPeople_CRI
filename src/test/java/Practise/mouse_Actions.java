package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse_Actions {

	/**
	 * Drag and Drop Right Click mouseHover DoubleClick
	 * Right click-Contextclick()
	 * mouseover-movetoelement()
	 * Double click-doubleclick()
	 * Drag and Drop
	 */

	static WebDriver driver;

	public void time(int Seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));
	}

	@Test
	public void mouseHover() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		time(10);
		driver.get("https://metropolitan.realestate/");
		WebElement Buy = driver.findElement(By.xpath("//a[@class='header-menu__link'][normalize-space()='Buy']"));
		WebElement Villa = driver.findElement(By.xpath(
				"//a[@href='https://metropolitan.realestate/buy/villas-for-sale-in-dubai/']//span[@class='title normal'][normalize-space()='Villas']"));

		Actions act = new Actions(driver);

		act.moveToElement(Buy).moveToElement(Villa).click().perform();
		driver.quit();

	}

	@Test
	public void rightClick() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement copy = driver.findElement(By.xpath("//span[normalize-space(text())='Copy']"));
		Actions act = new Actions(driver);

		WebElement button = driver.findElement(By.xpath("(//*[normalize-space(text())='right click me'])[1]"));

		act.moveToElement(button).build().perform();
		try {
			act.contextClick(button).perform();
		} catch (Exception e) {
			act.contextClick(button).perform();
		}

		copy.click();

		driver.switchTo().alert().accept();

		driver.quit();

	}

	@Test
	public void doubleClick() {
		driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement click = driver.findElement(By.cssSelector("button[ondblclick='myFunction1()']"));

		Actions act = new Actions(driver);

		field1.clear();
		time(2);
		field1.sendKeys("You we Can!!!");

		act.doubleClick(click).perform();

		System.out.println(field2.getAttribute("value"));

	}
	
	@Test
	public void DragandDrop() {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement point1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement point2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(point1, point2).perform();
		
		System.out.println(point2.getText());
	}
	
	

}
