package edu.bu.met.cs665.usingLegacySystems;

import java.util.HashMap;

/**
 * Name: Cecilia Chacko
 * Date: 10/31/2022
 * Description: This class creates a Company.
 */
public class Company {

    private static HashMap<CustomerID, Customer> companyCustomers = new HashMap<>();

    /**
     * Method adds customer information to companyCustomers HashMap
     *
     * @param customer
     */
    public static void addCustomerInformation(Customer customer) {
        companyCustomers.put(customer.getCustomerID(), customer);
    }

    /**
     * Method returns a HashMap of the company's customers with CustomerID as the key
     * and Customer data as the value.
     *
     * @return a hashmap of the company's customers
     */
    public static HashMap<CustomerID, Customer> getCompanyCustomers() {
        return new HashMap<>(companyCustomers);
    }

}
