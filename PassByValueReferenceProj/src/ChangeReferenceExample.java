



/**
 * simple example passing a reference type e.g. String
 * @author kriger
 *
 */
public class ChangeReferenceExample {

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		String s = new String("Fred");
		System.out.println("BEFORE method call, s= " + s);
		
		changeStringParam(s);
		
		System.out.println("AFTER method call, s= " + s);
	}// main()
	
	/**
	 * takes the parameter and changes it inside the method
	 * @param incoming parameter being passed, a reference type
	 */
	public static void changeStringParam(String incoming) {
		System.out.println("\t inside method, param= " + incoming);
		incoming = new String("Barney");
		System.out.println("\t\t after assignment, param= " + incoming);
	}
}// class
