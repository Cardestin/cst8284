//std algonquin header goes here
/**
 * class with main() to launch the class Factorial with test data
 * @author kriger
 *
 */
public class FactorialTest {

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		int n, k;
		
		k=3; n=10;
		System.out.printf("Combinations(%d, %d) = %d%n", k, n, Factorial.combinations(k, n));
		
		k=6; n=49;
		System.out.printf("Combinations(%d, %d) = %d%n", k, n, Factorial.combinations(k, n));
		
	}//main()
}//class
