
public class Circle {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double surfaceArea() {
		return Math.PI * radius * radius;
	}
	public double circumference() {
		return 2 * Math.PI * radius;
	}
}
