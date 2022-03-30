package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowerfirefox {
	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
       //driver.get("https://www.google.com/");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://35.154.17.76/srsudupi.com/");
		driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@school");
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/form/div/div[3]/button")).click();
	    driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/ul/li[6]/a/p")).click();
        Thread.sleep(2000);
        driver.close();
              
	}

	}



