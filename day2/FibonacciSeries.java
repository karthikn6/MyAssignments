package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 8;
		int a = 0;
		int b = 1;
		
	    for (int i = 0; i < num; i++) {
	   	System.out.println(a);
		    int c= a+b;
		    a=b;
		    b=c;
		    
		    
	    }
	 }
	
}