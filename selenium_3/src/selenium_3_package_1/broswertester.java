package selenium_3_package_1;

import org.openqa.selenium.WebDriver;

public class broswertester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new browser_methods();
		//WebDriver driver=browser_methods.getDriver("chrome");
		
		WebDriver driver = new browser_methods().getDriver("chrome");
		driver.get("http://newtours.demoaut.com/");

	}

}
