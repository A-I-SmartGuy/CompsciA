/*
 * Brendan Aeria
 * Mrs. Woldseth Period 4 
 * AP Computer Science A Class
 * November 23rd, 2021
 *
 * What this program does: This program will walk the user through how any number can be doubled,
 * added six, divided in half, subtracted by the original number, and always end up with 3.
 *
 * Preconditions: The user is given certain numbers of different variation (integers, doubles, 
 * negative, positive, and even zero), and calculations will be printed to the screen displaying 
 * the process of being doubled, added six, divided in half, subtracted by the original number.
 * 
 * Postconditions: By the end the user will have an understanding not only that these different 
 * variations in numbers all pan out to be 3, but also they might start to catch onto why exactly 
 * this happens. Regardless, the user will have a fun time at the end punching in different numbers 
 * and being amazed at all of the crazy things that end up all equating to 3.
*/

import java.util.Scanner;
 
public class NumbersRiddle 
{
	public static void main(String[] args)
	{
		System.out.println("This program will walk you through how any number can be turned into 3 through the same simple algorithm!\n");

		/******************************
		*  Now we are going to test   *
		*  various forms of numbers   *
		******************************/

		// proving positive integers follow the rule
		testAnyNumber(666, false, "positive integers");

		makeSpace();

		// now for negative integers
		testAnyNumber(-42, false, "negative integers");

		makeSpace();

		// now for zero
		testAnyNumber(0, false, "zero");

		makeSpace();

		// now for one
		testAnyNumber(1, false, "one");

		makeSpace();

		// now for positive doubles
		testAnyNumber(21.19, true, "positive doubles");

		makeSpace();

		// now for negative doubles
		testAnyNumber(-99.999, true, "negative doubles");

		/***************************************************************
		*   Now we are testing if it works with their inputted number  *
		***************************************************************/

		makeSpace();

		// The user will input an integer and the calculation will be performed
		testInteger();

		makeSpace();

		// The user will input a double and the calculation will be performed
		testDouble();
	}
	
	static void makeSpace() {
		System.out.println("\n\n-----------------------------------------------------------\n");
	}
	
	static void testInteger() {
		// Setting up for user input using the Scanner in java
		Scanner myObj = new Scanner(System.in);
		// Prompting the user for an integer
		System.out.println("Enter any integer (not too long though): ");
		// Printing out what the user types
		String userInput = myObj.nextLine();
		// turning the string that they typed into a usable int variable
		int userNumber = Integer.parseInt(userInput);

		testAnyNumber(userNumber, false, "your integer");
	}
	
	
	
	static void testDouble() {
		// Setting up for user input using the Scanner in java
		Scanner myObj = new Scanner(System.in);
		// Prompts the user for a double
		System.out.println("Now to try it with a double (not too long though): ");
		// Assigns their input to a string
		String doubleInput = myObj.nextLine();
		// Turns that string into a usable double variable
		double userDouble = Double.parseDouble(doubleInput);

		// uses the "testAnyNumber" function from there
		testAnyNumber(userDouble, true, "your double");
	}

	static void testAnyNumber(double testingNumber, boolean testingDouble, String testing) {
		// Setting up for user input using the Scanner in java
		Scanner myObj = new Scanner(System.in);
		// Prompts the user for a double
		System.out.println("Now lets try " + testing + ". Type ok: ");
		// Assigns their input to a string
		String okInput = myObj.nextLine();

		/* 
		* I had to differentiate between double and integer
		* so that I knew when to cast, widen and
		* narrow the different variables to match the scenario.
		* it uses the "testingDouble" parameter of this function
		* to tell whether or not it is a double
		*/ 
		if(testingDouble) {
			// This uses the "testingNumber" parameter which is a double
			// and from there it does the calculations
			System.out.println("This test will use the number: " + testingNumber);

			System.out.println("\nStep #1 double it:");
			System.out.println(testingNumber + " * 2 = " + testingNumber * 2);
			double doubleMultiply = testingNumber * 2;

			System.out.println("Step #2 add six:");
			System.out.println(doubleMultiply + " + 6 = " + (doubleMultiply + 6));
			double doubleAddition = doubleMultiply + 6;

			System.out.println("Step #3 divide it in half:");
			System.out.println(doubleAddition + " / 2 = " + doubleAddition / 2);
			double doubleDivision = doubleAddition / 2;

			System.out.println("Step #4 subtract starting number:");
			System.out.print(doubleDivision + " - " + testingNumber + " = " + (doubleDivision - testingNumber));
			System.out.println(" <---- Well, what do you know!");
			double doubleEnd = doubleDivision - testingNumber;
			System.out.print(doubleEnd + " as an integer would just be: " + (int)doubleEnd);
		} else if (!testingDouble) {
			/* 
			* Same thing as with doubles, but it casts everything 
			* that would otherwise be a double to an integer so that 
			* there is no ".0" at the end of every number,
			* and does this throughout the calculation.
			*/
			System.out.println("This test will use the number: " + (int)testingNumber);

			System.out.println("\nStep #1 double it:");
			System.out.println((int)testingNumber + " * 2 = " + (int)testingNumber * 2);
			int intMultiply = (int)testingNumber * 2;

			System.out.println("Step #2 add six:");
			System.out.println(intMultiply + " + 6 = " + (intMultiply + 6));
			int intAddition = intMultiply + 6;

			System.out.println("Step #3 divide it in half:");
			System.out.println(intAddition + " / 2 = " + intAddition / 2);
			int intDivision = intAddition / 2;

			System.out.println("Step #4 subtract starting number:");
			System.out.print(intDivision + " - " + (int)testingNumber + " = " + (intDivision - (int)testingNumber));
			System.out.println(" <---- Well, what do you know!");
			int intEnd = intDivision - (int)testingNumber;
		}
	}
}
