/**
 * This class represents a kitten, on behalf of chapter 4
 */
public class Chap4Kitten {
    private static int kittenCount = 0;  // this is a static var, useful for keeping track of
    // info about the class as a whole

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    private final String name; // dynamic var, specific to the instance

    /**
     *  a constructor! it calls a helper
     * @param name
     */
    public Chap4Kitten(String name) {
        this.name = cutifyName(name);
        kittenCount ++;
    }

    /**
     * A static method!
     * @return Number of kitties made
     */
    public static int getKittenCount() {
        return kittenCount;
    }

    /**
     * This is a static helper method!
     * @param name
     * @return A cuter name
     */
    private static String cutifyName(String name) {
        return name + "CuteKitty";
    }
}
