import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class handlingFrames {

	@Test
	public void Frames() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		/*
		 * Task-1 switch to 5th frame interact with input box
		 *
		 */

		WebElement frame5 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]"));
		driver.switchTo().frame(frame5);

		WebElement text1 = driver.findElement(By.xpath("//input[@name='mytext5']"));
		text1.sendKeys("Hi hello vanakkam");

		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();

//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(frame5);
//		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_5.html']")));
		Thread.sleep(4000);

		WebElement logo = driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']"));
		if (logo.isDisplayed()) {
			System.out.println("The logo is been displayed");
		} else {
			System.out.println("the Logo is not displayed");
		}

		driver.switchTo().defaultContent();
	}
}
