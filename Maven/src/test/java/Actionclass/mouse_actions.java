package Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_actions {

	public static void main(String[] args) throws InterruptedException{
				// TODO Auto-generated method stub
		
				String ffPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", ffPath);
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demowebshop.tricentis.com/");
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				Actions actions=new Actions(driver);
				
				Thread.sleep(3000);
				
				actions.moveToElement(driver.findElement(By.xpath("//a@[href='/electronics']"))).perform();
				Thread.sleep(3000);
				actions.moveToElement(driver.findElement(By.xpath("//a@[href='/camera-photo']"))).click().build().perform();


	}

}
