package week1.day1;

import week1.day2.Browser;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser br=new Browser();
		String br2=br.LaunchBrowser("Edge");
		System.out.println("Edge Browser"+ br2);
		br.loadUrl();
	}

}
