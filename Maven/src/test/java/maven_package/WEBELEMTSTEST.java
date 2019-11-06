package maven_package;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WEBELEMTSTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseURL= "http://google.com/";
		String chromepath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get(baseURL);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Google"));
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links"+linkList.size());
		
		for (WebElement link: linkList) {
			System.out.println(link.getText()+":-"+link.getAttribute("href"));
		}

	}

}
