package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://35.154.17.76/srsudupi.com/");
		String loginTitle = driver.getTitle();
		if(loginTitle.equals("SRS SCHOOL UDUPI"))
		{
		System.out.println("login page is displayed test step passed");
		}
		else
		{
			System.out.println("login page is not  displayed test step false");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@school");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/form/div/div[3]/button")).click();
	    Thread.sleep(2000);
	   // driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/ul/li[6]/a/p")).click();
	   //Thread.sleep(1000)
		driver.quit();
	
		
	}

}