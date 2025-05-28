package week3.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num  = {3, 2, 11, 4, 6, 7};
		
		List<Integer> SortList = new ArrayList<Integer>();
		for(int i: num) {
			SortList.add(i);
		}
		System.out.println("List of number: "+SortList);
		
		Collections.sort(SortList);
		System.out.println("Sorted List: "+SortList);
        
		int largestNumber = SortList.get(SortList.size()-2);
        System.out.println("Second lagest number: "+largestNumber);
	}

}
