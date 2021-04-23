package swa.practo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindDoctorsNow extends BaseClass{
	@Test
	 public void clickOnFindDoctorsNOw()
	 {
		 driver.get("https://www.practo.com/");
		 driver.findElement(By.xpath("//*[@id='root']/div/div/div[4]/div/div/div/div/div[1]/div/div/a/span/img")).click();
	 }

}
