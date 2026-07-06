import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getGreeting_shouldReturnHello() {
        String result = Main.getGreeting();

        assertEquals("Hallo", result);
    }

    @Test
    void add_shouldReturnSum() {
        int result = Main.add(5, 2);

        assertEquals(7, result);
    }

    @Test
    void calculateArea_shouldReturnArea() {
        double result = Main.calculateArea(5, 2);

        assertEquals(10.0, result);
    }

    @Test
    void checkPositive_shouldReturnFalseForNegativeNumber() {
        boolean result = Main.checkPositive(-2);

        assertFalse(result);
    }

    @Test
    void checkPositive_shouldReturnTrueForPositiveNumber() {
        boolean result = Main.checkPositive(5);

        assertTrue(result);
    }
}