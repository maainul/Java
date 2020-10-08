/**
 * @Author Md. Mainul Hasan
 * 
 * 10:00:05 PM
 * 
 * Oct 1, 2020
 *
 */
package feExamQuestion.October_2015;

public class GamePlayer extends Player {

	private int choice;
	
	public GamePlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void incScore() {
		setScore(getScore()+1);
	}
	
	public int getChoice() {
		return choice;
	}
	
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	
	

}
