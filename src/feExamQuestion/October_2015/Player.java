package feExamQuestion.October_2015;

public class Player implements Comparable<Player> {

	private String name;
	private int score;

	public Player(String name) {
		super();
		this.name = name;
		this.score = 0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Player p) {
		return p.getScore() - this.score;
	}

	public String toString() {
		return name;
	}

}
