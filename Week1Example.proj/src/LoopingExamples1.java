/** Simple examples of looping */
/** @author kriger */

public class LoopingExamples1 {

	public static void main(String[] args) {

		// a simple counter controlled loop
		int i = 0;
		while (i < 10) {
			System.out.println("Loop 1: " + i);
			i++;
		} // end of loop
		System.out.println("Value of i is: " + i + " after Loop 1");

		// like while loop above.
		// NB: scope of i and j are different.
		for (int j = 0; j < 10; j++) {
			System.out.println("Loop 2: " + j);
		} // end of loop
			// j is "out of scope". next line gives compile error if un-commented
			// System.out.println("Value of j is: " + j +" after Loop 2");

		// value of i is 10, this loop should not print anything
		while (i < 10) {
			System.out.println("Loop 3: " + i);
			i++;
		} // end of loop

		do {
			System.out.println("Loop 4: " + i);
		} while (i < 10); // end of loop
		System.out.println("Value of i is: " + i + " after Loop 4");

	} // end of main()
} // end of class
