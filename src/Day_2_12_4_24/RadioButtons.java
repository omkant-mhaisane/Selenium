package Day_2_12_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.className("rct-checkbox")).click();
		
		driver.findElement(By.id("yesRadio")).click();
		driver.findElement(By.id("impressiveRadio")).click();
		
		

	}

}
