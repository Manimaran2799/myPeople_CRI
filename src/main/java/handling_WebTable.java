import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class handling_WebTable {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://letcode.in/table");
			
			WebElement table = driver.findElement(By.xpath("//table[@name='table']"));

			//
//			List<WebElement> Headers = table.findElements(By.xpath("//table[@name='table']/thead//th"));
//			int count = Headers.size();
//			
//			for (int i = 0; i < count; i++) {
//				System.out.println(Headers.get(i).getText());
//			}
			
			//all data print
			List<WebElement> AllRows = table.findElements(By.xpath("//table[@name='table']/tbody/tr"));
			int count = AllRows.size();
			System.out.println(count);
//			for (int i = 0; i < count; i++) {
//				String output = AllRows.get(i).getText();
//				System.out.println(output);
//			}
//			
			
			//individual row
//			WebElement FirstRow = AllRows.get(1);//particukar
//			System.out.println(FirstRow.getText());//Column 
//	
			
			for (int i = 0; i < count; i++) {
			 List<WebElement> InvRows = AllRows.get(i).findElements(By.xpath("//table[@name='table']/tbody/tr//td"));
				WebElement lastname = InvRows.get(1);
				String text = lastname.getText();
				System.out.println(text);
				driver.manage().window().maximize();
				if(text.equals("Raj")) {
					
					WebElement in = InvRows.get(3).findElement(By.xpath("//table[@name='table']/tbody/tr//td//input"));
					in.click();
break;
			}
//			driver.close();
	}

	}}
