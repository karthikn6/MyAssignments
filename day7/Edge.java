package week3.day7;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("Snap taken");
	}
	
	public void clearCookies() {
		System.out.println("Cookies cleared");
	}
	public static void main(String[] args) {
		
		Edge bA2 = new Edge();
		bA2.takeSnap();
		bA2.clearCookies();
		bA2.closeBrowser();
		bA2.navigateBack();
		System.out.println(bA2.bV);
			
	}
	
}
