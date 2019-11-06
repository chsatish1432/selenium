package Windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class windowsTest {
	
	public WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ffPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", ffPath);
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//a[contains(text(),'Click Here')]")).click();
		
		String Mainwindow=driver.getWindowHandle();
		
		System.out.println("Main window unique no"+Mainwindow);
		
		Set<String> s1=driver.getWindowHandles();
		
		for (String string : s1)
		{
			String ChildWindow=string;
			System.out.println("Child window unique no"+ChildWindow);
			driver.switchTo().window(ChildWindow);
			
		}
		
		driver.findElement(By.name("emailid")).sendKeys("abc@a.com");
		driver.findElement(By.name("btblogin")).submit();
		
		driver.switchTo().window("Mainwindow");

	}

}
