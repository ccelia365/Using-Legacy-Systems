package edu.bu.met.cs665.usingLegacySystems;

/**
 * Name: Cecilia Chacko
 * Date: 10/31/2022
 * Description: This class implements the target interface CustomerData for the Adaptor pattern.
 */
public class CustomerDataFromDisk implements CustomerData {

    /**
     * Method prints customer data.
     *
     * @param id - id of the customer
     */
    @Override
    public void printCustomer(CustomerID id) {
        System.out.println(Company.getCompanyCustomers().get(id));
    }

    /**
     * Method returns customer data using a USB connection.
     *
     * @param id - id of the customer
     * @return customer data given customer id
     */
    @Override
    public String getCustomer_withUSBConnect(CustomerID id) {
        return Company.getCompanyCustomers().get(id).toString();
    }
}
