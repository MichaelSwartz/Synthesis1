import java.util.Random;

/**
 * Thie class represents items that are sold with an arbitrary price multiplied by a random value!
 */
public class Chap8ByRandomness implements Chap8Item {
    final static Random rand = new Random();

    private float weight;
    private float basePrice;
    private String name;

    public Chap8ByRandomness(float weight, float basePrice, String name) {
        this.weight = weight;
        this.basePrice = basePrice;
        this.name = name;
    }

    /**
     * Getrer
     *
     * @return weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Setter
     *
     * @param weight new val
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Getter
     *
     * @return pricePerWeight
     */
    public float getBasePrice() {
        return basePrice;
    }

    /**
     * Setter
     *
     * @param basePrice new value
     */
    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * Getter
     *
     * @return price from weight and pricePerWeight
     */
    @Override
    public float getPrice() {
        return basePrice * rand.nextFloat((float) .01, 100);
    }

    /**
     * Getter
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     *
     * @param name - new name
     */
    public void setName(String name) {
        this.name = name;
    }
}
