package com.suite1;

import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;

public class priorityupdown  {
	public String baseUrl = "https://www.google.com/";
	
	String driverPath = "D:\\driver\\chromedriver.exe";
	
	WebDriver driver;

	
     
	@Test (priority=2)
	
	 public void openBrowser() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	        driver = new ChromeDriver();
}
	@Test (priority=3)
	
	 public void launchGoogle()throws InterruptedException {				
	        driver.get("http://www.google.co.in");	 
	 }
	@Test (priority=4)
	
	 public void peformSeachAndClick1stLink()throws InterruptedException {				
	        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Facebook");
	 }
	@Test (priority=1)
	
	 public void FaceBookPageTitleVerification() throws InterruptedException {	
        Thread.sleep(3000);	        
	        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	      
	        Thread.sleep(3000);	        
	        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);
	 }
}
	