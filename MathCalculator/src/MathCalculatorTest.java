import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathCalculatorTest {


    @Test
    public void gcd_tenAndFive() {
        MathCalculator calculator = new MathCalculator();
        assertEquals(5, calculator.gcd(5, 10));
    }

    @Test
    public void gcd_twentyAndTwelve() {
        MathCalculator calculator = new MathCalculator();
        assertEquals(4, calculator.gcd(20, 12));
    }


}
