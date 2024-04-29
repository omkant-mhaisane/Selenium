package Day_1_10_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passing_URL {

	public static void main(String[] args) {
		//in seliium 3.0 we use this following property to open the browser
//		System.setProperty();
		// TODO Auto-generated method stub
      WebDriver driver =new ChromeDriver();
      // for maximizing the window of browser
      
      driver.manage().window().maximize();
      //for passing the URL
      driver.get("https://www.facebook.com/");
      
      //close the driver
//      driver.close();
      // there are 8 type of locator are as follows that have attribute and values also
      /*
       * id: Unique identifier
class: Styling class
src: Source URL
href: Hyperlink reference
alt: Alternate text
title: Tooltip title
disabled: Disable element
placeholder: Input placeholder
       * 
       * */
      // where driver is object
      //findElement is for find element by id
     // send keys is used for sending data to that field
      driver.findElement(By.id("email")).sendKeys("1223344556");
	  driver.findElement(By.name("pass")).sendKeys("abc@gmail.com");
	  driver.findElement(By.name("login")).click();//click is used for press button
	}

}
