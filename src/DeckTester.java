/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		// String[] ranks = {"jack", "queen", "king"};
		// String[] suits = {"blue", "red"};
		// int[] pointValues = {11, 12, 13};
		// Deck d = new Deck(ranks, suits, pointValues);

		// System.out.println("**** Original Deck Methods ****");
		// System.out.println("  toString:\n" + d.toString());
		// System.out.println("  isEmpty: " + d.isEmpty());
		// System.out.println("  size: " + d.size());
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deal a Card ****");
		// System.out.println("  deal: " + d.deal());
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deck Methods After 1 Card Dealt ****");
		// System.out.println("  toString:\n" + d.toString());
		// System.out.println("  isEmpty: " + d.isEmpty());
		// System.out.println("  size: " + d.size());
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deal Remaining 5 Cards ****");
		// for (int i = 0; i < 5; i++) {
		// 	System.out.println("  deal: " + d.deal());
		// }
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deck Methods After All Cards Dealt ****");
		// System.out.println("  toString:\n" + d.toString());
		// System.out.println("  isEmpty: " + d.isEmpty());
		// System.out.println("  size: " + d.size());
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deal a Card From Empty Deck ****");
		// System.out.println("  deal: " + d.deal());
		// System.out.println();
		// System.out.println();

		// System.out.println("*** Shuffle cards ***");
		// System.out.println();
		// d.shuffle();
		// System.out.println(d);

		String[] stanRanks = {"ace", "king", "queen", "jack", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two"};
		String[] stanSuits = {"hearts", "diamonds", "spades", "clubs"};
		int[] stanValues = {11, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2};
		Deck standardDeck = new Deck(stanRanks, stanSuits, stanValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + standardDeck.toString());
		System.out.println("  isEmpty: " + standardDeck.isEmpty());
		System.out.println("  size: " + standardDeck.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + standardDeck.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + standardDeck.toString());
		System.out.println("  isEmpty: " + standardDeck.isEmpty());
		System.out.println("  size: " + standardDeck.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 51 Cards ****");
		for (int i = 0; i < 51; i++) {
			System.out.println("  deal: " + standardDeck.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + standardDeck.toString());
		System.out.println("  isEmpty: " + standardDeck.isEmpty());
		System.out.println("  size: " + standardDeck.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + standardDeck.deal());
		System.out.println();
		System.out.println();

		System.out.println("*** Shuffle cards ***");
		System.out.println();
		standardDeck.shuffle();
		System.out.println(standardDeck);


	}
}
