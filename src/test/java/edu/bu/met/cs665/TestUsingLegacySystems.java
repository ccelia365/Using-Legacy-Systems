package edu.bu.met.cs665;

import edu.bu.met.cs665.usingLegacySystems.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Name: Cecilia Chacko
 * Date: 10/31/2022
 * Description: This class tests the customer data from the company's old and new systems. It also
 * tests customer data stored on an external server though the old system.
 */

public class TestUsingLegacySystems {

    Customer cust1 = new Customer("Anne Shirley", "123 Green Gables",
            "anne.shirley@gmail.com", "Credit Card");

    Customer cust2 = new Customer("Diana Barry", "345 Pleasant St",
            "diana.barry@yahoo.com", "Debit Card");

    Customer cust3 = new Customer("John Snow", "64 Wildling Lane",
            "john_snow@outlook.com", "Cash");

    Customer cust4 = new Customer("Marilla Cuthbert", "123 Green Gables",
            "marilla_cuthbert@gmail.com", "Credit Card");


    @Test
    public void testCustomerDataFromDisk() {

        Company.addCustomerInformation(cust1);
        Company.addCustomerInformation(cust2);

        CustomerData customerDataFromDisk = new CustomerDataFromDisk();

        CustomerID cust1ID = cust1.getCustomerID();

        String customer1 = "\n" + "Anne Shirley"
                + "\n" + "123 Green Gables"
                + "\n" + "anne.shirley@gmail.com"
                + "\n" + "Credit Card";

        assertEquals(customerDataFromDisk.getCustomer_withUSBConnect(cust1ID), customer1);

        CustomerID cust2ID = cust2.getCustomerID();

        String customer2 = "\n" + "Diana Barry"
                + "\n" + "345 Pleasant St"
                + "\n" + "diana.barry@yahoo.com"
                + "\n" + "Debit Card";

        assertEquals(customerDataFromDisk.getCustomer_withUSBConnect(cust2ID), customer2);

    }

    @Test
    public void testCustomerDataFromServer() {

        Company.addCustomerInformation(cust3);
        Company.addCustomerInformation(cust4);

        CustomerDataOverHTTPS customerDateFromServer = new CustomerDataFromServer();

        CustomerID cust3ID = cust3.getCustomerID();

        String customer3 = "\n" + "John Snow"
                + "\n" + "64 Wildling Lane"
                + "\n" + "john_snow@outlook.com"
                + "\n" + "Cash";

        assertEquals(customerDateFromServer.getCustomer_withHTTPSConnect(cust3ID), customer3);

        CustomerID cust4ID = cust4.getCustomerID();

        String customer4 = "\n" + "Marilla Cuthbert"
                + "\n" + "123 Green Gables"
                + "\n" + "marilla_cuthbert@gmail.com"
                + "\n" + "Credit Card";

        assertEquals(customerDateFromServer.getCustomer_withHTTPSConnect(cust4ID), customer4);

    }

    @Test
    public void testAdapter() {

        Company.addCustomerInformation(cust2);
        Company.addCustomerInformation(cust3);

        CustomerDataOverHTTPS customerDateFromServer = new CustomerDataFromServer();
        CustomerData adaptedCustomerData = new Adapter(customerDateFromServer);

        CustomerID cust2ID = cust2.getCustomerID();

        String customer2 = "\n" + "Diana Barry"
                + "\n" + "345 Pleasant St"
                + "\n" + "diana.barry@yahoo.com"
                + "\n" + "Debit Card";

        assertEquals(adaptedCustomerData.getCustomer_withUSBConnect(cust2ID), customer2);

        CustomerID cust3ID = cust3.getCustomerID();

        String customer3 = "\n" + "John Snow"
                + "\n" + "64 Wildling Lane"
                + "\n" + "john_snow@outlook.com"
                + "\n" + "Cash";

        assertEquals(adaptedCustomerData.getCustomer_withUSBConnect(cust3ID), customer3);


    }


}
