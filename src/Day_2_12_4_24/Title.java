package Day_2_12_4_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		/*Barcode, OTP, and captcha we cannot test it by automation testing
		 * 
		 * */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		 System.out.println(actualTitle);
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test case is pass");
			
		}
		else {
			System.out.println("Test case is fail");
		}
		driver.close();
	}

}
