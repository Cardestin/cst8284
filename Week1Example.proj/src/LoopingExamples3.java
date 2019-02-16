/** Simple examples of looping */
/** @author kriger */

public class LoopingExamples3 {

	public static void main(String[] args) {
		// print pattern of rank & file of chess board
		for (int rank = 8; rank >= 1; rank--) {
			for (char file = 'a'; file <= 'h'; file++) {
				System.out.printf("%c%d ", file, rank);
			}
			System.out.println();
		}
	} // end of main()
} // end of class
