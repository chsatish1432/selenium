package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class data_provider_test {
	
  @Test(dataProvider = "dp")
  public void dataInfo(Integer age, String name) {
	  System.out.println("age is:"+age);
	  System.out.println("name is:"+name);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 24, "a" },
      new Object[] { 25, "b" },
      new Object[] { 26, "c" },
    };
  }
}
