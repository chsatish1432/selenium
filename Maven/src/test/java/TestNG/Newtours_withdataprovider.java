package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Newtours_withdataprovider {
  @Test(dataProvider = "dp")
  public void registeruser(String usname, String pwd, String cnfpwd) {
	  
	  String gcPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", gcPath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.id("email")).sendKeys("usname");
		driver.findElement(By.name("password")).sendKeys("pwd");
		driver.findElement(By.name("confirmPassword")).sendKeys("cnfpwd");
		
		driver.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"satish", "abc", "abc"},
      new Object[] {"nagesh", "def", "def" },
      new Object[] {"murthy", "ghi", "ghi" },
    };
  }
}
