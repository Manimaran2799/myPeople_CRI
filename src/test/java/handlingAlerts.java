import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingAlerts {
	@Test
	public void Alerts() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//JS alerts
		//1)ok
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		driver.switchTo().alert().accept();
		
		//confirm and dismiss
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		//prompt box 
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
        driver.switchTo().alert().sendKeys("Summa"); // Input text
        System.out.println("Entered text in prompt box: 'Summa'");
        Thread.sleep(2000); // Optional delay for observation
        driver.switchTo().alert().accept(); // Accept alert
        System.out.println("Accepted prompt alert");
		
		
	}
}
