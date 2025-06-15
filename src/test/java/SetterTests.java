import org.junit.*;
import static org.junit.Assert.*;

public class SetterTests {

    @Test
    public void testSetNumerator() {
        Rational rational = new Rational();
        rational.setNumerator(5);
        assertEquals(5, rational.getNumerator());
        assertEquals(1, rational.getDenominator());
    }

    @Test
    public void testSetDenominator() {
        Rational rational = new Rational();
        rational.setDenominator(5);
        assertEquals(0, rational.getNumerator());
        assertEquals(1, rational.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testSetZeroDenominator() {
        Rational rational = new Rational();
        rational.setDenominator(0);
    }
}
