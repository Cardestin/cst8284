/** Simple examples of branching */
/** @author kriger */

public class BranchingExamples1 {

	public static void main(String[] args) {
		int pressure = 20;

		if (pressure < 32) {
			System.out.println("Tire is flat");
		}

		if (pressure < 32) {
			System.out.println("Tire is flat");
		} else {
			System.out.println("Tire is not flat");
		}

		if (pressure < 32) {
			System.out.println("Tire is flat");
		} else if (pressure > 32) {
			System.out.println("Tire is OVER-inflated");
		} else if (pressure == 32) {
			System.out.println("Tire is at proper pressure");
		} else {
			System.out.println("Improper pressure value");
		}

		System.out.println("Tire is " + ((pressure < 32) ? "flat" : "not flat"));
	} // end of main()
} // end of class
