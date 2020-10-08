/**
 * @Author Md. Mainul Hasan
 * 
 * 10:03:24 PM
 * 
 * Oct 1, 2020
 *
 */
package feExamQuestion.October_2015;

public class GameLogic {
	public static GamePlayer checkWinner(GamePlayer player1, GamePlayer player2) {
		GamePlayer winner;
		if (player1.getChoice() == player2.getChoice()){
			return null;
		}else {
			if (player1.getChoice() < player2.getChoice()) {
				if ( Math.abs(player1.getChoice() - player2.getChoice()) == 1) {
					winner = player2;
				}else {
					winner = player1;
				}
			}else {
				if ( Math.abs(player1.getChoice() - player2.getChoice()) == 1) {
					winner = player1;
				}else {
					winner = player2;
				}
			}
		}
		
		
		winner.incScore();
		return winner;
		
	}
	
	
}
