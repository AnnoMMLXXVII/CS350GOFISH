/* 
 * Cards: 
 * 		52 cards total
 * 		13 face values
 * 		Need to store into Array or ArrayList
 * 			--> the Deck of cards itself
 * 			--> Perhaps a shuffled deck (perhaps a method)
 * 			--> player's hands 
 * 			--> the pile of pairs for each player
 * Players:
 * 		Need to ask if other player has a requested card (that's in their hand)
 * 		7 cards to start with in their hand
 * 
 * ScoreBoard: 
 * 		--> Keep track of the player's or opponenet's number of wins
 * 			--> Format : W - L - T;
 * 
 * Deciding who begins:
 * 		--> Guessing a random number 1-10;
 * 			--> need to implement the random guesses for the opponents too;
		--> Winner is decided by the number that's closest w/o going over
 * 
 * GamePlay Order:
 * 		--> starting with person who guessed right or closest, then alternates
 * 
 * To Win: 
 * 		--> highest-matching number of pairs
 * 
 * End Scenario:
 * 		--> When deck of cards is 0 is one person's hand is empty; 
 * 			--> though this doesn't determine the winner;
 * 		
 * Before First turn:
 * 		--> method called that checks for pairs in hands
 * 			--> this method will be called every turn;
 * 
 * GamePlay Scenarios: 
 * 	GOFISH: 
 * 		If 'Go-Fish' occurs, then player asking must draw one card from the deck
 * 			--> if the card drawn has a matching pair in the player's hand: place it into the matching-paired pile 
 * 					if (cards in hands == 0) {
 * 						--> need a flagger or indicator to signify this scenario (accessor amd mutator);
 * 						run noMoreCardsInHands scecario
 * 					}
 * 					else { -- end of turn;}
 * 			--> else: add it to the player's hand -- end of turn;
 * 		else: opponent removes said card into player's matching-paired pile ( a match has occured
 * 
 * (method to signify next turn) 
 * 
 * 	No More Cards in Hand:
 * 		check deck pile:
 * 			if == 0 {
 * 				- can't pick any more cards thus game ends
 * 				- then calcualte the number of pairs
 * 					- if player's pairs > opponents 
 * 						- increment player's win by 1
 * 						- increment opponent's loss by 1;
 * 					- else if player's pairs == oppoenents {
 * 						- increase ties for both (optional else-if scenario)
 * 					- else {	
 * 						- vice-versa;
 * 			else { 
 * 				--> some how need to use a boolean or some indicator to end this player's turn becasue it would be too long of a turn
 * 				if (flagger indicates it's after GO-FISH) {
 * 				- player draws one card, thus end turn;
 * 				}
 * 				else { (!after Go-FISH)
 * 				- Player asks if opponent has said card
 * 					- GOFISH scenario
 * 				}
 * 		
 * 	EX: --> if (true) { player will pick up card and end turn because she/he had previously been told to 'GO-Fish' };
 * 			else {  Plyaer will pick up card because she/he had run out of cards due
 * 					to a matching pair (from opponenet finding one, or you drawing a matching pair)... 
 * 					this doesn't end the player's turn becuase 'GO-FISH' didn't happen before it.. 
 * 					she/he can ask if a card is matchable
 * 			
 * 				
 * 
 * 
 *   
*/

public class MainTester_01 {

	public static void main(String[] args) {

	}

}
