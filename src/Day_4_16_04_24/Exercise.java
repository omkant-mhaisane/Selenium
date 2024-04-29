package Day_4_16_04_24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/alerts");
		 driver.findElement(By.id("alertButton")).click();
		 Thread.sleep(5000);
		 Alert alert = driver.switchTo().alert();
		 String msg = alert.getText();
        System.out.println("Alert msg is: " +msg);
		 Thread.sleep(2000);
		 alert.accept();
	}

}
