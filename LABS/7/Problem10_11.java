
public class Problem10_11 {

	public static void main(String[] args) {
		// Create a Circle2D object
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		// Display results
		System.out.println(c1.getArea()); 
		System.out.println(c1.getPerimeter()); 
		System.out.println(c1.contains(3, 3)); 
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
