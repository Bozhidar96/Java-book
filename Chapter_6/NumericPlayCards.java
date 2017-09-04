
public class NumericPlayCards {

	public static void main(String[] args) {
		
		String[] colors = new String[]{ "Spades", "Diamonds", "Hearts", "Clubs"};
		String[] cards = new String[]{"Ace of", "Two of", "Three of", "Four of", "Five of", 
			"Six of", "Seven of", "Eight of", "Nine of",
			"Ten of", "Jack of", "Queen of", "King of"};
		
		for (int color = 0;  color < 4; color++) {
			for (int card = 2; card <= 14; card++) {
				System.out.println(cards[card] + " " + colors[color]);
			}
			System.out.println();
		}

	}

}
