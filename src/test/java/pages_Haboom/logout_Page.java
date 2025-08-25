package pages_Haboom;

import java.net.http.WebSocket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.testBase;

public class logout_Page extends testBase{
	
		public void logout_Page() {
			PageFactory.initElements(driver, this);
		}
		@FindBy (xpath = "//div[@id='acco_arr']")
		private WebElement myaccount;
		
		@FindBy(xpath ="//a[@id='logout']")
		private WebElement logoutButton;
		public void logout() throws InterruptedException {
			
			myaccount.click();
			Thread.sleep(2000);
			logoutButton.click();
		}
}
