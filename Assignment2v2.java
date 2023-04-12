/** Author: Thomas Schinner
 *  Date: April 6, 2023
 *  CMIS141 7385
 *  This program takes two user's number (200 to 1000) and an operator (+, -, *, or /)
 *  and calculates the number based on the operator, it also validates weather the user's
 *  numbers are between 200 and 1000, and if the correct operators were used.
 */

import java.util.Scanner;

public class Assignment2v2 {

	public static void main(String[] args) {
		
//Creates 2 numbers and an operator		
		int numb1;
		int numb2;
		char oper;
		
//Creates the user input variables	
		Scanner inputNumb1 = new Scanner(System.in);
		Scanner inputNumb2 = new Scanner(System.in);
		Scanner inputOper = new Scanner(System.in);

//Ask for the first number from the user		
		System.out.println("Enter an integer between 200 and 1000 ");
		numb1 = inputNumb1.nextInt();

//Creates a condition to check if the number are between 200 and 1000		
		if (numb1 < 200 || numb1 > 1000) {
			System.out.println(numb1 + " is not an integer between 200 and 1000");
//Ask user for a second number if the first number's condition is met						
		}else{	
				System.out.println("Enter another integer between 200 and 1000 ");
				numb2 = inputNumb2.nextInt();
//Creates a nested if condition to check if the second user number is between 200 and 1000				
				if (numb2 < 200 || numb2 > 1000) {
						System.out.println(numb2 + " is not an integer between 200 and 1000");	
//Ask user for an operator if the second number's conditions are met.						
				}else{
					System.out.println("Enter an operation symbol (+, -, *, or /):");
					oper = inputOper.next().charAt(0);
//Checks if the 4 operators are used, creates a variable to calculate the numbers, prints the results					
					if (oper == '+'){
						int plus = (numb1 + numb2); 
						System.out.printf("Answer: " + numb1 + " + " + numb2 + " = " + plus);
					}else if (oper == ('-')){
						int minus =(numb1 - numb2);
						System.out.printf("Answer: " + numb1 + " - " + numb2 + " = " + minus);
					}else if (oper == '*'){
						int times = (numb1 * numb2);
						System.out.printf("Answer: " + numb1 + " * " + numb2 + " = " + times);
					}else if (oper == '/'){
						int divide = (numb1 / numb2);
						System.out.printf("Answer: " + numb1 + " / " + numb2 + " = " + divide);
//Prints an error if the operators (+, -, *, or /) are not used				
					}else {	
						System.err.println(oper + " is not an operation symbol ask for (+, -, *, or /)");
					}
//Closes the input values
					inputNumb1.close();
					inputNumb2.close();
					inputOper.close();

	                }}}}

