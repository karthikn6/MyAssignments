package week3.day7;

public class Browser {

	String bN = "Chrome";
	int bV =  136 ;
	
	public void openUrl() {
		System.out.println("Open URL"+"\n"+"BrowserName: "+bN+"BrowserVrsion:" +bV);
	}
	 public void closeBrowser() {
		 System.out.println("Close main Browser");
	}
	 
	 public void navigateBack() {
		 System.out.println("Navigate back from main browser");
	 }
	 
	 public static void main(String[] args) {
		Browser bA = new Browser();
		bA.closeBrowser();
		bA.openUrl();
		bA.navigateBack();
		System.out.println(bA.bN);
		System.out.println(bA.bV);
				
	}
}
