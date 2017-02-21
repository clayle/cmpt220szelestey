//Clayton Szelestey
//Software Development
//Lab 5
import java.util.Scanner;

public class Problem7_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		
		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
	}
	
	public static double deviation(double[] x){
		double mean = mean(x);
		double deviation = 0;
		for(int i = 0; i < x.length; i++){
			deviation += Math.pow(x[i] - mean, 2);
		}
		return Math.sqrt(deviation / (x.length - 1));
	}
	
	public static double mean(double[] x){
		double total = 0;
		for(int i = 0; i < x.length; i++){
			total += x[i];
		}
		return total / x.length;
	}

}
