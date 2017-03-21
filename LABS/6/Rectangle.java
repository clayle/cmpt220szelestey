//Clayton Szelestey
//Software Development
//Lab 6
public class Rectangle {
	double width;
	double height;	

	Rectangle() {
		width = 1;
		height = 1;
	} 

	Rectangle(double Width, double Height) {
		width = Width;
		height = Height;
	}

	double getArea() {
		return width * height; 
	}

	double getPerimeter() {
		return 2 * (width + height);
	}
}