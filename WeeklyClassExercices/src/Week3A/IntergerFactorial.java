package Week3A;

public class IntergerFactorial {
	
	public static void main(String[] args) {
		
		Integer fact6, fact49; 
		
		fact6 = Factorial(6);
		fact49 = Factorial(49);
		
		System.out.printf("fact(6) = %d%n", fact6);
        System.out.printf("fact(49) = %d%n", fact49);
		
	}

	private static Integer Factorial(int i) {
		// TODO Auto-generated method stub
		Integer product = new Integer("1"); 
		
		for(int f=2; f<=i; f++) {
			
			Integer temp = new  Integer(f); 
			
			product =product * temp; 
		}
		
				
		return product;
	}

}
