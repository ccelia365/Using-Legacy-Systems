package edu.bu.met.cs665;

import edu.bu.met.cs665.usingLegacySystems.*;

/**
 * Name: Cecilia Chacko
 * Date: 10/31/2022
 * Description: This class outputs customer data stored on external disk through the old system,
 * data stored on external server through the new system, and data stored on an
 * external server though the old system.
 */
public class Main {

    public static void main(String[] args) {

        // Creating different customers

        Customer cust1 = new Customer("Anne Shirley", "123 Green Gables",
                "anne.shirley@gmail.com", "Credit Card");

        Customer cust2 = new Customer("Diana Barry", "345 Pleasant St",
                "diana.barry@yahoo.com", "Debit Card");

        Customer cust3 = new Customer("John Snow", "64 Wildling Lane",
                "john_snow@outlook.com", "Cash");

        Customer cust4 = new Customer("Marilla Cuthbert", "123 Green Gables",
                "marilla_cuthbert@gmail.com", "Credit Card");

        // Storing customer information to the company HashMap

        Company.addCustomerInformation(cust1);
        Company.addCustomerInformation(cust2);
        Company.addCustomerInformation(cust3);
        Company.addCustomerInformation(cust4);

        // Get customer IDs

        CustomerID cust1ID = cust1.getCustomerID();
        CustomerID cust2ID = cust2.getCustomerID();
        CustomerID cust3ID = cust3.getCustomerID();
        CustomerID cust4ID = cust4.getCustomerID();

        CustomerData customerDataFromDisk = new CustomerDataFromDisk();
        CustomerDataOverHTTPS customerDateFromServer = new CustomerDataFromServer();
        CustomerData adaptedCustomerData = new Adapter(customerDateFromServer);

        // Outputs customer data from external disk through the old system and
        // data from external server through the new system

        System.out.println(customerDataFromDisk.getCustomer_withUSBConnect(cust1ID));
        System.out.println(customerDateFromServer.getCustomer_withHTTPSConnect(cust2ID));
        System.out.println(customerDataFromDisk.getCustomer_withUSBConnect(cust3ID));
        System.out.println(customerDateFromServer.getCustomer_withHTTPSConnect(cust4ID));

        System.out.println("----------------------------------------------------------------------------------");

        // Outputs customer data stored on external server through the old system

        System.out.println(adaptedCustomerData.getCustomer_withUSBConnect(cust1ID));
        System.out.println(adaptedCustomerData.getCustomer_withUSBConnect(cust2ID));
        System.out.println(adaptedCustomerData.getCustomer_withUSBConnect(cust3ID));
        System.out.println(adaptedCustomerData.getCustomer_withUSBConnect(cust4ID));

    }

}
