package Day_4_16_04_24;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;


public class Screenshot_method {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
	 driver = new EdgeDriver();
	 driver.get("https://www.facebook.com");
	 captureScreenshot("FaceBookLogin");
	 driver.close();
		
	}
	public static void captureScreenshot(String name) throws IOException {
		String path = "C:\\Users\\USER\\eclipse-workspace\\Selinium_Testing\\Screenshot"+name +  ".png";
	    TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(path);
	    Files.copy(screenshot, target);
	
	}
	

}
