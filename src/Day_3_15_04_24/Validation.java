package Day_3_15_04_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement emailbox = driver.findElement(By.id("email"));
		WebElement names = driver.findElement(By.id("email"));
		WebElement submits = driver.findElement(By.id("login"));
		
		System.out.println(emailbox.isDisplayed());
		System.out.println(names.isEnabled());
		System.out.println(submits.isSelected());
		
		if(emailbox.isDisplayed()==true) {
			emailbox.sendKeys("abc@123");
		} else if(names.isEnabled() == true) {
			names.sendKeys("omkant");
		}else if(submits.isSelected()) {
			submits.click();
		}
	}

}
