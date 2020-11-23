/**
 * @Author Md. Mainul Hasan
 * 
 * 10:10:38 PM
 * 
 * Oct 1, 2020
 *
 */
package feExamQuestion.October_2015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

public class RoPaScGame extends Game {
// Read data from keyboard input stream.
	public BufferedReader reader;
	private final int PLAYCOUNT = 3;

	public RoPaScGame() {
		super();
		InputStreamReader input = new InputStreamReader(System.in);
		reader = new BufferedReader(input);
	}

	public void initGame() {
		players.clear();
		players.add(new GamePlayer("Computer"));
		players.add(new GamePlayer("Player"));
	}

	public void startGame() {
		initGame();
		System.out.println("Input r (rock), p (paper) or s (scissors)");
		for (int count = 0; count < PLAYCOUNT; count++) {
			playGame();
		}
		endGame();
	}

	public void playGame() {
		GamePlayer computer = (GamePlayer) players.get(0);
		GamePlayer player = (GamePlayer) players.get(1);
		computer.setChoice((int) (Math.random() * 3));
		boolean isCorrect = false;
		System.out.println("_________________________");
		while (!isCorrect) {
			System.out.println("Input your choice");
			char choice = readInput();
			switch (choice) {
			case 'r':
				player.setChoice(0);
				isCorrect = true;
				break;

			case 'p':
				player.setChoice(1);
				isCorrect = true;
				break;

			case 's':
				player.setChoice(2);
				isCorrect = true;
				break;
			default:
				System.out.println("Wrong shape");
				break;
			}
		}
		GamePlayer winner = GameLogic.checkWinner(player, computer);
		if (winner != null)
			System.out.println("Winner is " + winner);
		else
			System.out.println("The game is tied");
	}

	public void endGame() {
		Collections.sort(players);
		Player p1 = players.get(0);
		Player p2 = players.get(1);
		System.out.println("_________________________");
		System.out.println(p1 + " vs. " + p2);
		System.out.println(p1 + "'s score :\t" + p1.getScore());
		System.out.println(p2 + "'s score :\t" + p2.getScore());
		if (p1.getScore() != p2.getScore())
			System.out.println(p1 + " won.");
		else
			System.out.println("End in a tie.");
		System.out.println("_________________________");
	}

	public char readInput() {
		String result = null;
		try {
			result = reader.readLine();
		} catch (Exception e) {
		}
		return result.charAt(0);
	}
}