package page;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	
	private static WebElement element =null; 
	
		public static WebElement textbox_Search (WebDriver driver)
		{
			element =driver.findElement(By.name("q"));
			return element;
		}
	
		public static WebElement button_search(WebDriver driver)
		{
				element =driver.findElement(By.xpath("//input[@name='btnK']"));
				return element;
	        }

}
