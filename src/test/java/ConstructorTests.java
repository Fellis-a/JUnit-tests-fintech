import org.junit.*;
import static org.junit.Assert.*;

public class ConstructorTests {

    private Rational rational(int numerator, int denominator) {
        return new Rational(numerator, denominator);
    }

    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void testParametrizedConstructor() {
        Rational parametrized = rational(3, 4);
        assertEquals(3, parametrized.getNumerator());
        assertEquals(4, parametrized.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testZeroDenominatorConstructor() {
        new Rational(1, 0);
    }

    @Test
    public void testReduction() {
        Rational reducedRational = rational(10, 20);
        assertEquals(1, reducedRational.getNumerator());
        assertEquals(2, reducedRational.getDenominator());
    }

    @Test
    public void testNegativeReduction() {
        Rational reducedRational = rational(-3, -9);
        assertEquals(1, reducedRational.getNumerator());
        assertEquals(3, reducedRational.getDenominator());
    }

    @Test
    public void testNegativeNumeratorReduction() {
        Rational reducedRational = rational(3, -9);
        assertEquals(-1, reducedRational.getNumerator());
        assertEquals(3, reducedRational.getDenominator());
    }

    @Test
    public void testCreationWithZeroNumeratorNegativeDenominator() {
        Rational rational = rational(0, -1);
        assertEquals(0, rational.getNumerator());
        assertEquals(1, rational.getDenominator());
    }
}
