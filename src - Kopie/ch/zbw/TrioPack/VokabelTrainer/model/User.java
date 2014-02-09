package ch.zbw.TrioPack.VokabelTrainer.model;

public class User {

	private String name;
	private int score;

	public User() {

	}

	public User(String name) {
		this.name = name;
		this.score = 0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}