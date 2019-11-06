package selenium_3_package_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browser_methods 
{

	public WebDriver getDriver(String browserName)
	{
		// TODO Auto-generated method stub
		
		if(browserName.equals("chrome"))
		{
		String gcPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", gcPath);
		return new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
		String ffPath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", ffPath);
		return new FirefoxDriver();
		}
		
		else if(browserName.equals("ie"))
		{
		String iePath="C:\\Users\\training_b6b.01.03\\Desktop\\jars\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", iePath);
		return new InternetExplorerDriver();
		}
		return null;
	}
}
