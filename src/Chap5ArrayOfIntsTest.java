/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Chap5ArrayOfIntsTest {
    final Random rand = new Random();

    @Test
    void constructorAndDescription() {
        final String initialDescription = "Numbers of pancakes I would like to eat on future days";
        Chap5ArrayOfInts pancakeCounts = new Chap5ArrayOfInts(initialDescription, new int[]{8, 47, 99, 134});
        assertEquals(pancakeCounts.getDescription(), initialDescription);
        assertArrayEquals(pancakeCounts.getNumbers(), new int[]{8, 47, 99, 134});

        pancakeCounts.setDescription("Numbers of pancakes I wish I'd already eaten on various days");
        assertEquals(pancakeCounts.getDescription(), "Numbers of pancakes I wish I'd already eaten on various days");
    }

    @Test
    void multiply() {
        final String initialDescription = "Numbers of kittens I would like to pet on future days";
        Chap5ArrayOfInts kittenPettingPlans = new Chap5ArrayOfInts(initialDescription, new int[]{1, 2, 3});

//        an explicit test to make sure we're not using the same faulty logic in both the test and the implementation
        kittenPettingPlans.multiply(2);
        assertArrayEquals(kittenPettingPlans.getNumbers(), new int[]{2, 4, 6});

//        loop through and test that every element was modified correctly with every random multiplier
//        doing this 100 times will likely result in multiple overflows, but that's ok as the test will behave in the same
//        way as the implementation
        for (int i = 0; i < 100; i++) {
            int[] expectedValues = kittenPettingPlans.getNumbers().clone();
            int multiplier = rand.nextInt();
            kittenPettingPlans.multiply(multiplier);

            for (int j = 0; j < expectedValues.length; j++) {
                expectedValues[j] = expectedValues[j] * multiplier;
            }

            assertArrayEquals(expectedValues, kittenPettingPlans.getNumbers());
        }
    }

    @Test
    void divide() {
        final String initialDescription = "Numbers of alligators I would like to pet on future days";
        Chap5ArrayOfInts alligatorPettingPlans = new Chap5ArrayOfInts(initialDescription, new int[]{500004444, 40990000, 301010101});

//        an explicit test to make sure we're not using the same faulty logic in both the test and the implementation
        alligatorPettingPlans.divide(2);
        assertArrayEquals(alligatorPettingPlans.getNumbers(), new int[]{250002222, 20495000, 150505050});

//        loop through and test that every element was modified correctly with every random divisor
        for (int i = 0; i < 100; i++) {
            int[] expectedValues = alligatorPettingPlans.getNumbers().clone();
            int divisor = rand.nextInt();
            alligatorPettingPlans.divide(divisor);

            for (int j = 0; j < expectedValues.length; j++) {
                expectedValues[j] = expectedValues[j] / divisor;
            }

            assertArrayEquals(expectedValues, alligatorPettingPlans.getNumbers());
        }
    }
}