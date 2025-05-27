package week3.day7;

public class WebElement {
	public void click() {
		System.out.println("Button is selected");
	}
	public void setText(String text) {
		System.out.println("Input text: "+text);
	}
public static void main(String[] args) {
	WebElement we = new WebElement();
	we.click();
	we.setText("Testing text");
	
}
}
