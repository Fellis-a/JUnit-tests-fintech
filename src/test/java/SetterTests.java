import org.junit.*;
import static org.junit.Assert.*;

public class SetterTests {

    @Test
    public void testSetNumerator() {
        Rational rational = new Rational();
        rational.setNumerator(5);
        assertEquals("Numerator was not set correctly", 5, rational.getNumerator());
        assertEquals("Denominator should remain unchanged when setting numerator", 1, rational.getDenominator());
    }

    @Test
    public void testSetDenominator() {
        Rational rational = new Rational();
        rational.setDenominator(5);
        assertEquals("Numerator should remain unchanged when setting denominator", 0, rational.getNumerator());
        assertEquals("Denominator was not set and reduced correctly", 1, rational.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testSetZeroDenominator() {
        Rational rational = new Rational();
        rational.setDenominator(0);
    }
}
