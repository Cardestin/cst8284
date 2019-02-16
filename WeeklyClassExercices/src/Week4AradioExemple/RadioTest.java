package Week4AradioExemple;

public class RadioTest {
	public static void main( String[] args) {
		
		Radio myRadio = new Radio(10,91.5);
		
		System.out.println(" Volume = " + myRadio.getVolume()); 
		System.out.println(" Frequency = " + myRadio.getFrequency());
		
	
		System.out.println("Change Radio Station and turn it up"); 
		
		myRadio.setVolume(15);
		myRadio.setFrequency(101.9);
		
		
		System.out.printf(" Volume = %d, Frequency = %3.1f\n", myRadio.getVolume(), myRadio.getFrequency());
		
	}
	
	
	
	
	
	
	/*	System.out.println("Change radio station and turn it up");

		carRadio.setFrequency(101.9);
		carRadio.setVolume(15);
		// demo the use of printf()
		System.out.printf("Volume= %d, Frequency= %3.1f\n",
				carRadio.getVolume(), carRadio.getFrequency());*/

}
