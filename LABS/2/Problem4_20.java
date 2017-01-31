// Clayton Szelestey
// Lab 2
// SoftDev 1
import java.util.Scanner;

public class Problem4_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String text = input.nextLine();
		System.out.println("The string has a length of " + text.length() + 
			", and the first character is " + text.substring(0, 1));
	}

}
