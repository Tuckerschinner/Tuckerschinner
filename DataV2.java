package data.java;

public class DataV2 {
	
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println("American Format:");
		System.out.print(day + " ");
		System.out.print(month + " ");	
		System.out.print(date + ", ");	
		System.out.println(year);
	}
	
	public static void printEnglish(String day, int date, String month, int year) {
		System.out.println("English Format:");
		System.out.print(day + " ");
		System.out.print(date + " ");	
		System.out.print(month + " ");	
		System.out.println(year);	
	}
	
	
	

	public static void main(String[] args) {
		String day = "Sunday";
		int date = 11;
		String month = "June";
		int year = 2023;
		printEnglish(day, date, month, year);
		printAmerican(day, date, month, year);
	}

}
