
/**
 * Takes an amount of seconds, up to 9223372036854775807 and 
 * figures years, days, hours, minutes and seconds
 */

package countSeconds;
import java.util.Scanner;
public class CountSeconds {
	public static void main(String[] args) {
		
		Scanner secIn = new Scanner(System.in);
		System.out.print("Enter amount of seconds: ");
		long sec = secIn.nextLong();
		final long SECINYEAR = 31536000;
		final long SECINDAY = 86400;
		final long SECINHOUR = 3600;
		final long SECINMINUTE = 60;
		final long SECINSEC = 1;
		
		long secToY = sec / SECINYEAR;
		long secToD = sec % SECINYEAR / SECINDAY;
		long secToH = sec % SECINDAY / SECINHOUR;
		long secToM = sec % SECINHOUR / SECINMINUTE;
		long secToSec = sec % SECINMINUTE / SECINSEC;
		
		System.out.println("Years: "+ secToY);
		System.out.println("Days: "+ secToD);
		System.out.println("Hours: "+ secToH);
		System.out.println("Minutes: "+ secToM);
		System.out.println("Seconds: "+ secToSec);
		secIn.close();
	}
}
