package Lab3Redo;

public class FactorialTestRedo {
	
	public static void main(String[] args ) {
		
		int n, k;  
		
		k=3; n=10 ; 
		
		System.out.printf( " Combination;(%d , %d) = , %d%n" , k,n, FactorialRedo.combinations(n, k));		
	

	k=6; n=49 ; 
	System.out.printf( " Combination;(%d , %d) = , %d%n" , k,n, FactorialRedo.combinations(n, k));		
	
}}




// System.out.printf("Combinations(%d, %d) = %d%n", k, n, Factorial.combinations(k, n));