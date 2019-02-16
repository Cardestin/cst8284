package Week4EnumExemple;

public class TraficLightTest {
	
	public static void main( String[] args) {
		
		TrafficLight tlr = TrafficLight.RED; 
		
		System.out.printf("tlr = %s%n", tlr);
		
		
		System.out.printf("tlr.name() = %s%n", tlr.name());
		
		System.out.printf("TrafficLight Value() = "); 
		
		for (TrafficLight tempTL: TrafficLight.values()) {
			System.out.printf("%s ",tempTL); 
		}
			System.out.println(); 
			
		}
	}
	
	
	
	
	
	

