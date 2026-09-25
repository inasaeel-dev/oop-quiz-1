package id.ac.polinema.oop;

/**
 * A cafe customer.
 *
 * Complete every method body below (replace the
 * {@code throw new UnsupportedOperationException(...)} lines).
 * Do not change the class name, field names, method names, or signatures.
 *
 * Declare the fields yourself: see the class diagram in the README
 * (all fields must be private).
 */
public class Customer {
    String customerID;
    String name;
    /**
     * Creates a customer and stores both parameters into the fields.
     *
     * @param customerId customer identifier
     * @param name       customer's namee
     */
    public Customer(String customerId, String name) {
        this.customerID = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    /**
     * Updates the name. A null or blank name is invalid:
     * ignore it and leave the field unchanged.
     *
     * @param name new name
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
}