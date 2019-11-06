package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependstest {
	
	public String baseURL= "http://newtours.demoaut.com/";
	String chromepath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", chromepath);
	  driver = new ChromeDriver();
	  driver.get(baseURL);
	  System.out.println("INSIDE BROWSER");
	  }
  
  @Test(dependsOnMethods= {"launchBrowser"})
  public void verifyHomeTitle() {
	  	String expectedTitle="Google";
	  	String actualTitle= driver.getTitle();
	  	
	  	System.out.println("Inside Verify Home title test");
	  	
	  	Assert.assertEquals(actualTitle, expectedTitle);
	  	System.out.println("After Assert: True");
	  } 
  
  @Test(dependsOnMethods= {"verifyHomeTitle"},alwaysRun=true)
  public void terminateBrowser()
  {
	  System.out.println("Inside Terminate Browser");
	  driver.quit();
  }
}
