/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


/**
 * Abstract class representing any of the different types of climbs we'll log
 */
public abstract class Chap7Climb extends Chap7Entry {
    /**
     * @param name Everything needs one
     */
    public Chap7Climb(String name) {
        super(name);
    }

    /**
     * All climbs have a grade, the representation varies by type of climb
     * @return the grade as a string
     */
    public abstract String getGrade();
}
