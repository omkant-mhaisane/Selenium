package Day_4_16_04_24;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File target = new File("C:\\Users\\USER\\Pictures\\Screenshot\\Facebook.png");
	     try {
	    	 Files.copy(source, target);
	     } catch (IOException e) {
	    	 e.printStackTrace();
	     }
	    
	}

}
