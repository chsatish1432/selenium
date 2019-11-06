package TestNG_groups;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class sampleTest1 {
  @Test(groups= {"car"})
  public void Test1() {
	  System.out.println("Inside Test1");
  }
  
  @Test(groups= {"bike"})
  public void Test2() {
	  System.out.println("Inside Test2");
  }
  
  @Test(groups= {"car"})
  public void Test3() {
	  System.out.println("Inside Test3");
  }
  
  @Test(groups= {"bike"})
  public void Test4() {
	  System.out.println("Inside Test4");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside after suite");
  }

}
