package Day_3_15_04_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     
     
 
 }
}
