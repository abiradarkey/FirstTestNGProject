import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class launchbrowser {
	public String baseUrl = "https://www.google.com/";
    String driverPath = "C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 
     
     @BeforeTest
      public void launchBrowser() throws Exception {
          System.out.println("launching chrome browser"); 
          System.setProperty("webdriver.chrome.driver",driverPath);
          driver = new ChromeDriver();
          driver.get("https://qa.platform.xbotapps.com/");
          
          Thread.sleep(3000);
      }
      @Test
      public void verifyHomepageTitle() {
    	  
    	  String expectedTitle = "Cerina Studio";
    	  String title = driver.getTitle();
    	  
    	  Assert.assertEquals(title, expectedTitle);
//          String expectedTitle = "Welcome";
//          String actualTitle = driver.getTitle();
//          Assert.assertEquals(actualTitle, expectedTitle);
    	  System.out.println(title);
    	  System.out.println(expectedTitle);
    	  
    	  
     }
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}
