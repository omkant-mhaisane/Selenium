package Day_5_17_4_24;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {

	public static void main(String[] args) throws InterruptedException {
		// for scrolling it need java script exicuter interface.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		// for scroll up the page
		js.executeScript("window.scrollBy(0, 350)", "");
		// where 0 and 250 is y axis cordinates
        // we can use -ve co-ordinates for scroll up or just we can use only scroll by methods
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -350)", "");
		
		 
	}

}
