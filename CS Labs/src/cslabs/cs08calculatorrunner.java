package cslabs;

import java.util.Scanner;

public class cs08calculatorrunner
{
	public static void main(String[] args)
	{
		//instantiate a Scanner
		Scanner in = new Scanner(System.in);

		//prompt the user for the operator (how do you read in a character?)
		System.out.print("User, what's the operation? (+,-,*,/,^,% only)  ");

		//assign the input from the user to operator variable
		char op = in.next().charAt(0);

		//get the remaining inputs from the user
		System.out.print("\r\nUser, what's the number?  ");
		double n1 = in.nextDouble();
		System.out.print("\r\nUser, just one more?  ");
		double n2 = in.nextDouble();
		
		//instantiate Calculator object with the values entered by the user
		cs08calculator calc = new cs08calculator(n1, n2, op);
		//call the toString() method to print the results
		
		System.out.println("\r\nHouston, your results are in!  ");
		System.out.println("The number is " + calc.toString() + "!");
	}
}
