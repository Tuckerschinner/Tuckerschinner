
package pickANum;

import java.util.Scanner;
import java.util.Random;

public class PickANum {

	public static void main(String[] args) {
		
		Random ranNum = new Random();
		Scanner numIn = new Scanner(System.in);
		System.out.print("Pick a number between 1 and 1000: ");
		int num = numIn.nextInt();
		int ran = ranNum.nextInt(1000) + 1;
		int numOff = num - ran;
		System.out.println("The random number is: " + ran);
		System.out.println("You are " + numOff + " numbers from the random number.");
		numIn.close();
	}

}
