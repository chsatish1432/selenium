package TestNG;

import org.testng.annotations.Test;

public class SkippingTest {
  @Test
  public void Test1() {
	  System.out.println("Inside Test1");
  }
  
  @Test(enabled=false)
  public void Test2() {
	  System.out.println("Inside Test2");
  }
  
  @Test
  public void Test3() {
	  System.out.println("Inside Test3");
  }
  
  @Test(enabled=false)
  public void Test4() {
	  System.out.println("Inside Test4");
  }
  
  @Test
  public void Test5() {
	  System.out.println("Inside Test5");
  }
}
