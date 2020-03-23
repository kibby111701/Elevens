/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] firstRanks = {"ace", "three", "king"};
		String[] secondRanks = {"five", "queen"};
		String[] thirdRanks = {"two", "four", "six", "jack"};

		String[] suits = {"clubs", "diamonds", "hearts", "spades"};

		int firstPoints[] = {11, 3, 10};
		int secondPoints[] = {5, 10};
		int thirdPoints[] = {2, 4, 6, 10};

		Deck firstDeck = new Deck(firstRanks, suits, firstPoints);
		Deck secondDeck = new Deck(secondRanks, suits, secondPoints);
		Deck thirdDeck = new Deck(thirdRanks, suits, thirdPoints);

		firstDeck.size();
		firstDeck.deal();
		firstDeck.size();

		secondDeck.size();
		secondDeck.deal();
		secondDeck.deal();
		secondDeck.deal();
		secondDeck.deal();
		secondDeck.deal();
		secondDeck.deal();


		System.out.println(thirdDeck);
		thirdDeck.deal();
		System.out.println(thirdDeck);
		
	}
}
