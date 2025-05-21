package week2.day3;

import java.util.Iterator;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "I am a software tester";
        String[] word = input.split("");

		for (int i = 0; i < word.length; i++) {
				
		if(i%2!=0) 
		 {
			char[] charArray= word[i].toCharArray();
			for (int j = charArray.length-1; j >= 0; j--) {
			
				System.out.print(""+charArray[j]);
			}
		       System.out.print("");
		}
		else {
			System.out.print(word[i]+ "");
		}
		}
		
}}
