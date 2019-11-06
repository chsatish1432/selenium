package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTestNG {
	
	public String baseURL= "http://newtours.demoaut.com/";
	String chromepath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\chromedriver.exe";
	
	//public WebDriver driver;
	
  @Test
  public void VerifyHomepageTitle() 
  {
	  System.out.println("Launching Browser");
	  System.setProperty("webdriver.chrome.driver", chromepath);
	  ChromeDriver driver = new ChromeDriver();
	  
	  driver.get(baseURL);
	  String expectedTitle = "welcome Mercury Tours123";
	  String actualTitle= driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  driver.close();
	  
  }
}
