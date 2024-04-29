package Day_2_12_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClerMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		emailTextBox.clear();
	}

}
