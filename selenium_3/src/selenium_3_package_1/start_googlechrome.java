package selenium_3_package_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class start_googlechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gcPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", gcPath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

}
