/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


public class Chap4Driver {
    /**
     * This is a driver method! When we run this file, Java looks for a method with this name and
     * signature to run.
     *
     * @param args
     */
    public static void main(String[] args) {
        Chap4Kitten kittyRufus = new Chap4Kitten("Rufus");
        new Chap4Kitten("Eloise");
        System.out.println(kittyRufus.getName());  // -> RufusCuteKitty
        System.out.println(Chap4Kitten.getKittenCount());  // -> 2
    }
}
