package elementCommun;

public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 5, 8, 3, 4, 98, 26, 7, 45 ,14};

		int[] array2 = { 45, 14, 75, 31, 10, 8,};

		System.out.println("Array 1 " + array1.toString());
		System.out.println("Array2 " + array2.toString());

		
		  for (int i = 0; i < array1.length; i++) {
		  
		  System.out.println("--------------------first line");
		for (int j = 0; j < array2.length; j++) {
			
			if (array1[i]==array2[j]) {
				
				System.out.println("using for array1");
				System.out.println("Common element is : "+array1[i]);
				System.out.println("   ");
				System.out.println("using array2");
				System.out.println("Common element is : "+array2[j]);
				
			}
			
		}
		  
		  }
		
		
	}
	
}
