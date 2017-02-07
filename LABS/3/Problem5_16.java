//Clayton Szelestey
//Software Development
//Lab 3
import java.util.Scanner;

public class Problem5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("The factors for " + number + " is:");
		int factor = 2;
		while(factor <= number){
			if(number % factor ==0){
				number = number / factor;
				System.out.println(factor);
			}else{
				factor++;
			}
		}

	}

}
