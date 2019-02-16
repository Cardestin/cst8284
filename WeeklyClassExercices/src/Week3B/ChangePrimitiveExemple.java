package Week3B;

/**
 * passing a primitive and changing it inside the method
 * @author kriger
 *
 */

public class ChangePrimitiveExemple {
	
	public static void main(String[] args) { 
		
		int anInt = 1;  
		
		
		System.out.printf("Before calling Method\n");
		System.out.printf("anInt =%d\n", anInt);
		
		
		ChangeInt(anInt); 
		System.out.printf("After calling Method\n");
		System.out.printf("anInt =%d\n", anInt);
		
	}

	private static void ChangeInt(int i) {
		System.out.printf("Inside the method = \n");
		System.out.printf("\t Value of I as pass %d\n", i); 
		
		
		i =10; 
		System.out.printf("\tChanged value is %d\n", i);
		System.out.printf("Leaving called method\n");
		
	}
	
	
	
	
	

}
