package practice;

public class CardDeck {

	private final Card[] CARD_ARR = new Card[52];
	private String[] patternArr = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private String[] symbolArr = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public CardDeck() {
		int z = 0;
		for (int i = 0; i < patternArr.length; i++) {
			for (int j = 0; j < symbolArr.length; j++) {
				CARD_ARR[z] = new Card(patternArr[i], symbolArr[j]);

				System.out.println(CARD_ARR[z]);
				z++;
			}
		}
	}

	private int getRandomIdx() {
		return (int) (Math.random() * CARD_ARR.length);
	}

	public Card getOneCard() {
		Card c = null;
		int idx = 0;
		do {
			idx = getRandomIdx();
			c = CARD_ARR[idx];
		} while (c == null);

		CARD_ARR[idx] = null;
		return c;
	}

	public void printAll() {
		for(Card c : CARD_ARR) {
			System.out.println(c);
		}
	}
	
}
