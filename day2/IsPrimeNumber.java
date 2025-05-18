package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 13;
		int count=0;
		
		for (int i = 1; i <=num; i++) {
			if (num%i==0) { 
				count++;					
			}
		}  
		
		if(count==2) {
		
		System.out.println(num +" is Prime number");
		}else {
		
		System.out.println(num +" is Not a Prime number");
		
		}
	}
}
