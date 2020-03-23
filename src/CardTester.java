/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card aceSpades = new Card("ace", "spades", 11);
		Card twoDiamonds = new Card("two", "diamonds", 2);
		Card jackClubs = new Card("jack", "clubs", 10);
		
		System.out.println(aceSpades);
		System.out.println(twoDiamonds);
		System.out.println(jackClubs);
	}
}
