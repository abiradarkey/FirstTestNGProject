package com.suite1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel {

	public WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Thread Number Is " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

       @Test
 	public void ChromeTestMethod()
 	{ 

	  //Initialize the chrome driver
	 System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
	 //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	 driver.get("http://www.google.co.in");
	  //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
 
      }
 
     @AfterTest
     public void afterTest() {
	 System.out.println("After Test Thread Number Is " + Thread.currentThread().getId());
	 //driver.close();
    }
 }