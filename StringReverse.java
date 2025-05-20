package week2.day1;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Karthikeyan";
		
		char[] ch= name.toCharArray();
		for (int i = ch.length-1 ; i >=0 ; i--) {
			System.out.print(ch[i]);
			
		}
	}

}
