//std algonquin header goes here


/**
 * This launches the use of the Radio class and its methods
 * @see Radio
 * @version 1.3
 * @author George Kriger
 */

public class RadioTest {
	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		Radio carRadio = new Radio(10, 91.5);

		System.out.println("Volume= " + carRadio.getVolume());
		System.out.println("Frequency= " + carRadio.getFrequency());

		System.out.println("Change radio station and turn it up");

		carRadio.setFrequency(101.9);
		carRadio.setVolume(15);
		// demo the use of printf()
		System.out.printf("Volume= %d, Frequency= %3.1f\n",
				carRadio.getVolume(), carRadio.getFrequency());
	} // end main
} // end class
