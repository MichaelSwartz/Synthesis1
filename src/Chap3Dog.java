import java.util.Date;

/**
 * This class represents a dog, keeping track of its name, date of birth, and weight.
 */
public class Chap3Dog {
    private final Date dateOfBirth;  // final because a dog's date of birth does not change
    private final String name;
    private int weightPounds;


    /**
     * Constructor that calls the setWeightPounds to ensure that restrictions on weight cannot be bypassed.
     *
     * @param date_of_birth
     * @param name
     * @param weightPounds
     */
    public Chap3Dog(Date date_of_birth, String name, int weightPounds) {
        this.dateOfBirth = date_of_birth;
        this.name = name;
        setWeightPounds(weightPounds);
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getName() {
        return name;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    /**
     * @param weightPounds Setter provides controlled access to the dog's weight, preventing it from being set to invalid
     *                     value
     * @throws IllegalArgumentException if weight <= 0
     */
    public void setWeightPounds(int weightPounds) throws IllegalArgumentException {
        if (weightPounds <= 0) {
            throw new IllegalArgumentException("Weight cannot be 0 or negative");
        }

        this.weightPounds = weightPounds;
    }
}
