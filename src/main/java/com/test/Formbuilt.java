package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Formbuilt {


		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://laravel.egenius.in/");
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/button/span[1]")).click();
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/div/div/div/div[2]/button/span[1]")).click();
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div/div/div/div[2]/button/span[1]")).click();
	        
			// driver.quit();


	}

}
