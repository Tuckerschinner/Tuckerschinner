package celToFar;
import java.util.Scanner;
public class celToFar {

	public static void main(String[] args) {
		Scanner celIn = new Scanner(System.in);
		System.out.print("Enter celsius: ");
		double cel = celIn.nextDouble();
		final double CEL_TO_FAR = 1.8 * cel + 32;
		System.out.println(CEL_TO_FAR);

	}

}
