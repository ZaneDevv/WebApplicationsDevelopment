import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(4, 2));
    }

    @Test
    void testDivideBy0() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(4, 0);
        });
    }
}