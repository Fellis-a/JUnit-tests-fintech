import org.junit.*;
import static org.junit.Assert.*;

public class ComparisonTests {

    private Rational rational(int numerator, int denominator) {
        return new Rational(numerator, denominator);
    }

    @Test
    public void testEquality() {
        assertEquals(rational(1, 2), rational(1, 2));
    }

    @Test
    public void testInequality() {
        assertNotEquals(rational(1, 2), rational(1, 3));
    }

    @Test
    public void testLess() {
        assertTrue(rational(1, 3).less(rational(1, 2)));
    }

    @Test
    public void testLessOrEqual() {
        assertTrue(rational(1, 2).lessOrEqual(rational(1, 2)));
    }

    @Test
    public void testEqualsWithNull() {
        Rational rational = rational(1, 2);
        assertNotEquals(null, rational);
    }
}
