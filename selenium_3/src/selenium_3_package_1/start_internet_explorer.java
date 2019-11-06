package selenium_3_package_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class start_internet_explorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String iePath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", iePath);
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com/");
	}

}
