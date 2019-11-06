package selenium_3_package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class wait_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new browser_methods().getDriver("chrome");
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstName")).sendKeys("satish");
		//OR
		//WebElement fstname=driver.findElement(By.name("firstName"));
		//fstname.sendKeys("satish");
		//fstname.clear();
		
		driver.findElement(By.name("lastName")).sendKeys("chintalapudi");
		driver.findElement(By.name("phone")).sendKeys("9849162888");
		driver.findElement(By.id("userName")).sendKeys("satishkumar.chintalapudi@gmail.com");
		
		WebElement dropdown=driver.findElement(By.name("country"));
		Select select1=new Select(dropdown);
		select1.selectByVisibleText("INDIA");
		//OR
		//Select select=new Select(driver.findElement(By.name("country")));
		//select.selectByVisibleText("INDIA");
		//select.selectByIndex(index);
		
		driver.findElement(By.id("email")).sendKeys("chsatish");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("confirmPassword")).sendKeys("admin");
		
	
		driver.findElement(By.name("register")).click();

	}

}
