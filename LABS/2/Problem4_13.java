// Clayton Szelestey
// Lab 2
// SoftDev 1
import java.util.Scanner;

public class Problem4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String vowels = "aeiouAEIOU";
		char letter = input.next().charAt(0);
		if(vowels.contains(letter + "")){
			System.out.println(letter + " is a vowel");
		}else{
			System.out.println(letter + " is a consonant");
		}
	}

}
