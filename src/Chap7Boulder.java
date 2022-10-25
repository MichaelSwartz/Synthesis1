/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


/**
 * One subclass of Climb is Boulder -- a short climb typically done without a rope
 */
public class Chap7Boulder extends Chap7Climb {
    private final int grade;

    /**
     * Constructor!
     * @param name Still everything needs one!
     * @param grade Boulder grades are integers
     * @param area The area where the climb is located
     */
    public Chap7Boulder(String name, int grade, Chap7Area<Chap7Boulder> area) {
        super(name);
        this.grade = grade;
        area.addToMemberEntries(this);
    }

    /**
     * @return The string "Boulder" for use in the area toString method
     */
    @Override
    public String getTypeDescription() {
        return "Boulder";
    }

    /**
     * @return the numeric grade prefixed with a V, as boulder grades are traditionally rated
     */
    @Override
    public String getGrade() {
        return "V" + grade;
    }

    /**
     * @return String representation of the name and grade
     */
    @Override
    public String toString() {
        return "Boulder " + name + ", grade: " + getGrade();
    }
}
