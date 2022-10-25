/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


import java.util.Arrays;
import java.util.HashSet;

public class Chap9Driver {
    /**
     * Driver for Chapter 9 practical
     * @param args not used
     */
    public static void main(String[] args) {
        // make one class with some Hamilton characters
        Chap9StudentList firstClass = new Chap9StudentList(new HashSet<>(Arrays.asList("John", "Mulligan", "Lafayette")));

        // make a second class from the members of the first -- but add Hamilton and remove Lafayette
        Chap9StudentList secondClass = new Chap9StudentList(
                firstClass.getIndex(),
                new HashSet<>(Arrays.asList("Hamilton")),
                new HashSet<>(Arrays.asList("Lafayette"))
        );

        // make a third class from the members of the second, but remove the members shared with the first
        // and add some others manually
        new Chap9StudentList(
                secondClass.getIndex(),
                new HashSet<>(Arrays.asList("Washington", "Eliza", "Angelica")),
                firstClass.getStudents()
        );

        // show what's in them all:
        for (Chap9StudentList studentList : Chap9StudentList.classes) {
            System.out.println(studentList);
        } // output below
    }
}

/*
Chap9StudentList{students=[Mulligan, Lafayette, John], index=0}
Chap9StudentList{students=[Mulligan, Hamilton, John], index=1}
Chap9StudentList{students=[Eliza, Hamilton, Angelica, Washington], index=2}
 */
