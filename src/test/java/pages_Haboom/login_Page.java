package pages_Haboom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.testBase;

public class login_Page extends testBase {

	public login_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='cls_login_email ssc-itx']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='submitLogForm']")
	private WebElement loginbutton;

	public void Login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
	}
}
