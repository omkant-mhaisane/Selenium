package Day_7_19_04_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_2 {
	WebDriver driver;
    @BeforeSuite
    public void openBrowser() {
	System.out.println("Browser is open");
	driver = new ChromeDriver();
    
	
    }

    @AfterSuite
    public void closeBrowser() {
    System.out.println("Browser is open");
	driver.close();
	
    
    }
    @Test(priority=2)
    public void enterUrl() {
     System.out.println("URL is entered");
	 driver.get("https://www.facebook.com/");
	 
     }
    @Test(priority=1)
    public void enterUrl2() {
     System.out.println("URL is entered");
	 driver.get("https://www.google.com/");
	 
     }



}
