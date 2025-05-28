package week3.day8;

public class Amazon extends CanaraBank {
	
	public static void main(String[] args) {
		
		Amazon am = new Amazon();
		am.cardPayments();
		am.cashOnDelivery();
		am.recordPaymentDetails();
		
	}
	
	@Override
	public void recordPaymentDetails() {
		System.out.println("Amazon record payment");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
	}
	

}
