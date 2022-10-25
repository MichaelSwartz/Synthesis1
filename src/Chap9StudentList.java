/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * A class to keep track of lists of students. Instances get an implicit ID via their insertion into the
 * static ArrayList "classes," with which a new class can be created
 */
public class Chap9StudentList {
    static ArrayList<Chap9StudentList> classes = new ArrayList<>(4);
    private final HashSet<String> students;

    /**
     * Getter
     * @return index
     */
    public int getIndex() {
        return index;
    }

    private final int index;

    /**
     * @param students
     */
    public Chap9StudentList(HashSet<String> students) {
        this.students = students;
        classes.add(this);
        index = classes.size() - 1;
    }

    /**
     * Constructor from existing class
     *
     * @param id               to pull starting class list from
     * @param studentsToAdd    set of students to add to existing class list
     * @param studentsToRemove set of students to remove from existing class list
     * @throws InvalidParameterException if class at index id is not found
     */
    public Chap9StudentList(Integer id, Set<String> studentsToAdd, Set<String> studentsToRemove) throws InvalidParameterException {
        try {
            students = new HashSet<>(classes.get(id).students);
        } catch (IndexOutOfBoundsException e) {
            throw new InvalidParameterException("No class with id " + id + " exists.");
        }

        students.removeAll(studentsToRemove);
        students.addAll(studentsToAdd);

        classes.add(this);
        index = classes.size() - 1;
    }

    /**
     * Getter
     *
     * @return students
     */
    public HashSet<String> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Chap9StudentList{" +
                "students=" + students +
                ", index=" + index +
                '}';
    }
}
