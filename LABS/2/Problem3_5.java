import java.util.Scanner;

public class Problem3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day (0 is Sunday, Saturday is 6): ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int days = input.nextInt();
		int futureDate = (today + days) % 7;
		
		// Determine string for day of the week ID
		String todayString;
		String futureDateString;
		switch(today){
			case 0:
				todayString = "Sunday";
				break;
			case 1:
				todayString = "Monday";
				break;
			case 2:
				todayString = "Tuesday";
				break;
			case 3:
				todayString = "Wednesday";
				break;
			case 4:
				todayString = "Thursday";
				break;
			case 5:
				todayString = "Friday";
				break;
			case 6:
				todayString = "Saturday";
				break;
			default:
				todayString = "error";
		}
		switch(futureDate){
			case 0:
				futureDateString = "Sunday";
				break;
			case 1:
				futureDateString = "Monday";
				break;
			case 2:
				futureDateString = "Tuesday";
				break;
			case 3:
				futureDateString = "Wednesday";
				break;
			case 4:
				futureDateString = "Thursday";
				break;
			case 5:
				futureDateString = "Friday";
				break;
			case 6:
				futureDateString = "Saturday";
				break;
			default:
				futureDateString = "error";
		}
		
		System.out.println("Today is " + todayString + " and the future day is " + futureDateString);
	}

}
