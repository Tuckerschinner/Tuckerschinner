package time;

public class Time {

	public static void main(String[] args) {
		float hour = 13;
		float minutes = 05;
		float seconds = 30;
		float secondNow = 60*60*hour+60*minutes+30;
		float secondsInADay = 60*60*24;
		float now = 60*60*13+60*25+30;
		float secondsInMinute = 60;
	System.out.println("Number of seconds since midnight:");
	System.out.println(secondNow);
	System.out.println("Percentage of day passed:");
	System.out.println(secondNow / secondsInADay);
	System.out.println("Seconds that have passed since I started this: ");
	System.out.println(now - secondNow );
	System.out.println("Minutes that have passed since I started this: ");
	System.out.println((now - secondNow)/60);
	}

}
