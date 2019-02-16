package ACA1;

public class CreditCard {

	private String creditCardNum;

	public CreditCard(String creditCardNum) { // see change primitive exemple week 3 folder

		this.creditCardNum = creditCardNum;

	}

	public boolean validate() {

		int groupOneTotal = 0;
		int groupTwoTotal = 0;
		int total = 0;
		creditCardNum = creditCardNum.replaceAll("\\s+", "");

		for (int i = 0; i < creditCardNum.length(); i += 2) {
			char c = creditCardNum.charAt(i);
			// System.out.println(c);
			int a = Character.getNumericValue(c);
			int sum = a * 2;
			if (sum >= 10) {
				String s = String.valueOf(sum);
				int first = Character.getNumericValue(s.charAt(0));
				int second = Character.getNumericValue(s.charAt(1));
				groupOneTotal = groupOneTotal + first + second;
			} else {
				groupOneTotal = groupOneTotal + sum;
			}
		}

		for (int i = 1; i < creditCardNum.length(); i += 2) {
			char c1 = creditCardNum.charAt(i);
			int a1 = Character.getNumericValue(c1);
			groupTwoTotal = groupTwoTotal + a1; 

		}

		//return (groupOneTotal+groupTwoTotal)%10==0;
		
		total=groupOneTotal+groupTwoTotal;
		if(total%10==0) {
			return true;
		}
		return false;

	}
}
