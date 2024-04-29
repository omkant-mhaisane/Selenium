package Day_6_18_04_24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandeling {

	public static void main(String[] args) {
		/*
		 * 1. get all rows
		 * 2. get all columns
		 * 3. iterate rows & column and get the text
		 * 
		 * */
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.asx.com.au/");
	
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	driver.findElement(By.xpath("//h5[@role = 'tab'][2]")).click();
	List <WebElement> rows = driver.findElements(By.xpath("//div[@class = 'col-xs-12 col-sm-6 col-md-4][1]/table/tr"));
	int row = rows.size();
	System.out.println("Total no. of rows: "+rows);
	
	List <WebElement> cols = driver.findElements(By.xpath("//div[@class = 'col-xs-12 col-sm-6 col-md-4][1]/table/tr[1]/th"));
	int col = cols.size();
	System.out.println("Tota no. of coloums: "+cols);
	
	for (int r = 1; r<= row; r++) {
		for(int c = 1; c<= col; c++) {
		 driver.findElement(By.xpath("//div[@class = 'col-xs-12 col-sm-6 col-md-4'][1]/table/tr["+r+"]/th["+c+"]")).getText();
		 System.out.println();
		}
	}
		
	}

}
