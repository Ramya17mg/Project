package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.GoogleSearchpageobjective;

public class GoogleSearchpageTest {
  static WebDriver driver= null;
	public static void main(String[] args) {
		googleSearchtest();
	}
	public static void googleSearchtest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		GoogleSearchpageobjective searchPageobj = new GoogleSearchpageobjective(driver);
		
		
		driver.get("http//google.com");
		searchPageobj.setTextInSearchBox("Automation");
		searchPageobj.clickSearchButton();
		 
		
		
		

	}

}
