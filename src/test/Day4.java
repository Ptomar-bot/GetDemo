package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String urlname)
	{
		System.out.println("WebLoginHomePersonalLoan");
		System.out.println(urlname);
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
	
	}

	@Test
	public void LoginApiHomeLoan()
	{
		System.out.println("LoginApiHome");
		
	}
}
