import java.math.BigInteger;

/**File name: Parmera.Cardestin.Lab3
Author : Cardestin Parmera 040 679 684
Course CST 8132-OOP
Assignment : Lab#3
Date: 2019/02/02
Professor Georges Kriger
Purpose: Apply static and Big Number . 
 */

/**
 * @author main
 *
 */
public class Factorial {

	
	/**
	 * @param   this  method genarate  factor of a number "n".
	 * @return  to return this factorial number in  Bigdecimal format 
	 */
	
	public static BigInteger factorial(int n) {

		BigInteger result= BigInteger.ONE;
		BigInteger one= BigInteger.ONE;
		for(BigInteger i = BigInteger.valueOf(n);
				i.compareTo(BigInteger.ONE) >0;
				i=i.subtract(BigInteger.ONE)) {
			result=result.multiply(i);
		}
		return result;
	}
	
	/**
	 * @param k  first number to calculate  factorial
	 * @param n second number to calculate  factorial
	 * @return  factorial between k and n 
	 */
	public static BigInteger combination(int k ,int n) {
		return factorial(n).divide(factorial(k).multiply(factorial(n-k)));
	}
}
