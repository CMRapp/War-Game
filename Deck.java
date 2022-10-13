package CMRJavaFinalProjectWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Represents a standard deck of 52 cards made up of four suits (Hearts, Diamonds, Clubs, Spades)
 * Methods for shuffling and drawing are included in this class
 * @author Christian M Rapp
 *
 */

@SuppressWarnings("serial")
public class Deck extends ArrayList<Card>{

	// instantiate a new Deck and populate with the standard 52 cards
	
	public Deck() {
			
		for (int i = 0; i < 4; i++) {				//0-3 for name (Suit)
			for (int j = 2; j < 15; j++) {			//2-14 for value
				add(new Card(j,i));
			}
		}
	}
	
		
	public void shuffle() {
		Collections.shuffle(this);					//shuffle the cards using Collections.shuffle method
	}
	
	public Card draw() {
		return this.remove(0);						//remove and return the top card of the deck
	}
	
	//override default toString method to print the cards
	@Override
	public String toString() {
		String lf = "\n";
		return this.stream().map(Card::toString).collect(Collectors.joining(lf));
	}
}
