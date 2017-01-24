import java.util.Scanner;

public class Problem2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in degrees Celsius: ");
		double temperatureC = input.nextDouble();
		double temperatureF = (9.0 / 5) * temperatureC + 32;
		System.out.println("The temperature in degrees Fahrenheit is: " + temperatureF);
	}

}
