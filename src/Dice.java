import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String rerun;
		int rollNum = 1;
		
//Prompts user to input N-sides to set to dice
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("How many sides should the die have?");
		int sides = scan.nextInt();
		scan.nextLine();
		
//Generates two random numbers 1-Nsides and prints them
		do {
			System.out.printf("Roll %d:\n",rollNum);
			int result1 = DiceRollerApp.rollDie(sides);
			int result2 = DiceRollerApp.rollDie(sides);
			System.out.println(result1);
			System.out.println(result2);
			
//Checks for snakeeyes, boxcars, or craps then calls given method
			if(result1 == 1 && result2 == 1) {
				DiceRollerApp.snakeEyesReturner();
			}
			if(result1 + result2 == 7 || result1 + result2 ==11) {
				DiceRollerApp.crapsReturner();
			}
			if(result1 == 6 && result2 == 6) {
				DiceRollerApp.boxCarReturner();
			}
			
//Prompts user to roll again, if 'y' is inputed, reroll and add 1 to roll counter
			System.out.println("Would you like to roll again?");
			rerun = scan.nextLine();
			rollNum++;
		}while (rerun.equalsIgnoreCase("y"));
	scan.close();
	}
	
	
}
