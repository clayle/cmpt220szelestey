//Clayton Szelestey
//Software Development
//Lab 5
import java.util.Scanner;

public class Problem7_10 {
	public static void main(String[] args){
		double[] numbers = new double[10];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		
		System.out.println("The index of the smallest element is " + indexOfSmallestElement(numbers));
	}
	
	public static int indexOfSmallestElement(double[] array){
		double min = array[0];
		int minIndex = 0;
		
		for(int i = 1; i < array.length; i++){
			if(min > array[i]){
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
