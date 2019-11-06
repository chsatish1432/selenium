package TestNG;

import org.testng.annotations.Test;

public class data_provider_test2 {
  @Test(dataProvider = "dp" , dataProviderClass=data_provider_test.class)
  public void datatest(Integer age, String name) {
	  System.out.println("age is:"+age);
	  System.out.println("name is:"+name);
  }
}
