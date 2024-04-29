package Day_2_12_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * There are 8 types of locaters
		 * */ 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.partialLinkText("Forg")).click();
		//we can use half name of link text alsoo to find the element
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);//2000 mili second means it pause the exicution for 2 second
	    driver.findElement(By.name("firstname")).sendKeys("Selinium");
		driver.findElement(By.name("lastname")).sendKeys("Automation");
		driver.findElement(By.name("reg_email__")).sendKeys("9860034989");
		
		

	}

}
