package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class framesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ffPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", ffPath);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077a5e");
		driver.findElement(By.xpath("html/body/a/img")).click();
	}

}
