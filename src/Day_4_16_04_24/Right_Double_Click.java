package Day_4_16_04_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Double_Click {

	public static void main(String[] args) throws InterruptedException {
		// We can perform Right click and double click operation using action class
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	  WebElement emailTextbox = driver.findElement(By.id("email"));
	  Actions act = new Actions(driver);
	  emailTextbox.sendKeys("abc@gmail.com");
	  act.doubleClick(emailTextbox).build().perform();
	  
	  Thread.sleep(2000);
	  //context text is used to right click
	  act.contextClick(emailTextbox).build().perform();
	  
	  
	
	}

}
