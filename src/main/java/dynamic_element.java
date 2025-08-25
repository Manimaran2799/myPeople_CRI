
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class dynamic_element {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> Rows = table.findElements(By.xpath(".//tbody/tr"));// allrows in body
		int numofrow = Rows.size();// rows count
		System.out.println("n.o of rows " + numofrow);

		for (int i = 0; i < numofrow; i++) {

			List<WebElement> cells = Rows.get(i).findElements(By.xpath(".//td"));// Extracting data in row wise333
			WebElement lastname = cells.get(1);// lastname column
			String Text = lastname.getText();
			

			if (Text.equals("Raj")) {
				WebElement inputBox = cells.get(3).findElement(By.tagName("input"));
				WebElement Label = cells.get(3).findElement(By.xpath("//*[contains(text(),' handle it')]"));

				
				
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Label);//Scroll
			
			delay(3000);
				inputBox.click();
				break;
			}
		}

//		List<WebElement> headers = table.findElements(By.xpath("//table[@id='simpletable']/thead/tr/th"));
////		int size = headers.size();
////		
////		for (int i = 0; i < size; i++) {
////			String Output = headers.get(i).getText();
////			System.out.println(Output);
////		}
		// Locate the table

//		// Get all rows in the table body
//		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr")); // Use relative XPath with '.'
//
//		// Count the number of rows
//		int numOfRows = rows.size();
//		System.out.println("Number of rows: " + numOfRows);
//
//		for (int i = 0; i < numOfRows; i++) {
//		    // Get all cells (columns) for the current row
//		    List<WebElement> cells = rows.get(i).findElements(By.xpath(".//td")); // Relative XPath to avoid fetching all cells
//
//		    // Get the text from the second column (last name)
//		    WebElement lastName = cells.get(1); // Index starts from 0
//		    String text = lastName.getText();
//		    
//		    // Check if the text matches "Raj"
//		    if (text.equals("Raj")) {
//		        // Find the input box in the fourth column and click it
//		        WebElement inputBox = cells.get(3).findElement(By.tagName("input"));
//		        inputBox.click();
//		        break; // Exit the loop after clicking
//		    }
//		}

	}
	
	public static void delay(int sec) {
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
