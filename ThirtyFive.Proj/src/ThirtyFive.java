
import java.math.BigDecimal;

/**
 * example code showing use of double vs. BigDecimal
 * 
 * @author kriger
 *
 */
public class ThirtyFive {
	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		double dd = .35;					//.35 difficult to represent as double
		BigDecimal d = new BigDecimal(dd);
		System.out.println(".35 = " + d);

		BigDecimal d2 = new BigDecimal("0.35");
		System.out.println(".35 = " + d2);

	}//main()
}//class
