import java.util.Random;

public class DiceRollerApp {
	
	public static void crapsReturner() {
		System.out.println("Craps!");
	}
	public static void snakeEyesReturner() {
		System.out.println("Snake-Eyes!");
	}
	public static void boxCarReturner() {
		System.out.println("Box Cars!");
	}
	public static int rollDie(int sides) {
		Random ranNum = new Random();
		int rollResult = ranNum.nextInt(sides) +1;
		return rollResult;
	}
}
