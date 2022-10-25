/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


import java.security.InvalidParameterException;

/**
 * A utility class to take strings, attempt to parse them as integers, and perform basic arithmetic on them
 */
public class Chap6SafeIntArithmetic {
    static private int parse(String input) throws InvalidParameterException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidParameterException("Inputs must be a valid integer, " + input + " cannot be parsed");
        }
    }

    /**
     * @param addendA first addend
     * @param addendB second addend
     * @return sum if valid ints
     * @throws InvalidParameterException if inputs cannot be parsed
     */
    public static int add(String addendA, String addendB) throws InvalidParameterException {
        return parse(addendA) + parse(addendB);
    }

    /**
     * @param minuend    starting number
     * @param subtrahend number to subtract from starting number
     * @return difference if valid ints
     * @throws InvalidParameterException if inputs cannot be parsed
     */
    public static int subtract(String minuend, String subtrahend) throws InvalidParameterException {
        return parse(minuend) - parse(subtrahend);
    }

    /**
     * @param factorA first factor
     * @param factorB second factor
     * @return product if valid ints
     * @throws InvalidParameterException if inputs cannot be parsed
     */
    public static int multiply(String factorA, String factorB) throws InvalidParameterException {
        return parse(factorA) * parse(factorB);
    }

    /**
     * Performs integer division -- rounds down if quotient not an integer
     * @param dividend dividend (starting number)
     * @param divisor  divisor (number dividing by)
     * @return quotient if valid ints
     * @throws InvalidParameterException if inputs cannot be parsed or if divisor = 0
     */
    public static int divide(String dividend, String divisor) throws InvalidParameterException {
        try {
            return parse(dividend) / parse(divisor);
        } catch (ArithmeticException e) {
            throw new InvalidParameterException("Cannot divide by 0");
        }
    }
}
