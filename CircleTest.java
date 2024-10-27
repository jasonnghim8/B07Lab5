package lab4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void testConstructor(){
        Circle c = new Circle(5.0);
        assertEquals(c.radius, 5.0);
    }

    @Test
    public void testCalculateArea(){
        Circle c = new Circle(1.0);
        assertEquals(c.surfaceArea(), 1.0 * 1.0 * Math.PI);
    }

    @Test 
    public void testCalculateCircumference(){
        Circle c = new Circle(1.0);
        assertEquals(c.circumference(), 2 * Math.PI * 1.0);
    }
}