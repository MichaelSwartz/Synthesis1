/**
 * This is a documentation comment!
 * Here we'd include a description of the purpose of this class.
 * Anything in these comments will be included in auto-generated Javadocs
 */
public class Main {

    /**
     * This is also documentation comment!
     * Using the @symbols below is a standard way to communicate each of the below
     * aspects of a function, and will create components in the Javadoc
     *
     * @param bar a String that is expected to be "rad"
     * @return the String "rad"
     * @throws IllegalArgumentException if bar is not the String "rad"
     */
    public static String foo(String bar) throws IllegalArgumentException {
       // this is a single-line comment!  It can be its own line
        if (!(bar.equals("rad"))) {
            throw new IllegalArgumentException("Not rad!");
        } // this is another single-line - it can also be on the same line as code
        /*
        This is a multi-line comment that will not be included in Javadocs. Useful if
        you want to explain something very complicated in line, or want to include a
        haiku, which really benefits from multiple lines
         */

        return bar;  // So rad
    }
}