//Clayton Szelestey
//Software Development
//Lab 4
import java.text.DecimalFormat;

public class Problem6_9 {

	public static void main(String[] args) {
		System.out.println("Feet\t\tMeters\t|\tMeters\t\tFeet");
	    System.out.println("-------------------------------------------------------");
	    
	    DecimalFormat converted = new DecimalFormat("#.000");
		DecimalFormat original = new DecimalFormat("#.0");
	    double foot = 1; 
	    double meter = 20;
	    for (int i = 1; i <= 10; foot++, meter += 5, i++){
	    	System.out.println(original.format(foot) + "\t\t" + converted.format(footToMeter(foot)) + "\t|\t" + original.format(meter) + "\t\t" + converted.format(meterToFoot(meter)));
	    }
	}
	
	public static double footToMeter(double foot){
		return foot * .305;
	}
	
	public static double meterToFoot(double meter){
		return meter * 3.279;
	}

}
