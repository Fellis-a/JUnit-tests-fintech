import org.junit.*;
import static org.junit.Assert.*;

public class ComparisonTests {

    private Rational rational(int numerator, int denominator) {
        return new Rational(numerator, denominator);
    }

    @Test
    public void testEquality() {
        assertEquals("Equality comparison failed for equal values", rational(1, 2), rational(1, 2));
    }

    @Test
    public void testInequality() {
        assertNotEquals("Inequality comparison failed for different values", rational(1, 2), rational(1, 3));
    }

    @Test
    public void testLess() {
        assertTrue("Less-than comparison failed for smaller value", rational(1, 3).less(rational(1, 2)));
    }

    @Test
    public void testLessOrEqual() {
        assertTrue("Less-or-equal comparison failed for equal values", rational(1, 2).lessOrEqual(rational(1, 2)));
    }

    @Test
    public void testEqualsWithNull() {
        Rational rational = rational(1, 2);
        assertNotEquals("Equality check failed when compared with null", null, rational);
    }
}
