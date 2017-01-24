//Clayton Szelestey
//Lab 1
//SoftDev 1
import java.util.Scanner;

public class Problem2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter a number between 0 and 1000: ");
	    int number = input.nextInt();

	    int lastNumber = number % 10;
	    int leftover = number / 10;
	    int middleNumber = leftover % 10;
	    leftover = leftover / 10;
	    int firstNumber = leftover % 10;

	    int sum = lastNumber + middleNumber + firstNumber;

	    System.out.println("The sum of all digits in " + number + " is " + sum);
	}

}
