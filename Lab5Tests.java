// package lab5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class Lab5Tests {
	// constructors
	
	// Triangle

	// Perimeter
	@Test
	void testPerimeter() {
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(1.0, 1.0);
		// Point p3 = new Point(0.0, 2.0);

		Square sq = new Square(p1, p2);
		assertEquals(sq.perimeter(), 4);
	}
}
