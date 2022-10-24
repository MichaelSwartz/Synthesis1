public class Chap7Driver {
    public static void main(String[] args) {
//        Create our top super-area
        Chap7Area<Chap7Area> rumney = new Chap7Area<>("Rumney", null);
        // provide some child areas -- this one takes more areas as children
        Chap7Area<Chap7Area> mainCliff = new Chap7Area<>("Main Cliff", rumney);
        // and these sub areas take Routes as children
        Chap7Area<Chap7Route> ironMan = new Chap7Area<>("Iron Man Wall", mainCliff);
        Chap7Area<Chap7Route> armedAndDangerous = new Chap7Area<>("Armed & Dangerous Wall", mainCliff);

        // Now we'll populate those areas with routes:
        new Chap7Route("Peanut Man", "12a", ironMan);
        new Chap7Route("Know Ethics", "11a", ironMan);
        new Chap7Route("Underdog", "10a", ironMan);
        new Chap7Route("Cereal Killer", "11c", armedAndDangerous);

        // And we'll create another sub area, this one for boulders
        Chap7Area<Chap7Boulder> blackJackBoulders = new Chap7Area<>("Black Jack Boulders", rumney);
        // And populate it with some boulders
        new Chap7Boulder("Black Jack Crack", 2, blackJackBoulders);
        new Chap7Boulder("Rain Man", 4, blackJackBoulders);

        // now let's print out some representations -- first of just a small area:
        System.out.print(ironMan);

        System.out.println("____________________");
        // and next we'll print everything from the super-area, Rumney
        System.out.print(rumney);
        // results below

    }
}
// Note that with more time I would clean this up -- add some indenting to make the nesting clearer, and remove the
// "at" parts of children when accessing from parent

/*
Iron Man Wall
 at Main Cliff
 at Rumney

Member Routes:
Route Peanut Man, grade: 5.12a
Route Know Ethics, grade: 5.11a
Route Underdog, grade: 5.10a
____________________
Rumney

Member Areas:
Main Cliff
 at Rumney

Member Areas:
Iron Man Wall
 at Main Cliff
 at Rumney

Member Routes:
Route Peanut Man, grade: 5.12a
Route Know Ethics, grade: 5.11a
Route Underdog, grade: 5.10a

Armed & Dangerous Wall
 at Main Cliff
 at Rumney

Member Routes:
Route Cereal Killer, grade: 5.11c


Black Jack Boulders
 at Rumney

Member Boulders:
Boulder Black Jack Crack, grade: V2
Boulder Rain Man, grade: V4
 */
