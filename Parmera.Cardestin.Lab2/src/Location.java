import java.lang.*;


/**File name: Parmera.Cardestin.Lab2
Author : Cardestin Parmera 040 679 684
Course CST 8132-OOP
Assignment : Lab#2
Date: 2019/01/25
Professor Georges Kriger
Purpose: Apply initial first lesson of OOP.
* 
* @author cparm;
* @version  1; 
*/


/**
 * @author cparm
 *
 */
public class Location {
	private String postalCode; 
	private double latitude; 
	private double longitude; 
	
	
	/**
	 * Initialize constructor
	 * @param postalCode
	 * @param latitude
	 * @param longitude
	 */
	public Location( String postalCode,double latitude, double longitude) { 
		this.postalCode= postalCode;
		this.latitude=latitude; 
		this.longitude=longitude;
	}
	
	//public Location(Location l2) { copy constructor
		
	//}


	/**
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}


	/**
	 * getter for latitude
	 * @return latitude
	 */
	public double getLatitude() {
		return latitude;
	}


	/** 
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Compare current location with location2
	 * return the distance between to locations
	 * @return distance
	 */
	public double distanceTo(Location location2 ) {  //location1.distanceTo(location2) 
		
		double x1 = this.latitude; 
		double x2 = location2.getLatitude();
		
		
		double y1= this.longitude; 
		double y2= location2.getLongitude();
		//double distance; 
		//return Math.sqrt(Math.pow((location2.getLatitude()-this.latitude),2))+Math.pow((location2.getLongitude()-this.longitude),2);
		return Math.sqrt((Math.pow((x2-x1),2))+ Math.pow((y2-y1),2)); 
	}
	
	
}
