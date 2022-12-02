package edu.bu.met.cs665.usingLegacySystems;

/**
 * Name: Cecilia Chacko
 * Date: 10/31/2022
 * Description: This interface defines the Target for the Adapter pattern.
 */
public interface CustomerData {

    /**
     * Method prints customer data.
     *
     * @param id - id of the customer
     */
    public void printCustomer(CustomerID id);

    /**
     * Method returns customer data using a USB connection.
     *
     * @param id - id of the customer
     * @return customer data
     */
    public String getCustomer_withUSBConnect(CustomerID id);

}
