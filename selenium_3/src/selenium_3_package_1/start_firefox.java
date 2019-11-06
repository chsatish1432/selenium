package selenium_3_package_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class start_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ffPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", ffPath);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}

}
