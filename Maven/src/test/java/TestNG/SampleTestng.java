package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SampleTestng {
	
	public WebDriver driver;
	
  @BeforeClass
  public void Open_Browser()
  {
		WebDriver driver = new browser_methods().getDriver("chrome");
		driver.get("http://newtours.demoaut.com/");
		System.out.println("Inside beforeclass");
  }
  
  @AfterClass
  public void close_Browser()
  {
	System.out.println("Inside afterclass");
	driver.close();
  }
  
  @BeforeMethod
  public void Redirect_Homepage()
  {
	  driver.findElement(By.linkText("Home")).click();
	  System.out.println("Inside beforemethod");
  }
  
  @AfterMethod
  public void signon()
  {
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  System.out.println("Inside aftermethod");
  }
  
  @Test
  public void Validate_Register()
  {
	  driver.findElement(By.linkText("REGISTER")).click();
	  System.out.println("Inside Test1");
  }
  
  @Test
  public void Validate_Support()
  {
	  driver.findElement(By.linkText("SUPPORT")).click();
	  System.out.println("Inside Test2");
  }
  
  @Test
  public void Validate_Contact()
  {
	  driver.findElement(By.linkText("CONTACT")).click();
	  System.out.println("Inside Test3");
  }
}
