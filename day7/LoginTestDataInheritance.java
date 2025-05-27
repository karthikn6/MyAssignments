package week3.day7;

public class LoginTestDataInheritance extends TestDataInheritance {
   
	public void  enterUsername() {
		System.out.println("Enter Username");
	}
	public void enterPassword() {
		System.out.println("Enter password");
	}
public static void main(String[] args) {
	LoginTestDataInheritance ld = new LoginTestDataInheritance();
	ld.enterUsername();
	ld.enterPassword();
	ld.enterCredentials();
	ld.navigateToHomePage();
	
}
}
