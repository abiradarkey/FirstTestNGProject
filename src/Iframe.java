import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\abiradar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.platform.xbotapps.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("input")).sendKeys("abiradar@keypoint-tech.com");

		driver.findElement(By.name("signInPassword")).sendKeys("devi");

		driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/form/div/button")).click();
		System.out.println("logged in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]")).click();

		driver.findElement(By.name("bot-name")).sendKeys("helloji");

		driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Automation testing");

		driver.findElement(By.name("button")).click();
		driver.findElement(By.name("button")).click();

		System.out.println("Bot Created");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'picture_in_picture_alt')]")).click();
		Thread.sleep(3000);
		ArrayList Al = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) Al.get(1));
		Thread.sleep(5000);
//		driver.findElement(By.id("flox-text-item")).click();
//		driver.switchTo().frame("flox-chat-iframe");
//		driver.findElement(By.name("userInputQuery")).sendKeys("hi");
//		driver.findElement(By.id("//*[@id=\"send-svg-icon\"]")).click();

		
		

		
		
		
		
	}
	

}
