package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageInstituteNameTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://35.154.17.76/ams.oxfordinstitutions.org/");
		String instituteName = driver.findElement(By.xpath("//p")).getText();
		System.out.println("THis is institute name--->"+instituteName);
		driver.quit();
	}

}
