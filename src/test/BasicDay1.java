package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicDay1 {
  @AfterTest
  public void lastexecution()
  {
	System.out.println("It will execute at the end");  
  }
	
	@Test
	public void Demo() 
  	{
	  System.out.println("Hello");	
	  Assert.assertTrue(false);
	}
	@AfterSuite
	public void Afsuite() 
  	{
	  System.out.println("It will be last");	
	}
	
  @Test
  public void secondTest()
  {
	  System.out.println("Bye");
  }
}
