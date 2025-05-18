package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// rem=(rem*10)+1234%10 -> rem=4
		// rem=(0*10)+1234%10 ->123.4, remainder=4
		// no=no/10->123 do the cycle till 0
		
		int input = 121;
		// int input = 1221;
		int output= 0;	
		int rem= 0;
		
		for(int i=input;i>10;i/=10)
		{
			rem=(i%10);
			output = output * 10+rem;
		}
		if(input==output)
		{
			System.out.println("The number is Palindrome");
		} 
		else {
			System.out.println("The number is not palindrom");
		}
	}
}