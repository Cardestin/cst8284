

/**
 * passing a primitive and changing it inside the method
 * @author kriger
 *
 */

public class ChangePrimitiveExample {
	
	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		int anInt = 1;
		
		System.out.printf("Before calling method\n");
		System.out.printf("   anInt= %d\n\n", anInt);
		
		changeInt(anInt);
		
		System.out.printf("\nAfter calling method\n");
		System.out.printf("   anInt= %d\n", anInt);
	} // main

	/**
	 * takes the parameter and changes it inside the method
	 * @param i parameter being passed, a primitive
	 */
	public static void changeInt(int i){
		System.out.printf("Inside called method\n");
		System.out.printf("\tValue as passed %d\n", i);
		
		i=10;
		
		System.out.printf("\tChanged value is %d\n", i);
		System.out.printf("Leaving called method\n");
	} // changeInt()
} // class
