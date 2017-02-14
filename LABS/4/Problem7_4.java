//Clayton Szelestey
//Software Development
//Lab 4
import java.util.Scanner;
public class Problem7_4 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double[] scores = new double[100];
		double sum = 0;
		int count = 0;
		double number = 0;
		
		while(number >= 0){
			System.out.print("Enter a score: ");
			number = input.nextDouble();
			
			if(number >= 0){
				scores[count] = number;
				sum += number;
				count++;
			}
		}
		
		double average = sum / count;
		
		int above = 0;
		int below = 0;
		for(int i = 0; i< count; i++){
			if(scores[i] >= average){
				above++;
			}else{
				below++;
			}
		}
		
		System.out.println("The Average is " + average);
		System.out.println("Number of scores above or equal to the average: " + above);
		System.out.println("numbr of scores below the average: " + below);
	}

}
