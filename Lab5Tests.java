// package lab5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class Lab5Tests {
	// constructors
	
	// Triangle

	// Perimeter
	@Test
	void testPerimeter1() {
		// +ve peri
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(1.0, 1.0);

		Square sq = new Square(p1, p2);
		assertEquals(sq.perimeter(), 4);
	}
	@Test
	void testPerimeter2() {
		// zero peri
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(0.0, 0.0);

		Square sq = new Square(p1, p2);
		assertEquals(sq.perimeter(), 0);
	}
}
