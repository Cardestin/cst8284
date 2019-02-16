//std algonquin header goes here

/**
 * This class implements a simple radio as an example of a class
 * @see java.lang.Object
 * @version 1.0
 * @author George Kriger
 *
 */
public class Radio {
	private int 	volume;
	private double 	frequency;
	
	/**
	 * Radio constructor
	 * @param vol volume/loudness of the radio
	 * @param freq frequency to which the radio is set
	 */
	public Radio(int vol, double freq) {
		this.volume = vol;
		this.frequency = freq;
	}
	/**
	 * report the value of the Radio volume
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * set the value of the Radio volume
	 * @param vol the volume to set
	 */
	public void setVolume(int vol) {
		volume = vol;
	}
	/**
	 * report the value of the Radio frequency
	 * @return the frequency
	 */
	public double getFrequency() {
		return frequency;
	}
	/**
	 * set the value of the Radio frequency
	 * @param freq the frequency to set
	 */
	public void setFrequency(double freq) {
		frequency = freq;
	}
	
	
}
