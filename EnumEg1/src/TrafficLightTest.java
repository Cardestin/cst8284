/**
 * 
 */

/**
 * Example using enum and some its methods
 * @author kriger
 *
 */
public class TrafficLightTest {
	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		TrafficLight tl=TrafficLight.RED;
		
		System.out.printf("tl= %s%n", tl);
		System.out.printf("tl.name()= %s%n", tl.name());
		
		System.out.printf("TrafficLight.values()= ");
		for(TrafficLight tempTL:TrafficLight.values()) {
			System.out.printf("%s ", tempTL);
		}
		System.out.println();
		
	}//main()
}//class
