/** Simple examples of branching */
/** @author kriger */

public class BranchingExamples2 {

	public static void main(String[] args) {
		char mark = 'X';
		int player;

		switch (mark) {
		case 'X':
			player = 1;
			break;
		case 'O':
			player = 2;
			break;
		default:
			player = -1;
			System.out.println("improper TicTacToe mark");
		} // end of case
		System.out.println("player= " + player);

		String piece = "Pawn";

		int maxSquares;
							// Use of String with switch is JavaSE 7 !!
		switch (piece) {
		case "Rook":
		case "Bishop":
		case "Queen":			// note the "fall-through here and below
			maxSquares = 7;
			break;
		case "Pawn": 			// chess note: except when at starting point
		case "King":
			maxSquares = 1; 	// chess note: except when "castling"
			break;
		case "Knight":
			maxSquares = 1 + 1; // 1 diag and 1 horizantal or vertical
			break;
		case "PawnAtStart":
			maxSquares = 2;
			break;	
		default:
			maxSquares = -1;
			System.out.println("incorrect chess piece");
		} // end of case
	System.out.println("maxSquares= " + maxSquares);	
	} // end of main()
} // end of class
