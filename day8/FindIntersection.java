package week3.day8;

public class FindIntersection {
	
	public static void main(String[] args) {
		
	
	int Array1[] =  {3, 2, 11, 4, 6, 7};
	int Array2[] =  {1, 2, 8, 4, 9, 7};
	
	for(int i=0; i <= Array2.length; i++) {
		for (int j = 0; j < Array2.length; j++) {
			if(Array1[i] == Array2[j]) 
				System.out.println("The intersection numbers: "+Array1[j]);
		}
	}
	

	}
}
