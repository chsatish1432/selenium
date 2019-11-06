package selenium_3_package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Locators_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new browser_methods().getDriver("chrome");
		driver.get("http://seleniumhq.org/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Download")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		driver.navigate().to("http://google.com");
		driver.navigate().refresh();
		String text=driver.getTitle();
		System.out.println(text);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
	}

}
