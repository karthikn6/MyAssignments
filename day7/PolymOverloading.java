package week3.day7;

public class PolymOverloading {
	
	public void reportSend(String Message, String Status) {
		System.out.println("Message: "+Message + "\n"+ "Status: "+Status);
	}
   public void reportSend(String Message, String Status, boolean snap) {
	
	System.out.println("Message: "+Message+ "\n" + "Status: "+Status);

	if(snap)
	{ 
		System.out.println("Snap taken");
	} else {
		System.out.println("No snap taken");
	}
	
}
  public static void main(String[] args) {
	PolymOverloading ol = new PolymOverloading();
	ol.reportSend("Message1", "Success");
	ol.reportSend("Message2", "Success", true);
 }
 	
}

