package Day_5_17_4_24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println("Total number of Links: "+count);
		
		for (int i =0; i<count; i++) {
			System.out.println(allLinks.get(i).getText());
		// Difference between findElement and findElements Methods
		//findElement is used to locate single elements
		 //written type is WebElement
			// if element is not located It well through "no such element exception"
			
			
			//findElements is used to locate multiple elements
		    // written type is List<WebElement>
			//If element is not located It well through emty list
		
			
		//Difference between close and quite
		//Difference between get() and nevigateTo();
			
	
			
			
			
		
		}
	}

}
