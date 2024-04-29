package Day_4_16_04_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		//we can select mouse hover activity using action class. 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 //to mouse hover 
	 WebElement Fashion = driver.findElement(By.linkText("Fashion"));
	 Actions act = new Actions(driver);
	 act.moveToElement(Fashion).build().perform();
	
	//for dra and drop option 
	 
	}

}
