// Clayton Szelestey
// Lab 2
// SoftDev 1
import java.util.Scanner;

public class Problem4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		System.out.print("The Unicode for the character " + character + " is " + (int)character);
	}

}
