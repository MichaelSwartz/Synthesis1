import org.junit.jupiter.api.Test;

import java.util.function.Predicate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Chap2IsAllATest {
    byte puppyCounter = 0;

    @Test
    void testAllTheThings() {
//        implicit casting, allowed because float is more precise than int
        float x = 10;
//        x here is a primitive! The float representation of 10. Stored right on the stack
//
//       x = 0.1 causes a type error, because .1 is by default a double ,which is more precise
//        and therefore would lose precision

//        This is explicit casting, where the type is put in parentheses right before the value to be cast
//        This is necessary if you want to go from bigger representation (in memory) to smaller
        int y = (int) 2.111;
        assertEquals(y, 2);
//        so it lopped off the decimal

//        some more primitives!
        assertNotEquals(true, false);
        Predicate<Integer> thingWeWontUse = z -> z > 7; // here's a non-primitive


//        here we explicitly cast a big number to a tiny data type. The range for a byte is -127 to 128, so here we're
//  wrapping around some 78 or so times!
        byte foo = (byte) 20003;
        assertEquals(foo, 35);
        foo -= 256;
        // subtract the full range...
        assertEquals(foo, 35);
        // ...back to 35! Sometimes folks call it underflow when we go around the bottom of the range

    }

    //        Ok let's show how that could be problematic, if we haven't already... let's say we have a method that counts
//        every time we see a cute puppy, and a puppyCounter var that we increment in that method
    void incrementPups() {
        puppyCounter += 1;
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Test
    void testPups() {
        IntStream range = IntStream.range(0, 200); // this is a non-primitive! stored on the heap

        //        ok now we watch 200 cute pups go by
        range.forEach(i -> incrementPups());
//        So now we should see the puppyCounter at 200, right?
        assertEquals(puppyCounter, -56);
        // of course not, silly overflow. Shoulda known we'd be counting hundreds of pups and used a bigger type like int
    }
}
