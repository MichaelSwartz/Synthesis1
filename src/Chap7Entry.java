/**
 * This abstract class is the superclass of all entries in our rock-climbing guidebook
 */
public abstract class Chap7Entry {
    String name;

    /**
     * @return The reader-friendly type of the instance. Would be static but Java doesn't like mixing static methods with overrides
     */
    public String getTypeDescription() {return "Entry";}

    /**
     * Constructor
     * @param name Everything need a name!
     */
    public Chap7Entry(String name) {
        this.name = name;
    }
}
