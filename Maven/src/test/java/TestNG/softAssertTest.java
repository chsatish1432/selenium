package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class softAssertTest {
  
  @Test
  public void softassertex() 
  {
	  SoftAssert sa = new SoftAssert();
	  
	  System.out.println("**** Test case two started *****");
	  sa.assertEquals("hello", "Hello", "First soft Assert failed");
	  
	  System.out.println("hard assert success");
	  sa.assertTrue("hello".equals("hello"), "Second soft assert Passed");
	  sa.assertTrue("welcome".equals("welcome"), "Third soft assert Passed");
	  
	  System.out.println("Test case executed successfully");
	  sa.assertAll();
  }
}
