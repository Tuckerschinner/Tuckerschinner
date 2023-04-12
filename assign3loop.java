package Assignment3;
import java.util.Scanner;
public class assign3loop {

/** Author: Thomas Schinner
 *  April 11, 2023
 *  This program accepts a name, calculates a gamer's score per level, adds bonuses, 
 *  and accepts more scores if the user want.  
 */
	
	public static void main(String[] args) {
		
		//Score variables and boolean to continue.
		boolean again = true;
		double level1;
		double level2;
		double level3;
		double engage;
		double total;
		
		//Scanner variables with a resource leak that turns into a bigger error if they are closed.
		Scanner inputName = new Scanner(System.in);
		Scanner inputScore = new Scanner(System.in);
		Scanner inputAgain = new Scanner(System.in);
		
		//while loop to rerun the whole program.
		while (again == true) {
		System.out.print("Please enter your gamer name:");
		String name = inputName.nextLine();
		
		//accepts scores per level
		System.out.print("Enter score for level 1, level 2, level 3, and engagement score seperated by a space:");
			level1 = inputScore.nextInt();
			level2 = inputScore.nextInt();
			level3 = inputScore.nextInt();
			engage = inputScore.nextInt();
			
			//Condition to check if scores are multiples of 5.
			if ((!(level1 % 5 == 0)) || (!(level2 % 5 == 0)) || (!(level3 % 5 == 0)) || (!(engage % 5 == 0))){
				System.err.println("Scores must be multiples of 5");
				return;
			}
			
			//Condition to check if scores are between 10 and 100.
			if (level1 < 10 || level1 > 100 || level2 < 10 || level2 > 100 || level3 < 10 || level3 > 100 || engage < 10 || engage > 100) {
				System.err.println("Scores must be bettween 10 and 100");
				return;
			}
			
			//Change doubles to integer.
			int value1 = (int)level1;
			int value2 = (int)level2;
			int value3 = (int)level3;
			int value4 = (int)engage;
			
			//Print out scores.
			System.out.println("\nGamer Name: " + name);
			System.out.println("Level 1 score: " + value1);
			System.out.println("Level 2 score: " + value2);
			System.out.println("Level 3 score: " + value3);
			System.out.println("Engagement score: " + value4);
			
			//Figures bonuses per level and adding them.
			level1 = (level1  + level1 * 0.2);
			level2 = (level2 + level2 * 0.3);
			level3 = (level3 + level3 * 0.5);
			engage = (engage + engage * 0.6);
			total = (level1 + level2 + level3 + engage);
			
			//Changing total from a double to a integer.
			int value5 = (int)total;
			
			//Print total scores with bonuses.
			System.out.println("Total score and bonuses: " + value5 );
			
			//Ask user if they would like to enter more scores.
			System.out.println("Would you like to enter another game's data? (true or false): ");
			again = inputAgain.nextBoolean();
			
		}	
		//Prints a thank you if user has finished entering scores.
		System.out.print("Thank you for using Total XP calculation program!!");	
	}
}

