import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithoutPriority {
	WebDriver driver;
     
	@Test
	 public void openBrowser() {				
	        driver = new ChromeDriver();
}
	@Test
	 public void launchGoogle() {				
	        driver.get("http://www.google.co.in");	 
	 }
	@Test
	 public void peformSeachAndClick1stLink() {				
	        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
	 }
	@Test
	 public void FaceBookPageTitleVerification() throws Exception {				
	        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
	        Thread.sleep(3000);		
	        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);
	 }
}