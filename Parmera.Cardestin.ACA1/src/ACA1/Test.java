package ACA1;

public class Test {

	public static void main(String[] args) {
		
		String st= "1234 1234 1234 1234";
		String s1 = "4417 1234 5678 9113";
		CreditCard cc = new CreditCard(s1);	
		System.out.println(cc.validate());
		//System.out.println(st);
	}

}
