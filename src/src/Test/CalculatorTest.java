package Test;

import Main.Calculator;
import Main.Tan;
import Main.Util;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void getFactTest(){
        double x=6.0;
        double fact = Tan.getFact(3);
        assertEquals(x,fact,0);
        assertNotEquals(10.2,fact,0);
    }

    @Test
    public void sinTest(){
        double exp = 0.7071067810287149;
        double sinx = Tan.sin(0.7853981633974483);
        assertEquals(exp, sinx,0);
        assertNotEquals(10.2,sinx,0);
    }

    @Test
    public void cosTest(){
        double exp = 0.6478593448867553;
        double cosx = Tan.cos(0.8660254037843744);
        assertEquals(exp, cosx, 0);
        assertNotEquals(10.2,cosx,0);
    }

    @Test
    public void powerTest(){
        double radian = 2;
        double exponent = 2;
        double actual = Tan.power(radian,exponent);
        assertEquals(4.0, actual,0);
        assertNotEquals(10.2,actual,0);
    }


    @Test
    public void tanTest(){
        double expected = 0.9999999997767324;
        double actual = Tan.tan(45);
        assertEquals(expected, actual,0);
        assertNotEquals(10.2,actual,0);
    }

    @Test
    public void inValidRangeTest(){
        boolean actualT = Util.inValidRange(12.2);
        boolean actualF = Util.inValidRange(Double.MAX_VALUE+1);
        assertTrue(actualT);
        assertTrue(actualF);
    }
}
