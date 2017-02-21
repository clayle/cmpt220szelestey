//Clayton Szelestey
//Software Development
//Lab 5
import java.util.Scanner;

public class Problem7_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.print("Enter five numbers: ");
		for(int i = 0; i < 5; i++){
			numbers[i] = input.nextInt();
		}
		
		System.out.println("The GCD is " + gcd(numbers));
	}
	
	public static int gcd(int... numbers){
		int gcd = 1;
		int min = min(numbers);
		int length = numbers.length - 1;
		int count = 0;
		for(int i = 2; i <= min; i++){
			for(int k = 0; k <= length; k++){
				if(numbers[k] % i == 0){
					count++;
					if(count == length)
						gcd = i;
				}else{
					count = 0;
				}
			}
		}
		return gcd;
	}
	
	public static int min(int[] array){
		int min = array[0];
		for(int i = 0; i < array.length; i++){
			if(min > array[i]){
				min = array[i];
			}
		}
		return min;
	}

}
