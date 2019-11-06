package TestNG_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class start_googlechrome {
	
	@Test
	public void googlechrome() {
		// TODO Auto-generated method stub
		
		String gcPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", gcPath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

}
