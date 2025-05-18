package week1.day2;

public class Browser {

			public String LaunchBrowser(String browserName) {
			System.out.println("Browser Launched Successfully");
			return "Browser is: " +browserName;
			
		} public void loadUrl() {
			System.out.println("Application URL loaded successfully");
		
	}

		public static void main(String[] args) {
			Browser br=new Browser();
			System.out.println(br.LaunchBrowser("Chrome"));
		    br.loadUrl();				
		}
}
