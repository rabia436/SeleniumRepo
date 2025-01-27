package assignments.week3;

public class LoginTestData extends TestData {
	public void enterUsername()
	{
		
		System.out.println("Enter username");
	}
	public void enterPassword()
	{
		System.out.println("Enter password");
	}
	public static void main(String[] args) 
	{
		LoginTestData test=new LoginTestData();
		test.enterCredentials();
		test.enterPassword();
		test.enterUsername();
		test.navigateToHomePage();
		
		
	}
	
	
	

}
