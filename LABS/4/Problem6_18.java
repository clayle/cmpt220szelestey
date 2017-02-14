//Clayton Szelestey
//Software Development
//Lab 4
import java.util.Scanner;
public class Problem6_18 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = input.nextLine();
		
		if(isValidPassword(password)){
			System.out.println("Valid Password");
		}else{
			System.out.println("Invalid Password");
		}
		
	}
	
	public static boolean isValidPassword(String password){
		
		if(password.length() < 8)
			return false;
		
		for(int i = 0; i < password.length(); i++){
			if(!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i)))
				return false;
		}
		
		int count = 0;
		for(int i = 0; i < password.length(); i++){
			if(Character.isDigit(password.charAt(i)))
				count++;
		}
		
		if(count >= 2)
			return true;
		else
			return false;
		
		
	}
}
