package swa.practo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
    
 @Test
 public void demo()
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Documents\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.practo.com/");
	 
 }
}
