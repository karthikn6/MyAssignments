package week3.day7;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Incognito mode");
	}
	
	public void clearCache() {
		System.out.println("Clear cache");
	}
	
public static void main(String[] args) {
	
	Chrome bA1 = new Chrome();
	bA1.openIncognito();
	bA1.clearCache();
	bA1.openUrl();
	System.out.println(bA1.bN);
	
}
}
