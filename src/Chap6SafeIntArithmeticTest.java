import org.junit.jupiter.api.Test;
import java.security.InvalidParameterException;
import static org.junit.jupiter.api.Assertions.*;

class Chap6SafeIntArithmeticTest {

    @Test
    void add() {
        Chap6SafeIntArithmetic math = new Chap6SafeIntArithmetic();
        assertEquals(math.add("27", "5"), 32);
        assertThrows(InvalidParameterException.class, () -> math.add("27", "otherStuff"));
    }

    @Test
    void subtract() {
        Chap6SafeIntArithmetic math = new Chap6SafeIntArithmetic();
        assertEquals(math.subtract("27", "5"), 22);
        assertThrows(InvalidParameterException.class, () -> math.subtract("27", "5.9898.8"));
    }

    @Test
    void multiply() {
        Chap6SafeIntArithmetic math = new Chap6SafeIntArithmetic();
        assertEquals(math.multiply("27", "5"), 135);
        assertThrows(InvalidParameterException.class, () -> math.multiply("27dogs", "5.9898.8"));
    }

    @Test
    void divide() {
        Chap6SafeIntArithmetic math = new Chap6SafeIntArithmetic();
        assertEquals(math.divide("27", "5"), 5);
        assertThrows(InvalidParameterException.class, () -> math.divide("27", "5.9898.8"));
        assertThrows(InvalidParameterException.class, () -> math.divide("27", "0"));
    }
}