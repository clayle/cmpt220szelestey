//Clayton Szelestey
//Software Development
//Lab 3
import java.util.Scanner;

public class Problem5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numPos = 0;
		int numNeg = 0;
		int total = 0;
		int count = 0;
		int num;
		double avg;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		num = input.nextInt();
		if(num == 0){
			System.out.println("No numbers are entered except 0");
		}else{
			while(num != 0){
				if (num > 0){
					numPos++;
				}
				else{
					numNeg++;
				}
				total = total + num;
				count++;
				num = input.nextInt();
			}
			avg = (total/(1.0 * count));
			System.out.println("The number of positives is " + numPos);
			System.out.println("The number of negatives is " + numNeg);
			System.out.println("The total is " + total);
			System.out.println("The average is " + avg);
		}

	}

}
