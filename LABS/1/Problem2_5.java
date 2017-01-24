//Clayton Szelestey
//Lab 1
//SoftDev 1
import java.util.Scanner;

public class Problem2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = subtotal * (gratuityRate * .01);
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}

}
