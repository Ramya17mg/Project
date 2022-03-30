package com.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverIInterfaceMethods {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://35.154.17.76/srsudupi.com");
	
		 WebElement untb= driver.findElement(By.name("uname"));
		    String tagofunTb= untb.getTagName();
		    System.out.println("Tag:"+tagofunTb);                                                              
		    System.out.println("Attribute:" +untb.getAttribute("type"));
		   WebElement heading=driver.findElement(By.xpath("//*[@id=\"uname\"]"));
		   System.out.println("text: "+ heading.getText());
		   System.out.println(untb.getSize());
		   System.out.println(untb.getCssValue("front_size"));
		   int x= untb.getLocation().getX();
		   int y= untb.getLocation().getY();
		   System.out.println(untb.getLocation());
		   System.out.println(untb.getRect().x);
		   System.out.println(untb.getRect().y);
		   /*File Src= untb.getScreenshotAs(OutputType.FILE);
		   File dest = new File("C:\\SCREENSHOT");
		   
		   Files.copy(Src,dest);*/
		    driver.close();
	}

}
