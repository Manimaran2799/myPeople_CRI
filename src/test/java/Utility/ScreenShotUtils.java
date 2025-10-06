package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;
public class ScreenShotUtils {
	
	
	public static String useScreenShot(WebDriver driver, String testnameString) throws IOException {
		
		String Screenshotname=testnameString +".jpg";
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir" )+"/Screenshots/"+Screenshotname;
		File path=new File(dest);
		FileHandler.copy(source, path);
		return null;
		
	}

}
