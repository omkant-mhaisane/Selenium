package Day_2_12_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("abc@gmail.com");
	}

}
