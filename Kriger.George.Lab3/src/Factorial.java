import java.math.BigInteger;


/**
 * provides implementations of methods to calculate factorial
 * and the number of combinations
 * @author kriger
 *
 */
public class Factorial {
	/**
	 * calculates the series 1*2*3 ... *(x-1)*x
	 * factorial(1) results in 0
	 * uses BigInteger to avoid fixed point overflow
	 * @param x the upper bound for the series 1, 2, 3, ... (x-1), x
	 * @return the result of the series 1*2*3 ... *(x-1)*x
	 */
	public static BigInteger factorial(int x) {
		
		BigInteger tempI 	= new BigInteger("1");
		BigInteger product	= new BigInteger("1");
		
		for (int i=1; i<=x; i++) {
			tempI=new BigInteger(Integer.toString(i));
			product=product.multiply(tempI);
		}
		return product;	
		
	}//Factorial()
	
	/**
	 * calculates the number of unique subsets of size k from n items
	 * uses factorial(int x) method
	 * uses BigInteger to avoid fixed point overflow
	 * @param k	subset size
	 * @param n	size of the "universe" from which the subsets are chosen
	 * @return	the number of unique subsets of size k from n items
	 */
	public static BigInteger combinations(int k, int n) {
		BigInteger factN = factorial(n);
		BigInteger factN_K = factorial (n-k);
		BigInteger factK = factorial(k);
		
		return factN.divide(factN_K.multiply(factK));
		
	}
}//class
