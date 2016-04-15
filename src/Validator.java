
import java.util.Scanner;

public class Validator {
	static Scanner input = new Scanner(System.in);
	public static double validateInputDouble(){
		while (!input.hasNextDouble()){
			System.out.print("Only number are allowed." +"\n" + "Please enter a number: ");
			input.nextLine();
		}
		double x = input.nextDouble();
		input.nextLine();
		return x;
		}
	public static double validateInputInRange(double min,double max){
		double input = validateInputDouble();
		while (input < min || input > max){
			System.out.print("Please enter number in range: ");
			
			input = validateInputDouble();
		}
		return input;
	}
}
