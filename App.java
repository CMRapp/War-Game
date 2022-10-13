package CMRJavaFinalProjectWar;

/** This program simulates a 2 player version of the classic card game War. A deck of 52 cards is shuffled and then split
 *  between the players (Player 1 and Player2). Each player's card is dealt one at a time and the cards are compared. Whichever player's card is higher receives a point for the round. If the cards match, the hand is considered a draw
 *  and neither player receives a point. The information for each round (player/card/score) will be displayed on the screen. 
 *  After all cards have been played, the scores are compared and the player with the highest score is declared the winner. 
 *  If the scores are even, a draw is declared. The results for the game will be displayed on the screen. 
 *  
 *  The App class is the driver for the program.
 * 
 * @author Christian M Rapp
 *
 */
public class App {

	public static void main(String[] args) {

	Deck deck = new Deck();							//instantiate a new deck & 2 new players
	Player player1 = new Player("Player 1");		
	Player player2 = new Player("Player 2");
	
	deck.shuffle();									//shuffle the deck
	
	System.out.println("*** CMR War Card Game Simulator ***");	
	//Deal the shuffled cards to each player using traditional for loop
	for (int i = 0; i < 52; i++) {
		if ( i % 2 != 0) {
			player1.draw(deck);
		} else {
			player2.draw(deck);
		}
	}//end for
	
	//Flip each player's card and print to screen using traditional for loop
	
	for (int i = 0; i < 26; i++) {
		System.out.println("\nROUND " + (i + 1) );
		player1.describe();												//print player hands to the screen
		player2.describe();								
		
		Card p1Card = player1.flip();									//call method to flip player cards
		Card p2Card = player2.flip();									
		
		caluclateScore(player1, player2, p1Card, p2Card);				//call method to calculate scores
		displayScores(player1, player2);								//call method to display scores
		
	}//end for
	
	displayResults(player1, player2);									//call method to display results of game								
	
	}//end main
	
	static void caluclateScore(Player player1, Player player2, Card p1Card, Card p2Card) {
	// Compare card values and increment score (if applicable) 
	
	if (p1Card.getValue() > p2Card.getValue()) {
		player1.incrementScore();
		} else if(p2Card.getValue() > p1Card.getValue()) {
			player2.incrementScore();
		}
	}//end calculateScores
	
	static void displayScores(Player player1, Player player2) {
		//print out current player scores to the screen
		System.out.println(player1 + "'s Score: " + player1.getScore() +"\t" + player2 + "'s Score: " + player2.getScore());
		
	}//end displayScores

	static void displayResults(Player player1, Player player2) {
	//compare final scores & print game results
	
	System.out.println();	
	if(player1.getScore() > player2.getScore()) {
		System.out.println(player1 + " is the Winner with a score of: " + player1.getScore() + "!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2 + " is the Winner with a score of " + player2.getScore() + "!");
		} else {
			System.out.println("Both players ended with a score of " + player1.getScore() + ". | This game is a Draw.");
		}
	}//end displayResults
		
}//end Class App
