package edu.bu.met.cs665.usingLegacySystems;

/**
 * Name: Cecilia Chacko
 * Date: 10/31/2022
 * Description: This class implements the target interface CustomerData for the Adaptor pattern.
 * It represents the adaptor for the Adaptor pattern.
 */
public class Adapter implements CustomerData {

    private CustomerDataOverHTTPS customerDataOverHTTPS;

    /**
     * The Constructor gets a reference to the object being adapted.
     *
     * @param customerDataOverHTTPS the adaptee class CustomerDataOverHTTPS
     */
    public Adapter(CustomerDataOverHTTPS customerDataOverHTTPS) {
        this.customerDataOverHTTPS = customerDataOverHTTPS;
    }

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
     * Adaptor method returns customer data over HTTPS connection.
     *
     * @param id - id of the customer
     * @return customer data given customer id
     */
    @Override
    public String getCustomer_withUSBConnect(CustomerID id) {
        return customerDataOverHTTPS.getCustomer_withHTTPSConnect(id);
    }
}
