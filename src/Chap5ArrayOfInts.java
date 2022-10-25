/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


import java.util.function.IntBinaryOperator;

/**
 * Holds an array of integers and a description
 * Performs multiplication and integer division on all elements of the array
 */
public class Chap5ArrayOfInts {
    private final int[] numbers;
    private String description;

    /**
     * Constructor
     *
     * @param description to set as description
     * @param numbers     to set as numbers
     */
    public Chap5ArrayOfInts(String description, int[] numbers) {
        this.description = description;
        this.numbers = numbers;
    }

    /**
     * Helper method that takes an operation and a second value and executes the operation on each element of the array
     * in place, with the second value as the other input to the operation
     *
     * @param operator   to perform on elements
     * @param otherValue to provide second input
     */
    private void applyOperationToNumbers(IntBinaryOperator operator, int otherValue) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = operator.applyAsInt(numbers[i], otherValue);
        }
    }

    /**
     * getter
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * setter
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter
     *
     * @return numbers
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Multiplies each element of numbers by the other param
     *
     * @param other to multiply by
     */
    public void multiply(int other) {
        applyOperationToNumbers(((x, y) -> x * y), other);
    }

    /**
     * Divides each element of numbers by the other param. Uses integer division -- rounds down if result not an int
     *
     * @param other to divide by.
     */
    public void divide(int other) {
        if (other == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        applyOperationToNumbers(((x, y) -> x / y), other);
    }
}
