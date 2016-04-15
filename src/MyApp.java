
import java.util.Scanner;

import shapes.Circle;

public class MyApp {
	//open Scanner
		static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		//title
		System.out.println("Welcome to the Circle Tester");
		
		//create new circle object
		Circle c1 = new Circle ();
		
		//variable for user input
		double userInput=0.0;
		//create new validator
		Validator v1 = new Validator();
		
		//check for keepGoing
		String keepGoing = "y";
		while (keepGoing.equalsIgnoreCase("y")){
		
		//get radius from user
		System.out.print("Enter circle radius: ");
		userInput = v1.validateInputInRange(1, Double.MAX_VALUE);
		c1.setRadius(userInput); // put all of this in the validate if number mmethod...posiby
		
		//print results
		System.out.println("Circumference: "+ c1.getFormattedCircumference());
		System.out.println("Area: " + c1.getFormattedArea());
		
		System.out.print("Would you like to continue (y/n)?: ");
		keepGoing = input.nextLine();
		validateKeepGoingUserInput(keepGoing);
		}//close while for keepGoing
		
		System.out.println("Goodbye!");
		
		//close scanner
		input.close();
	}
	public static String validateKeepGoingUserInput(String keepGoing) {
		while (!keepGoing.equalsIgnoreCase("y") && !keepGoing.equalsIgnoreCase("n")) {
			System.out.println("You must enter either 'Y' or 'N'.");
			System.out.println("Continue Y/N?: ");
			keepGoing = input.nextLine();
		} // end if statement validating user input
		return keepGoing;
	}
}
