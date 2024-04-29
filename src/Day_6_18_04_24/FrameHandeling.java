package Day_6_18_04_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandeling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait function method here 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
	    // we can use frame name or find element using frame name and by passing index position of the frame also
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.applet")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Applet")).click();
		
	
	
	}

}
