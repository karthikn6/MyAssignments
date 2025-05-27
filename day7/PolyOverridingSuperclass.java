package week3.day7;

public class PolyOverridingSuperclass {
	public void takeSnap() {
		System.out.println("Take Snap");
	}
	
	public void reportStep() {
		System.out.println("Report Step");
	}

	public static void main(String[] args) {
		PolyOverridingSuperclass sc = new PolyOverridingSuperclass();
		sc.takeSnap();
		sc.reportStep();
		
	}
}
