/**
 * Driver for Chapter 8
 */
public class Chap8Driver {
    /**
     * The main event!
     * @param args unused
     */
    public static void main(String[] args) {
        // Our store needs some items to sell
        Chap8ByWeight strawberries = new Chap8ByWeight(10, 4, "Strawberries");
        Chap8ByRandomness bitcoin = new Chap8ByRandomness(0, 300, "Bitcoin");
        Chap8ByRandomness horseMeat = new Chap8ByRandomness(200, 3, "Horse meat");

        Chap8Item[] itemsForSale = new Chap8Item[]{strawberries, bitcoin, horseMeat};

        // even though they're different subclasses, we can rely on their common interface's methods:
        for (Chap8Item item : itemsForSale) {
            System.out.println(item.getWeight() + " pounds of " + item.getName() + " costs " + item.getPrice() + " dollars today!");
        }
    }
}
