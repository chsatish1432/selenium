package TestNG_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class start_firefox {
	
	@Test
	public void firefox() {
		// TODO Auto-generated method stub
		
		String ffPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", ffPath);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}

}
