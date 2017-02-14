//Clayton Szelestey
//Software Development
//Lab 4
import java.util.Scanner;

public class Problem7_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.print("Enter 10 double values: ");
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextDouble();
		}
		
		System.out.println("The average is " + average(numbers));
	}
	
	public static int average(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum / array.length;
	}
	
	public static double average(double[] array){
		double sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum / array.length;
	}

}
