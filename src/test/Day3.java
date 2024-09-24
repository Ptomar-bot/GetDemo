package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void BfClass()
	{
		System.out.println("It will execute before the class");
	}
	@Parameters({"URL", "APIkey/Username"})
	@Test
	public void WebLoginCarLoan(String urlname, String key)
	{
		System.out.println("WebLoginCar");
		System.out.println(urlname);
		System.out.println(key);

	}
	
	@BeforeMethod
	public void berforeevery()
	{
		System.out.println("I will excexute before every test method in day 3 class");
	}
	@AfterClass
	public void Afterevery()
	{
		System.out.println("I will excexute after every test class in day 3 class");
	}
	@BeforeSuite
	public void BfSuite()
	{
	System.out.println("This will execute at the top");
	
	}
	@Test(groups= {"Smoke"})
	public void MobileSignInCarLoan()
	{
		System.out.println("Mobile signin");
		
	
	}
	@Test(enabled=false)   //it will skip the test case
	public void MobileLogoutCarLoan()
	{
		System.out.println("Mobile logout");
	
	}
	@Test(dataProvider="getdata")
	public void MobileLoginCarLoan(String username, String password)
	{
		System.out.println("Mobile Login");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(dependsOnMethods={"WebLoginCarLoan", "MobileLoginCarLoan"})
	public void ApiCarLoan()
	{
		System.out.println("ApiCar");
	}
	@DataProvider
	public Object[][] getdata()
	{
		//1st combination- username password- good credit hostory-rows
		//2nd- username password-no credit hostory
		//3rd- fraud credit history
		Object[][] data=new Object[3][2];  //multi dimension array //3 rows and 2 column
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination-rows
		
		//2nd set
		data[1][0]="secondtsetusername";
		data[1][1]="seocndpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	
	
	}

}
