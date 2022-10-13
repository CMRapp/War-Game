package CMRJavaFinalProjectWar;


/*
 * Creates a Player Class consisting of a player name, the player's hand of cards and the player's score.
 * The describe(), flip(), draw() and incrementScore() methods (described below) are included.
 */
public class Player {

	private int score;
	private String name;
	private Hand hand = new Hand();
	
	
	
	public Player (String name){
		this.name = name;
				
	}
		
	public void describe() {
		if (hand.size() > 0) {
			System.out.println(name + "'s current card: " + hand.get(0));
						
			} 	
	}
	
	public Card flip() {
		// remove and return top card of the hand
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		//Take Deck as argument and calls draw method on the deck adding returned Card to hand field
		hand.add(deck.remove(0));
	}
	
	
	public void incrementScore() {
		//increment player's score
		score += 1;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public Hand getHand() {
		return hand;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	
	
}

