import org.junit.*;
import static org.junit.Assert.*;

public class ToStringTests {

    private Rational rational(int numerator, int denominator) {
        return new Rational(numerator, denominator);
    }

    @Test
    public void testToStringPositive() {
        assertEquals("toString returns wrong result for positive fraction", "3/4", rational(3, 4).toString());
    }

    @Test
    public void testToStringNegative() {
        assertEquals("toString returns wrong result for negative fraction", "-3/4", rational(-3, 4).toString());
    }

    @Test
    public void testToStringZero() {
        assertEquals("toString returns wrong result for zero numerator", "0/1", rational(0, 5).toString());
    }

    @Test
    public void testToStringReduction() {
        assertEquals("toString returns wrong result after reduction", "1/2", rational(5, 10).toString());
    }
}
