package com.test;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import org.testng.Assert;

public class LoginAutomation {
	
		public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "path of driver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		WebElement username=driver.findElement(By.id("user_email_Login"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement login=driver.findElement(By.name("commit"));
		username.sendKeys("abc@gmail.com");
		password.sendKeys("your_password");
		login.click();
		String actualUrl="https://live.browserstack.com/dashboard";
		String expectedUrl= driver.getCurrentUrl();
		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		//Asserts.assertEquals(expectedUrl,actualUrl);
		}
		}
	


