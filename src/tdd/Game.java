package tdd;

public class Game {
	
	int score = 0;
	void roll(int nbQuilles) {
		score = score+nbQuilles;
	}
	
	int score() {
		return score;
	}
}
