package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementInterfaceMethhods
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://35.154.17.76/srsudupi.com");
	    WebElement untb= driver.findElement(By.name("uname"));
	    String tagofunTb= untb.getTagName();
	    System.out.println("Tag:"+tagofunTb);
	    System.out.println("Attribute:" +untb.getAttribute("type"));
	   WebElement heading=driver.findElement(By.xpath("//*[@id=\'uname\']"));
	   System.out.println("text: "+ heading.getText());
	   driver.close();

		
}
}