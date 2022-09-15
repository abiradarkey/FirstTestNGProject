package webCrawling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleScaping1  {
	public static void main(String[] args) throws InterruptedException {
		String strXpath;
		
		List <WebElement> searchPageResults;
		List <WebElement> allLinkText = new ArrayList<>();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	for(int i=1; i<=5; i++) {
		
		if(i>1) {
	 strXpath = "//a[@class='fl' and text()='"+i+"']";
	 driver.findElement(By.xpath(strXpath)).click();
	 Thread.sleep(2000);
	 
		}
		
		searchPageResults = driver.findElements(By.xpath("//div[@class='rc']/h3/a"));
		for (WebElement link : searchPageResults) {
			//allLinkText.add(link.getText());
			
			allLinkText.
			}
	}
	
	
	}

}
