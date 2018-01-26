import java.util.Random;

public class DiceRollerApp {
	
//Returns and prints String Craps if dice sum = 7 or 11
	public static void crapsReturner() {
		System.out.println("Craps!");
	}

//Returns and prints String Snake-Eyes if dice roll 1 & 1
	public static void snakeEyesReturner() {
		System.out.println("Snake-Eyes!");
	}
	
//Returns and prints String Box Cars if dice roll 6 & 6
	public static void boxCarReturner() {
		System.out.println("Box Cars!");
	}
	
/* Returns a random number from 1-Nsides 
 * Set seed to 0 for snake eyes
 * Set seed to 5 for boxcars
 */
	public static int rollDie(int sides) {
		Random ranNum = new Random();
		int rollResult = ranNum.nextInt(sides) +1;
		return rollResult;
	}
}
