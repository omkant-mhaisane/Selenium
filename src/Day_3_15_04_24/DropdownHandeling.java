package Day_3_15_04_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandeling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		//selecting a day from dropdrown
		WebElement day = driver.findElement(By.id("day"));
		Select sc = new Select(day);
		sc.selectByIndex(24);// we need to provide indx position
		//sc.selectByValue("20");// we need to pass exact value
		//sc.selectByVisibleText("Jul");// for month that is visiable
		Thread.sleep(2000);
	
	    WebElement month = driver.findElement(By.id("month"));
	    Select scm = new Select(month);
	    scm.selectByIndex(10);
	    Thread.sleep(2000);
	    
	    WebElement year = driver.findElement(By.id("year"));
	    Select scy = new Select(year);
	    scy.selectByValue("2022");
	  
	}

}
