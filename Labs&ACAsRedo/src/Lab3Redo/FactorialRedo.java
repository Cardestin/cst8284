package Lab3Redo;

import java.math.BigInteger;

public class FactorialRedo {
	
	public static BigInteger Factorial(int x) {
		
		BigInteger tempI =  new BigInteger ("1");
		BigInteger  product = new BigInteger ("1"); 
		
	
		for (int i=1; i<=x; i++) {
			
			tempI = new BigInteger(Integer.toString(i));
			product = product.multiply(tempI); 
			
			
		}
		
		return product ; 
				
	}
		public static  BigInteger combinations (int k, int n) {
			BigInteger factN = Factorial(n); 
			BigInteger factN_K = Factorial(n-k);
			BigInteger factK = Factorial(k);
			
			
	
	return Factorial(n).divide(Factorial(k).multiply(factN_K)); 
			
}}
	
	
	

