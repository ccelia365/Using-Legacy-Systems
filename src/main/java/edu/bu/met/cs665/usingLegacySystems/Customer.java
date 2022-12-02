package edu.bu.met.cs665.usingLegacySystems;

/**
 * Name: Cecilia Chacko
 * Date: 10/31/2022
 * Description: This class creates a Customer.
 */
public class Customer {

    private String name;
    private String address;
    private String email;
    private String paymentMethod;
    private CustomerID id;

    /**
     * Constructor initializes a Customer.
     *
     * @param name          - the name of the customer
     * @param address       - the address of the customer
     * @param email         - the email of the customer
     * @param paymentMethod - the payment method used by the customer
     */
    public Customer(String name, String address, String email, String paymentMethod) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.paymentMethod = paymentMethod;
        this.id = new CustomerID();
    }

    /**
     * Method returns the id of the customer.
     *
     * @return id of the customer
     */
    public CustomerID getCustomerID() {
        return this.id;
    }

    /**
     * Returns a string representation of the customer.
     *
     * @return a string representation of the customer
     */
    public String toString() {
        return "\n" + this.name
                + "\n" + this.address
                + "\n" + this.email
                + "\n" + this.paymentMethod;
    }


}
