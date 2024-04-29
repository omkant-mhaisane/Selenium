package Day_5_17_4_24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExercise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List <WebElement> allButtons = driver.findElements(By.tagName("button"));
		int count = allButtons.size();
		System.out.println("Total number of Buttons: "+count);
		
		for (int i =0; i<count; i++) {
			System.out.println(allButtons.get(i).getText());
		}
	}

}
