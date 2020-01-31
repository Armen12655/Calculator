import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + " " + testInfo.getDisplayName());
    }

    @DisplayName("Checking add method")
    @Test
    public void testAdd() {
        double result = Calculator.add(10, 50);
        assertEquals(60, result, 0);
    }

    @DisplayName("Checking subtraction method")
    @Test
    public void testSub() {
        double result = Calculator.sub(10, 50);
        assertEquals(-40, result, 0);
    }

    @DisplayName("Checking Multiply method")
    @Test
    public void testMultiply() {
        double result = Calculator.multiply(10, 50);
        assertEquals(500, result, 0);
    }

    @DisplayName("Checking Divide method")
    @Test
    public void testDivide() {
        double result = Calculator.divide(10, 50);
        assertEquals(0, result, 0);
    }
}
