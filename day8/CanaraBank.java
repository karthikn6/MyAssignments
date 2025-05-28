package week3.day8;

//Abstract class for Canarabank
public abstract class CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("cashOnDelivery -Tuesday");
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("cardPayments -DebitCard");
		
	}

	public abstract void recordPaymentDetails();
}
