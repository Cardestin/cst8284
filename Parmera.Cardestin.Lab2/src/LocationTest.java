
/**File name: Parmera.Cardestin.Lab2
Author : Cardestin Parmera 040 679 684
Course CST 8132-OOP
Assignment : Lab#2
Date: 2019/01/25
Professor Georges Kriger
Purpose: Apply initial first lesson of OOP.
* 
* @author cparm;
* @version  1; 
*/


/**
 * 
 */

/**
 * @author cparm
 *
 */
public class LocationTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Location[] myLocation = new Location[5]; 
		
		
	
		myLocation[0] = new Location ("K1B", 45.4323, -75.5624); 
		myLocation[1] = new Location ("K2B", 45.3679, -75.788);
		myLocation[2] = new Location ("K2L", 45.3125, -75.8838);
		myLocation[3] = new Location ("K1Z", 45.3956, -75.7462);
		myLocation[4] = new Location ("K1G", 45.4118, -75.6304);
		
	
	
//	System.out.printf("%6s%6s%6s%6s%6s%n","","K1B","K2B","K2L","K1Z"  // page 297 of the book
//			,"K1G");
	System.out.println("\t  K1B\t  K2B\t  K2L\t  K1Z\t  K1G");
	for(int i=0;i<myLocation.length;i++) {// to control left location and postcode
		
		System.out.print(myLocation[i].getPostalCode());
		
		for(int j =0;j<myLocation.length;j++) {// to print each distances
			System.out.printf("\t%.3f",myLocation[i].distanceTo(myLocation[j]));
		}
		System.out.printf("\n");
		

	}
	

	
}  }
	
	
	


