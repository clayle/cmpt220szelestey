//Clayton Szelestey
//Software Development
//Lab 3
import java.text.DecimalFormat;

public class Problem5_5 {

	public static void main(String[] args) {
		
		DecimalFormat ktp = new DecimalFormat("#.0");
		DecimalFormat ptk = new DecimalFormat("#.00");
		int lbs = 20;
		
		System.out.println("Kilograms     Pounds | Pounds     Kilograms");
		
		for(int x = 1; x < 200; x = x + 2){
			System.out.print(x + "		" + ktp.format(x * 2.2) + " | ");
			System.out.println(lbs + "	   " + ptk.format(lbs / 2.2));
			lbs += 5;
			
		}
	}

}
