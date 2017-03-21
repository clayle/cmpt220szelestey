//Clayton Szelestey
//Software Development
//Lab 6
import java.util.*;
public class Problem9_5 {
	public static void main(String[] args) {
		GregorianCalendar calender = new GregorianCalendar();

		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

		calender.setTimeInMillis(1234567898765L);

		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}
}