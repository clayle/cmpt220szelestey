//Clayton Szelestey
//Software Development
//Lab 10
public abstract class GeometricObjectC implements Comparable<GeometricObjectC> {
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObjectC() {
		dateCreated = new java.util.Date();
	}

	protected GeometricObjectC(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}

	@Override 
	public int compareTo(GeometricObjectC o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	public static GeometricObjectC max(GeometricObjectC o1, GeometricObjectC o2) {
		return o1.compareTo(o2) == 1 ? o1 : o2;
	}

	public abstract double getArea();

	public abstract double getPerimeter();
}