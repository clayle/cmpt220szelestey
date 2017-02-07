//Clayton Szelestey
//Software Development
//Lab 3
import java.util.Scanner;

public class Problem6_3 {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		System.out.println(number + " is a palindrome? " + isPalindrome(number));

	}
	
	public static int reverse(int number){
		int reverse = 0;
		while( number != 0 )
	    	{
				reverse = reverse * 10;
				reverse = reverse + number % 10;
				number = number / 10;
	    	}
		return reverse;
	}
	
	public static boolean isPalindrome(int number){
		return (number == reverse(number));
	}

}
