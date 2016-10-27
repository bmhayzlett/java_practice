/**
 * Created by brianhayzlett on 10/26/16.
 */
public class Main {

	public static void main(String[] args) {

		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("Your high score was " + highScore);

		highScore = calculateScore(true, 10000, 8, 200);
		System.out.println("Your high score was " + highScore);

		int position;
		position = calculateHighScorePosition(1500);
		displayHighScorePosition("Brian",position);

		position = calculateHighScorePosition(900);
		displayHighScorePosition("Thomas",position);

		position = calculateHighScorePosition(400);
		displayHighScorePosition("Skyler",position);

		position = calculateHighScorePosition(50);
		displayHighScorePosition("Dij",position);
	}

	public static void displayHighScorePosition(String name, int location) {
		System.out.println(name + " got into postion " + location);
	}

	public static int calculateHighScorePosition(int score) {
		if(score>1000) {
			return 1;
		}else if(score>500) {
			return 2;
		}else if(score>100) {
			return 3;
		} else {
			return 4;
		}
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
		} else {
			return -1;
		}
	}
}
