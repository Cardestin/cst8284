package ACA1;

public class CreditCardTest {

	public static void main(String[] args) {
		String[] stringArray = {
				// these are all valid credit card numbers
				"4417 1234 5678 9113", "4539 1775 3949 6461", "4556 9193 6641 0869", "3112 2684 5317 6416",
				"3096 0197 6910 3762", "3112 3816 9794 0990", "5108 5067 0536 5357", "5529 0162 7711 8995",
				"5396 3879 1336 6763", "6011 8611 6158 3751", "6011 3522 6616 1891", "6395 6561 1677 3275",
				// and here are the invalid ones
				"4485 8597 2409 0150", "4539 6540 1321 2489", "4916 5643 9752 4498", "3337 0602 5537 4137",
				"3158 7386 8017 3519", "3158 2274 0685 8267", "5221 8780 4919 5526", "5285 1926 4651 3045",
				"5591 9719 9725 2968", "6011 4141 1327 3017", "6376 3150 6218 4196", "6376 7967 3853 4142" };

		for (int i = 0; i < stringArray.length; i++) {
			CreditCard cc = new CreditCard(stringArray[i]);
			if (cc.validate()) {
				System.out.println(stringArray[i] + " is valid");
			} else {
				System.out.println(stringArray[i] + " is not valid");
			}

		}

	}

}
