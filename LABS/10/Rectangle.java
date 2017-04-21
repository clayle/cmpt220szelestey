//Clayton Szelestey
//Software Development
//Lab 10
public class Rectangle extends GeometricObjectC {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(
		double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(
		double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this. width = width;
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

	@Override 
	public double getArea() {
		return width * height;
	}

	@Override 
	public double getPerimeter() {
		return 2 * (width * height);
	}

	@Override
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}