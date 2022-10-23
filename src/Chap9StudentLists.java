import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * A class to keep track of lists of students. Instances get an implicit ID via their insertion into the
 * static ArrayList "classes," with which a new class can be created
 */
public class Chap9StudentLists {
    static ArrayList<Chap9StudentLists> classes = new ArrayList<>(8);
    private final HashSet<String> students;

    /**
     * @param students
     */
    public Chap9StudentLists(HashSet<String> students) {
        this.students = students;
        classes.add(this);
    }

    /**
     * Constructor from existing class
     *
     * @param id               to pull starting class list from
     * @param studentsToAdd    set of students to add to existing class list
     * @param studentsToRemove set of students to remove from existing class list
     * @throws InvalidParameterException if class at index id is not found
     */
    public Chap9StudentLists(Integer id, Set<String> studentsToAdd, Set<String> studentsToRemove) throws InvalidParameterException {
        try {
            students = new HashSet<>(classes.get(id).students);
        } catch (IndexOutOfBoundsException e) {
            throw new InvalidParameterException("No class with id " + id + " exists.");
        }

        students.removeAll(studentsToRemove);
        students.addAll(studentsToAdd);

        classes.add(this);
    }

    /**
     * Getter
     *
     * @return students
     */
    public HashSet<String> getStudents() {
        return students;
    }

}
