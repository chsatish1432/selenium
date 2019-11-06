package actionstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardactions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ffPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ffPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://cleartrip.com/");
	}

}
