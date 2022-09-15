package com.suite1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleSession { 
	
	@Test
	public void executeSessionOne() {
		//First session of WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Youtube 1");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://qa.platform.xbotapps.com/");
		//driver.findElement(By.id("input")).sendKeys("abiradar@keypoint-tech.com");	
		WebDriver driver11 = new ChromeDriver();
		driver11.get("https://www.google.co.in/");
		driver11.findElement(By.xpath("//input[@title='Search']")).sendKeys("Youtube 3");
	}

}
