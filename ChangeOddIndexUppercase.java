package week2.day1;

public class ChangeOddIndexUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "changeme";
		char[] chr = text.toCharArray();
		
		for (int i = 0; i < chr.length; i++) {
		
			if(i%2 != 0) {
				chr[i]=Character.toUpperCase(chr[i]);
				System.out.print(chr[i]);
			
			}
				
		}
		
	}

}
