
//Scanner is a class that provides methods for inputting words, numbers, and other data

//to use Scanner the package java.util must be imported, with the class of Scanner to be efficent.
import java.util.Scanner;

//Invoke the public class, must match file name.
public class ScannerTest{

//Call the main
public static void main(String[] args) {

//Create a variable and type of variable
String age;

//Create a new Scanner and call the System class and method 
//System.in - an InputStream that has methods for reading input from the keyboard. This method is the in method.
Scanner inAge = new Scanner(System.in);

//Ask the user what input the program wants
System.out.print("What is your age?");

//Give the variable the value of the user's input. in is the method, nextLine reads everything until the end of the line.
age = inAge.nextLine();

//Print a tag for the input and the value of the variable assigned to the input.
System.out.println("User's age is " + age);
inAge.close();


}
}
