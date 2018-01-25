import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String rerun;
		int rollNum = 1;
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("How many sides should the die have?");
		int sides = scan.nextInt();
		scan.nextLine();
		
		
		do {
			System.out.printf("Roll %d:\n",rollNum);
			int result1 = rollDie(sides);
			int result2 = rollDie(sides);
			System.out.println(result1);
			System.out.println(result2);
			
			if(result1 == 1 && result2 == 1) {
				DiceRollerApp.snakeEyesReturner();
			}
			if(result1 + result2 == 7 || result1 + result2 ==11) {
				DiceRollerApp.crapsReturner();
			}
			if(result1 == 6 && result2 == 6) {
				DiceRollerApp.boxCarReturner();
			}
			
			System.out.println("Would you like to roll again?");
			rerun = scan.nextLine();
			rollNum++;
				
		}while (rerun.equalsIgnoreCase("y"));
		
	}
	public static int rollDie(int sides) {
		Random ranNum = new Random();
		int rollResult = ranNum.nextInt(sides) +1;
		return rollResult;
	}
}
