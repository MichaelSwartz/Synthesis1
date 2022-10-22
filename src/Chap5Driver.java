import java.util.Arrays;

public class Chap5Driver {
    public static void main(String[] args) {
        // Call consctructor
        Chap5ArrayOfInts hoursItsFeltLikeIveBeenWorkingOnThisAssignmentByDay = new Chap5ArrayOfInts("So many hours!", new int[]{1, 2, 3, 7, 100, 7000});

        hoursItsFeltLikeIveBeenWorkingOnThisAssignmentByDay.setDescription("So, so many hours!");

        // print all the numbers
        System.out.println(Arrays.toString(hoursItsFeltLikeIveBeenWorkingOnThisAssignmentByDay.getNumbers()));

        // multiply them all by 17, print again
        hoursItsFeltLikeIveBeenWorkingOnThisAssignmentByDay.multiply(17);
        System.out.println(Arrays.toString(hoursItsFeltLikeIveBeenWorkingOnThisAssignmentByDay.getNumbers()));

        // divide them all by 2 (integer division), print again
        hoursItsFeltLikeIveBeenWorkingOnThisAssignmentByDay.divide(2);
        System.out.println(Arrays.toString(hoursItsFeltLikeIveBeenWorkingOnThisAssignmentByDay.getNumbers()));
    }
}
