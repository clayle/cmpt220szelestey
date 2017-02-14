//Clayton Szelestey
//Software Development
//Lab 4
import java.util.Scanner;

public class Problem7_2 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.print("Enter a number: ");
			numbers[i] = input.nextInt();
		}
		
		System.out.println("The numbers in reverse order are: ");
		for(int i = 9; i >= 0; i--){
			System.out.print(numbers[i] + " ");
		}
		
	}

}
