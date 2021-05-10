
import Adapters.MernisServerAdapter;

import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
         Customer customer = new Customer();
         customer.setFirstName("ÞEVVAL");
         customer.setLastName("ACET");
         customer.setDateOfBirh(new GregorianCalendar(2001, 9, 06).getTime());
         customer.setNationalityId("12345678910");
         StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServerAdapter());
         starbucksCustomerManager.save(customer);         
	}

}
