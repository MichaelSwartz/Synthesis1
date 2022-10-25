/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


/**
 * This class represents items that are sold by weight
 */
public class Chap8ByWeight implements Chap8Item {
    private float weight;
    private float pricePerWeight;
    private String name;

    public Chap8ByWeight(float weight, float pricePerWeight, String name) {
        this.weight = weight;
        this.pricePerWeight = pricePerWeight;
        this.name = name;
    }

    /**
     * Getter
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
    public float getPricePerWeight() {
        return pricePerWeight;
    }

    /**
     * Setter
     *
     * @param pricePerWeight new value
     */
    public void setPricePerWeight(float pricePerWeight) {
        this.pricePerWeight = pricePerWeight;
    }

    /**
     * Getter
     *
     * @return price from weight and pricePerWeight
     */
    @Override
    public float getPrice() {
        return weight * pricePerWeight;
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
