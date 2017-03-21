//Clayton Szelestey
//Software Development
//Lab 6
public class Problem9_7 {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);

		account.setAnnualInterestRate(4.5);

		account.withdraw(2500);

		account.deposit(3000);

		System.out.println(account.getBalance());
		System.out.println(account.getMonthlyInterest());
		System.out.println(account.getDateCreated());
	}
}
