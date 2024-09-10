import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    // Test for empty string
    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""), "Empty string should return 0");
    }

    // Test for a single number
    @Test
    public void testSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"), "Single number string should return the number itself");
    }

    // Test for two numbers
    @Test
    public void testTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,5"), "String with two numbers should return their sum");
    }
}
