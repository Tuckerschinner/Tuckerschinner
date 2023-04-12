import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		int numb1;
		int numb2;
		char oper;
		int anwser;
		Scanner inNumb1 = new Scanner(System.in);
		Scanner inNumb2 = new Scanner(System.in);
		Scanner inOper = new Scanner(System.in);
		
		System.out.print("Input a number between 200 and 1000:");
		numb1 = inNumb1.nextInt();
		System.out.print("Input another number between 200 and 1000:");
		numb2 = inNumb2.nextInt();
		
		if (numb1 < 200 || numb1 > 1000 || numb2 < 200 || numb2 > 1000) {
			System.out.println("ERROR Numbers must be between 200 and 1000.");
		}else{System.out.print("Now, input an operation symbol(+, -, *, or /):");
		oper = inOper.next().charAt(0);
				if (oper != + || oper != - || oper != * || oper != / ) {
					System.out.println("ERROR symbol must be +, -, *, or /");
				}
		}
		
		//
		
		System.out.print("Now, input an operation symbol(+, -, *, or /):");
		oper = inOper.next().charAt(0);
		//System.out.print(numb1 + oper + numb2);
		//if (numb1 > 199 || numb1 < 1001 || numb2 > 199 || numb2 < 1001) {
			//switch (oper == + || oper == - || oper == * || oper == /)
			//	System.out.print(numb1 + numb2);
			//
		//}}else {
			System.out.print(numb1 + oper + numb2);
		
		anwser = numb1 + oper + numb2;
		inNumb1.close();
		inNumb2.close();
		inOper.close();

	}

}
