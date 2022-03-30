package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://accounts.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		String url= driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getPageSource());
		String googleTitle=driver.getTitle();
		if(googleTitle.equals("Google")) {
			System.out.println("google page is displaying");
		}
			else
				System.out.println("google page is not displaying");
		
		
		driver.close();
	}

}
