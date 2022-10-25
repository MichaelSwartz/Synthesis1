/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


import org.junit.jupiter.api.Test;
import java.security.InvalidParameterException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A rad test class for our Arithmetic utility
 */
class Chap6SafeIntArithmeticTest {

    @Test
    void add() {
        assertEquals(Chap6SafeIntArithmetic.add("27", "5"), 32);
        assertThrows(InvalidParameterException.class, () -> Chap6SafeIntArithmetic.add("27", "otherStuff"));
    }

    @Test
    void subtract() {
        assertEquals(Chap6SafeIntArithmetic.subtract("27", "5"), 22);
        assertThrows(InvalidParameterException.class, () -> Chap6SafeIntArithmetic.subtract("27", "5.9898.8"));
    }

    @Test
    void multiply() {
        assertEquals(Chap6SafeIntArithmetic.multiply("27", "5"), 135);
        assertThrows(InvalidParameterException.class, () -> Chap6SafeIntArithmetic.multiply("27dogs", "5.9898.8"));
    }

    @Test
    void divide() {
        assertEquals(Chap6SafeIntArithmetic.divide("27", "5"), 5);
        assertThrows(InvalidParameterException.class, () -> Chap6SafeIntArithmetic.divide("27", "5.9898.8"));
        assertThrows(InvalidParameterException.class, () -> Chap6SafeIntArithmetic.divide("27", "0"));
    }
}