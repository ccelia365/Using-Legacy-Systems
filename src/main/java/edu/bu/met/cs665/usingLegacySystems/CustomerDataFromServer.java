package edu.bu.met.cs665.usingLegacySystems;

/**
 * Name: Cecilia Chacko
 * Date: 10/31/2022
 * Description: This class implements the adaptee interface CustomerDataOverHTTPS for the Adaptor pattern.
 */
public class CustomerDataFromServer implements CustomerDataOverHTTPS {

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
     * Method returns customer data over HTTPS connection.
     *
     * @param id - id of the customer
     * @return customer data given customer id
     */
    @Override
    public String getCustomer_withHTTPSConnect(CustomerID id) {
        return Company.getCompanyCustomers().get(id).toString();
    }
}
