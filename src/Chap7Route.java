/**
 * One subclass of Climb is Route -- a longer climb typically done with a rope
 */
public class Chap7Route extends Chap7Climb {
    private final String grade;
    private final Chap7Area<Chap7Route> area;

    /**
     * Constructor!
     * @param name Still everything needs one!
     * @param grade Route grades are strings like "8", "9+", "11a", or "12c/d".
     * @param area The area where the climb is located
     */
    public Chap7Route(String name, String grade, Chap7Area<Chap7Route> area) {
        super(name);
        this.grade = grade;
        this.area = area;
        area.addToMemberEntries(this);
    }

    /**
     * @return The string "Route" for use in the area toString method
     */
    @Override
    public String getTypeDescription() {
        return "Route";
    }

    /**
     * @return The grade prefixed with "5.", which indicates that it's technical climbing route
     */
    @Override
    public String getGrade() {
        return "5." + grade;
    }

    /**
     * @return String representation of the name and grade
     */
    @Override
    public String toString() {
        return "Route " + name + ", grade: " + getGrade();
    }


}
