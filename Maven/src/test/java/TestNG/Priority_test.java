package TestNG;

import org.testng.annotations.Test;

public class Priority_test {
  @Test(priority=10)
  public void Test1() {
	  System.out.println("Inside Test1");
  }
  
  @Test(priority=9)
  public void Test2() {
	  System.out.println("Inside Test2");
  }
  
  @Test(priority=8)
  public void Test3() {
	  System.out.println("Inside Test3");
  }
  
  @Test(priority=7)
  public void Test4() {
	  System.out.println("Inside Test4");
  }
  
  @Test(priority=6)
  public void Test5() {
	  System.out.println("Inside Test5");
  }
  
  @Test(priority=5)
  public void Test6() {
	  System.out.println("Inside Test6");
  }
  
  @Test(priority=4)
  public void Test7() {
	  System.out.println("Inside Test7");
  }
  
  @Test(priority=3)
  public void Test8() {
	  System.out.println("Inside Test8");
  }
  
  @Test(priority=2)
  public void Test9() {
	  System.out.println("Inside Test9");
  }
  
  @Test(priority=1)
  public void Test10() {
	  System.out.println("Inside Test10");
  }
}
