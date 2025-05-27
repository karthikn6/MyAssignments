package week3.day7;

public class PolyOverridingSubclass extends PolyOverridingSuperclass {
	public void takeSnap() {
		System.out.println("Take Snap subcls");
		super.takeSnap();
	}
public static void main(String[] args) {
	PolyOverridingSubclass subc = new PolyOverridingSubclass();
	subc.takeSnap();
}
}
