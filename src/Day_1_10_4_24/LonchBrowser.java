package Day_1_10_4_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LonchBrowser {
 public static void main(String[] args) {
	 //instansiating the chrome driver for runing script on chromedriver
	 //We can open edge driver also (EdgeBrowser)
	 WebDriver driver = new ChromeDriver();
//	 WebDriver d = new EdgeDriver();
	 //Firefor also
	 WebDriver f = new FirefoxDriver();
     // where web driver is an interface so we cant create a object but we can create instance of web driver and call all methoda of that driver
	 /*WebDriver s an interface
	  * driver is a instance of WebDriver
	  * Where ChromeDriver is a child class of web driver that is predefine
	  * 
	  * */
	 
	 
 }
}
