package test;
import java.security.Key;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.SendKeysAction;
import page.GoogleSearch;

public class GoogleSearchtest {
	static  WebDriver driver=null;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\Egenius_Test\\drivers\\geckodriver\\geckodriver.exe");
	    driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		GoogleSearch.textbox_Search(driver).sendKeys("Automation step by step");
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		GoogleSearch.button_search(driver).sendKeys(Keys.RETURN);
		
		
		driver.close();
		System.out.println("Testing is Completed ");
		
		
		
	}

	
}
