package CMRJavaFinalProjectWar;

/**
 * Class creates a representation of a single playing card form a standard 52 card deck.
 * A card has a value from 2-14 (14 being an Ace) and a name (suit name).
 * 
 * @author Christian M Rapp
 *
 */

public class Card { 				
	
	//Class level declarations
	private int value; 				// values of cards are 2-14 (14 is Ace)
	private int name; 				// name of card (0 = hearts, 1= spades, 2 = diamonds, 3 = clubs)
	
	
	//constructor
	public Card(int value, int name) {
		this.value = value;
		this.name = name;
	}
	
	//describe() method calls the buildCard() method and prints out card information
	public void describe(int value, int name) {
		System.out.println(buildCard(value, name));
	}
	
	/* The buildCard() method receives two ints representing the card value and suit and creates a StringBuilder to create the
	 * player's card (ex: Queen of Hearts). Used a case statement for future modifications, like adding Jokers or a Wild Card
	 *  
	 */
	
	public String buildCard(int value, int name) {			
		
		StringBuilder playingCard = new StringBuilder();	//holds full card name
		
		//use switch for card values
		switch(value) {
		case 11:
			playingCard.append("Jack");
			break;
		case 12:
			playingCard.append("Queen");
			break;
		case 13:
			playingCard.append("King");
			break;
		case 14 :
			playingCard.append("Ace");
			break;
		default:
			playingCard.append(value); // 2-10 does not need converted to a name
		}
		
		playingCard.append(" of "); // output formatting - adds the word "of" as well as leading and trailing spaces to StringBuilder
		
		
		//use switch for name (suit)
		switch(name) {
		case 0:
			playingCard.append("Hearts");
			break;
		case 1:
			playingCard.append("Spades");
			break;
		case 2:
			playingCard.append("Diamonds");
			break;
		case 3 :
			playingCard.append("Clubs");
			break;
		}
		return playingCard.toString(); //return combined string (ex: "3 of Spades")
	}
	
	//override the default toString method to print cards to screen
	@Override
	public String toString() {
		return buildCard(value , name);
	}
		
	//getters and setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
		
}
