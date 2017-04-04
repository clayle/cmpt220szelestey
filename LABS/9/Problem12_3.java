//Clayton Szelestey
//Software Development
//Lab 9
import java.util.Scanner;

public class Problem12_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int[] array = randomArray();

		System.out.print("Enter the index of the array: ");
		try {
			System.out.println("The corresponding element value is " + array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
	}

	public static int[] randomArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}