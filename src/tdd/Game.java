package tdd;

public class Game {
	
	int turn=0;
	int score = 0;
	void roll(int nbQuilles) {
		if(score==10 && turn<=2)
			score = score+nbQuilles*2;
		else
			score = score+nbQuilles;
		turn++;
	}
	
	int score() {
		return score;
	}
}
