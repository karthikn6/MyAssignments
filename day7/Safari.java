package week3.day7;

public class Safari extends Chrome {
	
	public void readMode() {
		System.out.println("Reader mode");
	}

	public void fullScreenMode() {
		System.out.println("Full sceen mode");
	}
	
	public static void main(String[] args) {
		Safari bA3 = new Safari();
		bA3.readMode();
		bA3.fullScreenMode();
		System.out.println(bA3.bN);
		System.out.println(bA3.bV);
		bA3.closeBrowser();
		
		
	}
}
