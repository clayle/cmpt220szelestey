//Clayton Szelestey
//Software Development
//Lab 3
public class Problem6_1 {

	public static void main(String[] args) {
		for(int x = 1;x <= 100; x++){
			System.out.print(getPentagonalNumber(x) + ", ");
			if(x % 10 == 0)
				System.out.println("");
		}

	}
	
	public static int getPentagonalNumber(int n){
		return (n * ((3 * n) - 1) / 2);
	}

}
