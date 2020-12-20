package testngconcepts;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TC004_DataProvider {
	
	@Test(dataProvider ="getdata" )
	public void login(String username,String pwd)
	{
		System.out.println("username is"+username);
		System.out.println("password is "+pwd);
	
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object details[][] = new Object[3][2];
		details[0][0]="sai";
		details[0][1] ="test123";
		details[1][0]="anu";
		details[1][1] ="test234";
		details[2][0] ="jai";
		details[2][1] ="test456";
		return details;
		
		
}
}