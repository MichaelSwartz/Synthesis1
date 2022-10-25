/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Area represents a place for climbing -- it can be a very large area, containing many nested sub-areas
 * Or it can be a single cliff or bouldering spot, containing a few Climbs (of subtype Boulder or Route)
 *
 * @param <M> Every area should contain members of just one type -- Area, Route, or Boulder
 */
public class Chap7Area<M extends Chap7Entry> extends Chap7Entry {
    private final Chap7Area<Chap7Area> superArea;  // enclosing area
    private final ArrayList<M> memberEntries;

    /**
     * Constructor
     *
     * @param name       everything needs one!
     * @param parentArea can be null, or another area. I thought I was being quite clever with Generic that could be
     *                   itself, but I can't figure out what to do about the warning that the inner type is "a raw use
     *                   of parameterized type" -- even though the nested type doesn't matter at all
     */
    public Chap7Area(String name, Chap7Area<Chap7Area> parentArea) {
        super(name);
        this.superArea = parentArea;
        this.memberEntries = new ArrayList<>();
        if (parentArea != null) {
            parentArea.addToMemberEntries(this);
        }
    }

    /**
     * @return A type description including the type of the members, if they're of type Climb.
     * That part only works if there's at least one member -- otherwise returns "Area"
     */
    @Override
    public String getTypeDescription() {
        if (memberEntries.size() != 0 && memberEntries.get(0) instanceof Chap7Climb) {
            return memberEntries.get(0).getTypeDescription();
        }
        return "Area";
    }

    /**
     * @param newEntry to add to the members of the area
     */
    public void addToMemberEntries(M newEntry) {
        memberEntries.add(newEntry);
    }

    /**
     * @return A string representation that both adds all super-area names and nested members, recursively (recursively
     * in spirit, implemented with a loop).
     */
    @Override
    public String toString() {
        StringJoiner description = new StringJoiner(System.getProperty("line.separator"));

        description.add(name);

        Chap7Area parentArea = superArea;
        while (parentArea != null) {
            description.add(" at " + parentArea.name);
            parentArea = parentArea.superArea;
        }

        description.add(""); // empty line
        description.add("Member " + getTypeDescription() + "s:");

        for (M member : memberEntries) {
            description.add(member.toString());
        }

        description.add(""); // empty line

        return String.valueOf(description);
    }
}
