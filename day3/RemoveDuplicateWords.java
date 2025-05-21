package week2.day3;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text = "We learn Java basics as part of java sessions in java week1";
		//int count=0;
		String[] word=text.split("java");
				
		for (int i = 0; i < word.length; i++) {
			
			System.out.print(word[i]);
			}
	}
}
	

