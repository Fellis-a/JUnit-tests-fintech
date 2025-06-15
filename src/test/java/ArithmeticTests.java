import org.junit.*;
import static org.junit.Assert.*;

public class ArithmeticTests {

    private Rational half() {
        return new Rational(1, 2);
    }

    private Rational third() {
        return new Rational(1, 3);
    }

    private Rational twoThirds() {
        return new Rational(2, 3);
    }

    private Rational rational(int numerator, int denominator) {
        return new Rational(numerator, denominator);
    }

    @Test
    public void testAddition() {
        Rational result = half().plus(third());
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testSubtraction() {
        Rational result = half().minus(third());
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testMultiplication() {
        Rational result = half().multiply(twoThirds());
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testDivision() {
        Rational result = half().divide(twoThirds());
        assertEquals(3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Rational zero = new Rational(0, 1);
        half().divide(zero);
    }

    @Test
    public void testAdditionWithNegative() {
        Rational firstNumber = rational(-1, 2);
        Rational secondNumber = third();
        Rational result = firstNumber.plus(secondNumber);
        assertEquals(-1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }
}
