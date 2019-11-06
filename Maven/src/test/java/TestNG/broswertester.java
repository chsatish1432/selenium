package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class broswertester {
	
	public WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeClass
	public void browsermethod(String browser1) {
		// TODO Auto-generated method stub
		
		//new browser_methods();
		//WebDriver driver=browser_methods.getDriver("chrome");
		
		driver = new browser_methods().getDriver(browser1);
	}
	
	
	  @Test(dataProvider = "dp" , dataProviderClass=Newtours_withdataprovider.class)
	  public void registeruser(String usname, String pwd, String cnfpwd) {
		    
			driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.linkText("REGISTER")).click();
			
			driver.findElement(By.id("email")).sendKeys("usname");
			driver.findElement(By.name("password")).sendKeys("pwd");
			driver.findElement(By.name("confirmPassword")).sendKeys("cnfpwd");
	  }
	  
	  

}
