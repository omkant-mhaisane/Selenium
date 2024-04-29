package Day_4_16_04_24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandeling {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		 Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 String msg = alert.getText();
         System.out.println("Alert msg is: " +msg);
		 Thread.sleep(2000);
		 alert.accept();

		 	 
	}

}
