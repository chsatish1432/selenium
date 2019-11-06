package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Alert_demo {
	
	public static void main(String[] args)
	{
		
		String ffPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", ffPath);
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://demo.guru99.com/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr30127");
		driver.findElement(By.name("password")).sendKeys("EzAtAqy");
		driver.findElement(By.name("btnlogin")).submit();
		
		Alert alert=driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		alert.accept();
	}

}
