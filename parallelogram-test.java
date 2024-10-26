package lab4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class parallelogramTest{

    @Test
    void testPeri1(){
        Point w = new Point(1,1);
        Point x = new Point(4,1);
        Point y = new Point(5,3);
        Point z = new Point(2,3);
        Parallelogram a = new Parallelogram(w,x,y,z);
        assertEquals(a.perimeter(), 6 + 2* Math.sqrt(5));
    }

    @Test
    void testPeri2(){
        Point w = new Point(1,2);
        Point x = new Point(4,5);
        Point y = new Point(7,4);
        Point z = new Point(4,1);
        Parallelogram a = new Parallelogram(w,x,y,z);
        assertEquals(a.perimeter(), Math.sqrt(18) + Math.sqrt(18) + Math.sqrt(10) + Math.sqrt(10));
    }

    @Test
    void testPeriRhom(){
        Point w = new Point(2,3);
        Point x = new Point(4,5);
        Point y = new Point(2,7);
        Point z = new Point(0,5);
        Parallelogram a = new Parallelogram(w,x,y,z);
        assertEquals(a.perimeter(), 4* Math.sqrt(8));
    }
    
    @Test
    void testIsRhom(){
        Point w = new Point(1,1);
        Point x = new Point(4,1);
        Point y = new Point(5,3);
        Point z = new Point(2,3);
        Parallelogram a = new Parallelogram(w,x,y,z);
        assertFalse(a.isRhombus());
    }

    @Test
    void testIsRhom2(){
        Point w = new Point(1,2);
        Point x = new Point(4,5);
        Point y = new Point(7,4);
        Point z = new Point(4,1);
        Parallelogram a = new Parallelogram(w,x,y,z);
        assertFalse(a.isRhombus());
    }

    @Test
    void testisRhomTrue(){
        Point w = new Point(2,3);
        Point x = new Point(4,5);
        Point y = new Point(2,7);
        Point z = new Point(0,5);
        Parallelogram a = new Parallelogram(w,x,y,z);
        assertTrue(a.isRhombus());
    }
}