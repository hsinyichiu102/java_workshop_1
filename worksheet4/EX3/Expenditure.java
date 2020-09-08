/**
 * Write a minimal class Expenditure.java that represents an expenditure with the two field variables
 * @version 30-11-2019
 * @author hsin yi chiu
 */

public class Expenditure {

    private String description;
    private int value;

    /**
     * a constructor for the expenditure and have two variable
     * @param description to describe the the expenditure
     * @param value the cost of the expenditure
     */
    public Expenditure(String description, int value) {
        this.description = description;
        this.value = value;
    }

    /**
     * a getter of the Description to get the description
     * @return description as a String
     */
    public String getDescription() {
        return description;
    }

    /**
     * a setter of the Description to set a new description
     * @param description as a String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A getter for the value to get the corresponding value
     * @return value as int
     */
    public int getValue() {
        return value;
    }

    /**
     * a setter for the value to set the new value
     * @param value as int
     */
    public void setValue(int value) {
        this.value = value;
    }

}

