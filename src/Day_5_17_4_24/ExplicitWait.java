package Day_5_17_4_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("om");
		// Difference between Implicit wait and Explicit wait
		//Implicit wait
		// It will tell the web driver to wait for some time till the webpage is getting loaded before throwing no such element exception
		// It is global wait
		//syntax - driver.manage().timeOuts.implicitlyWait(Duration.ofSeconds(10));			
		//Explicit wait-
		//It will the WebDriver is directed to wait until a certain condition occurs before proceeding with executing the code.
		//syntax - driver.manage().timeOut.explicitlyWait(Duration.ofSecons(10));
		
		
	}
	
	/// diff bet. driver close and quite
	
}
