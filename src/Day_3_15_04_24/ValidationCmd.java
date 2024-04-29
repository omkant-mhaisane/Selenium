package Day_3_15_04_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCmd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("id"));
		WebElement pass = driver.findElement(By.id("pass"));
		System.out.println(pass.getTagName());
		System.out.println(pass.getText());
		driver.close();
		
		
	}

}
