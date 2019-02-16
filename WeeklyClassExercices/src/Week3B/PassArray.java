// Fig. 7.13: PassArray.java
// Passing arrays and individual array elements to methods.

package Week3B;

public class PassArray {
	
	/*public static void main (String[] args) {
				int[] array = {1, 2, 3, 4, 5 } ; 
		
	System.out.print( 
			"Effects of passing reference to entire array:%n" +
	         "The values of the original array are:%n");
	
	
	// to output original value
	
	for(int value: array) {
		System.out.printf("%d", value); 
	}

	modifyArray(array); // to pass array value
	  System.out.printf("%n%nThe values of the modified array are:%n");
	  // output modified array elements 
      for (int value : array) {
         System.out.printf("   %d", value);
      }
}

	private static void modifyArray(int[] array2) {
		for(int counter = 0; counter<=array2.length; counter++  ) { 
		array2[counter] *=2; 
	
		
		
		}}*/
		
		
		
		
	
			
			public static void main (String[] args) {
				
				int[] array = {1, 2, 3, 4, 5 } ; 
				
			System.out.print( 
					"Effects of passing reference to entire array:%n" +
			         "The values of the original array are:%n");
			
			
			// to output original value
			
			for(int value: array) {
				System.out.printf("%d", value); 
			}

			modifyArray(array); // to pass array value
			  System.out.printf("%n%nThe values of the modified array are:%n");
			  // output modified array elements 
		      for (int value : array) {
		         System.out.printf("   %d", value);
		      }
		}

			private static void modifyArray(int[] array2) {
				for(int counter = 0; counter<=array2.length; counter++  ) { 
				array2[counter] *=2; 
			
				
				
				}}
		}
