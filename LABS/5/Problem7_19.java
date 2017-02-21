//Clayton Szelestey
//Software Development
//Lab 5
import java.util.Scanner;

public class Problem7_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a list of numbers(the first number is the size of the list): ");
		int size = input.nextInt();
		int[] numbers = new int[size];
		for(int i = 0; i < size; i++){
			numbers[i] = input.nextInt();
		}
		if(isSorted(numbers))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		
	}
	
	public static boolean isSorted(int[] numbers){
		for(int i = 0; i < numbers.length - 1; i++){
			if(numbers[i] > numbers[i + 1])
				return false;
		}
		return true;
	}

}
