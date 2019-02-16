/** Simple examples of looping */
/** @author kriger */

public class LoopingExamples2 {

	public static void main(String[] args) {

		// calculate e using series 1+1/1+1/(1*2)+1/(1*2*3)+ ...
		double sum = 1.0;
		double prevSum = 0.0;
		double denom = 1.0;
		double epsilon = 1.0e-10; 

		int i = 1;
		
		while (Math.abs(sum - prevSum) > epsilon) {
			prevSum = sum;
			sum += 1.0 / denom;
			System.out.printf("%1.15f\n", sum);
			i++;
			denom *= i;
		}
		System.out.printf("%1.15f is the value of Math.E\n", Math.E);
		System.out.printf("Stopped after %d iterations\n", i);

	} // end of main()
} // end of class
