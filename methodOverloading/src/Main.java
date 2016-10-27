/**
 * Created by brianhayzlett on 10/26/16.
 */
public class Main {

	public static void main(String[] args) {
		int newScore = calculateScore("Brian",1000);
		calculateScore(200);
		calculateScore();
		double conversion = convert(1,1);
		System.out.println(conversion + " centimeters");
		conversion = convert(20);
		System.out.println(conversion + " centimeters");
	}

	public static double convert(int feet, int inches) {
		if((feet < 0) || ((inches < 0) || (inches > 12))) {
			return -1;
		}

		int totalInches = inches + (12 * feet);
		double centimeters = totalInches * 2.54;
		return centimeters;
	}

	public static double convert(double inches) {
		if(inches < 0) {
			return -1;
		}

		int feet = (int) inches / 12;
		int newInches = (int) inches % 12;
		return convert(feet,newInches);
	}

	public static int calculateScore(String name, int score) {
		System.out.println("Player " + name + " scored " + score);
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Player unnamed scored " + score);
		return score * 1000;
	}

	public static int calculateScore() {
		System.out.println("Player unnamed scored no score");
		return 0;
	}

}
