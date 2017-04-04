//Clayton Szelestey
//Software Development
//Lab 9
import java.util.Scanner;

public class Problem12_7 {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary number to convert to decimal: ");
		String x = input.nextLine();
		System.out.println(x + " in decimal format is " + bin2Dec(x));
	}
	
	public static int bin2Dec(String binaryString) throws NumberFormatException {
		int decimal = 0;
		for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
			if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
				throw new NumberFormatException("The string is not a binary string");
			decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
		}
		return decimal;
	} 
}