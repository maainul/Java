/**
 * @Author Md. Mainul Hasan
 * 
 * 9:56:12 PM
 * 
 * Oct 1, 2020
 *
 */
package feExamQuestion.October_2015;

import java.util.ArrayList;
import java.util.List;

public abstract class Game  implements GameLoop{
	protected List<Player> players;
	public Game() {
		players = new ArrayList<Player>();
	}
	
	public void play() {
		startGame();
	}
	
}
