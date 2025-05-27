package week3.day7;

public class TestDataInheritance {
	//Inheritance methos
	public void enterCredentials() {
		System.out.println("Enter the credentials");
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigate to Homepage");
	}
public static void main(String[] args) {
	TestDataInheritance td = new TestDataInheritance();
	td.enterCredentials();
	td.navigateToHomePage();
 }
}
