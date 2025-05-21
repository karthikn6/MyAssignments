package week2.day3;
// using array
public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] value = {2, 5, 7, 7, 5, 9, 2, 3};
		
		for (int i = 0; i < value.length; i++) {
			
		for (int j = i+1; j < value.length; j++) {
			
			if(value[i]==value[j]) {
				System.out.println("Duplicate value: "+value[j]);
			}

			
		}
		}
	}

}
