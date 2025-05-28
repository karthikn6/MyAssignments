package week3.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] value = {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> ListNum = new ArrayList<Integer>();
		for(int i:value) {
			 ListNum.add(i);
	}
		System.out.println("Given list of number: "+ListNum);
		Collections.sort(ListNum);
		
		for (int i = 1; i < ListNum.get(ListNum.size()-1); i++) {
		if(!ListNum.contains(i)) {
		System.out.println("Missing Elements is: "+(+i));;
		
		 }
	 }
	
	}}
